package com.dlkyy.ba05;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by dlkyy on 2021/3/2 21:20
 *
 *
 */
@Aspect
public class MyAspectj {
  /**
   * 最终通知方法的定义格式
   *  1.public
   *  2.没有返回值
   *  3.方法名字自定义
   *  4.方法没有参数，如果有则是JoinPoint
   */
  /**
   * @After: 最终通知
   *    属性 ：value 切入点表达式
   *    位置：在方法的上面
   * 特点：
   *  1.总是会执行
   *  2.在目标方法之后执行的
   *
   * 相当于try...catch...finally...中的finally后面要执行的语句
   */
  @After(value = "execution(* *..SomeServiceImpl.doThird(..))")
  public void myAfter(){
    System.out.println("执行最终通知，总是会被执行的代码");
    // 一般做资源清除工作
  }
}
