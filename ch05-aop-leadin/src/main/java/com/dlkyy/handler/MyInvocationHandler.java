package com.dlkyy.handler;

import com.dlkyy.utils.ServiceTools;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by dlkyy on 2021/3/1 21:56
 */
public class MyInvocationHandler implements InvocationHandler {

  // 目标对象
  public Object target; // SomeServiceImpl类

  public MyInvocationHandler(Object target) {
    this.target = target;
  }

  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

    String methodName = method.getName();
    // 通过代理对象执行方法，会调用执行这个invoke
    Object res = null;
    //
    if("doSome".equals(methodName)){
      ServiceTools.doLog();
      // 执行目标类的方法，通过Method类实现
      res = method.invoke(target, args); // SomeServiceImpl.doSome()--增加功能
      //
      ServiceTools.doTrans();
    }else {
      res = method.invoke(target, args); // doOther()--不增加功能
    }
    return res;
  }
}
