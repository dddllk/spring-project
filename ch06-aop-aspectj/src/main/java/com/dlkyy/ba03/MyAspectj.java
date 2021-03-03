package com.dlkyy.ba03;

import com.dlkyy.ba02.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

/**
 * Created by dlkyy on 2021/3/2 21:20
 *
 *
 */
@Aspect
public class MyAspectj {
  /**
   * 环绕通知方法的定义格式：
   *  1.public
   *  2.必须有一个返回值
   *  3.方法名称自定义
   *  4.方法有参数，固定参数ProceedingJoinPoint
   *
   */

  /**
   *
   * @Around 环绕通知
   * @param pjp 环绕通知
   * @return 目标方法的执行结果，可以被修改
   *
   * 属性：value 切入点表达式
   * 位置：在方法的定义的上面
   * 特点：
   * 1.它是功能最强的通知
   * 2.在目标方法的前和后都能增强功能。
   * 3.控制目标方法是否被调用执行
   * 4.修改原来的目标方法的执行结果。影响最后的调用结果。
   *
   * 环绕通知，等同于JDK动态代理的InvocationHandler接口
   *
   * ProceedingJoinPoint：等同于 Method
   *  作用执行目标方法
   *
   *  环绕通知：经常做事务管理，在目标方法之前开启事务，执行目标方法，在目标方法之后提交事务
   */
  @Around(value = "execution(* *..SomeServiceImpl.doFirst(..))")
  public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
    // 获取第一个参数值
    String name = "";
    Object args[] = pjp.getArgs();
    if(args != null && args.length > 1){
      Object arg = args[0];
      name = (String)arg;
    }
    Object result = null;
    // 实现环绕通知
    System.out.println("环绕通知，在目标方法执行之前，输出时间："+ new Date());
    // 1.目标方法调用
    if("lishi".equals(name)){ // 控制目标方法是否被执行
      // 符合条件，调用目标方法
       result = pjp.proceed(); //method.invoke()
    }
    // 2.在目标方法的前或者后加方法
    System.out.println("环绕通知：在目标方法之后，提交事务！");

    // 修改目标方法的执行结果
    if(result != null){
      result = "hello ddd";
    }

    // 返回目标方法执行结果
    return result;
  }
}
