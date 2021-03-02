package com.dlkyy.ba01;

/**
 * Created by dlkyy on 2021/3/2 21:19
 */
public class SomeServiceImpl implements SomeService {
  @Override
  public void doSome(String name, Integer age) {
    // 在doSome增加执行时间
    System.out.println("===目标方法doSome===");
  }
}
