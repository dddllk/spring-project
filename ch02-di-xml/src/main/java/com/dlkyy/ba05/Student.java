package com.dlkyy.ba05;

/**
 * Created by dlkyy on 2021/2/27 16:14
 */
public class Student {

  private String name;
  private int age;

  public Student(String myname, Integer myage, School myschool){
    System.out.println("===有参数构造方法====");
    this.name = myname;
    this.age = myage;
    this.school = myschool;
  }

  private School school;

  public Student() {

  }

  public void setSchool(School school) {
    this.school = school;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", school=" + school +
        '}';
  }
}
