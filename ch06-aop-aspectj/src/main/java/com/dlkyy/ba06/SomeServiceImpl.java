package com.dlkyy.ba06;

import com.dlkyy.ba02.Student;

/**
 * Created by dlkyy on 2021/3/2 21:19
 */
public class SomeServiceImpl implements SomeService {
  @Override
  public void doSome(String name, Integer age) {
    // 在doSome增加执行时间
    System.out.println("===目标方法doSome===");
  }

  @Override
  public String doOther(String name, Integer age) {
    System.out.println("====doOther---");
    return "ddd";
  }

  @Override
  public Student doOther2(String name, Integer age) {
    Student student = new Student();
    student.setAge(19);
    student.setName("lucy");
    return student;
  }

  @Override
  public String doFirst(String name, Integer age) {
    System.out.println("=====业务方法doFirst()=====");
    return "doFirst";
  }

  @Override
  public void doSecond() {
    System.out.println("===异常" + (1/0));
  }

  @Override
  public void doThird() {
    System.out.println("====最终通知");
  }
}
