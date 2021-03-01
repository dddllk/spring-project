package com;

import com.dlkyy.handler.MyInvocationHandler;
import com.dlkyy.service.SomeService;
import com.dlkyy.service.impl.SomeServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by dlkyy on 2021/3/1 21:41
 */
public class MyApp {
  public static void main(String[] args) {
    // SomeService service = new SomeServiceImpl();
    // service.doSome();
    // System.out.println("=================");
    // service.doOther();

    // 使用jdk的Proxy创建代理对象
    SomeService target = new SomeServiceImpl();

    // 创建InvocationHandler对象
    InvocationHandler handler = new MyInvocationHandler(target);

    // 使用Proxy创建代理
    SomeService proxy = (SomeService) Proxy.newProxyInstance(
        target.getClass().getClassLoader(),
        target.getClass().getInterfaces(), handler);

    // 调用方法
    proxy.doSome();
    System.out.println("============");
    proxy.doOther();
  }
}
