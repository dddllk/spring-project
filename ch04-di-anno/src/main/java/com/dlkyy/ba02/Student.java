package com.dlkyy.ba02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by dlkyy on 2021/2/28 10:40
 *
 *  @value 简单类型属性赋值
 *    属性：value 是String类型的，表示简单类型的属性值
 *    位置：1.在属性定义的上面，无需使用set方法，推荐使用
 *          2.在set方法上面
 */

// 使用value，指定对象名称
// @Component(value = "myStudent")

// 可以省略value
@Component("myStudent")

// 不指定对象名称，由spring提供默认名称：类名的首字母小写
//@Component
public class Student {
  @Value("dd")
  private String name;
  @Value("16")
  private Integer age;

  public Student() {
    System.out.println("student无参数构造方法！");
  }

  public Student(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
