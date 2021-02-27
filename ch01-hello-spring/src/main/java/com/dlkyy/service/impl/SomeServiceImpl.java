package com.dlkyy.service.impl;

import com.dlkyy.service.SomeService;

/**
 * Created by dlkyy on 2021/2/27 14:49
 */
public class SomeServiceImpl implements SomeService {

  @Override
  public void doSome() {
    System.out.println("执行了SomeServiceImpl的doSome方法！");
  }
}