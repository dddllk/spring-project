package com.dlkyy.ba08;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by dlkyy on 2021/3/2 21:20
 *
 *
 */
@Aspect
public class MyAspectj {

  @After(value = "mypt()")
  public void myAfter(){
    System.out.println("执行最终通知，总是会被执行的代码");
    // 一般做资源清除工作
  }
  @Before(value = "mypt()")
  public void myBefore(){
    System.out.println("前置通知，在目标方法之前被执行的");
  }
  /**
   *
   * @Pointcut: 定义和管理切入点，如果你的项目中有多个切入点表达式是重复的，可以复用
   *              可以定义@Pointcut
   *     属性：value 切入点表达式
   *     位置：在自定义的方法上面
   * 特点：
   *   当使用@Pointcut定义在一个方法的上面，此时这个方法的名称就是切入点表达式的别名
   *   其他通知中，value属性就可以使用这个方法名称，代替切入点表达式了
   */
  @Pointcut(value = "execution(* *..SomeServiceImpl.doThird(..))")
  private void mypt(){
    // 无须代码
  }
}
