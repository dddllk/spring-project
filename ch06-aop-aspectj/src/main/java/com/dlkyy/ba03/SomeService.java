package com.dlkyy.ba03;

import com.dlkyy.ba02.Student;

/**
 * Created by dlkyy on 2021/3/2 21:18
 */
public interface SomeService {

  void doSome(String name, Integer age);
  String doOther(String name, Integer age);

  Student doOther2(String name, Integer age);

  String doFirst(String name, Integer age);
}
