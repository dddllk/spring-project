package com.dlkyy.ba04;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
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
   * 异常通知方法的格式定义
   * 1.public
   * 2.没有返回值
   * 3.方法名称自定义
   * 4.方法有一个参数，Exception 如果还有有，是JoinPoint，
   */

  /**
   * @AfterThrowing: 异常通知
   *  属性：1.value 切入点表倒是
   *        2.throwing 自定义的变量，表示目标方法抛出的异常对象。
   *          变量名必须和方法的参数名一样
   *  特点：
   *    1.在目标方法抛出异常时执行的
   *    2.可以在做异常监控程序，监控目标方法执行时是不是有异常。
   *      如果有异常，可以发送邮件，短信进行通知。
   * @param ex
   *
   * 执行：
   * try{
   *   SomeServiceImpl.doSecond(...)
   * }catch(Exception ex){
   *   myAfterThrowing(ex);
   * }
   *
   */
  @AfterThrowing(value = "execution(* *..SomeServiceImpl.doSecond(..))",
              throwing = "ex")
  public void myAfterThrowing(Exception ex){
    System.out.println("异常通知：方法发生异常时，执行："+ex.getMessage());
    // 发送邮件，通知！
  }
}
