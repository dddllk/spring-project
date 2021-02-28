package com.dlkyy.ba04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

  /**
   * 引用类型
   * @Autowired: spring框架提供的注解，实现应用类型的赋值。
   * spring中通过注解给引用类型赋值，使用的是自动注入原理。
   *      支持byName,byType
   *  @Autowired: 默认使用的是byType自动注入
   *        位置：1）在属性定义的上面，无需set方法，推荐使用
   *              2）在set方法的上面
   *
   *   如果使用byName方式，需要：
   *    1.在属性上面加入@Autowired
   *    2.在属性上面加入@Qualifier(value="bean的id")：表示使用指定名称的bean完成赋值
   */
  @Autowired
  @Qualifier("mySchool")
  private School school;

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
        ", school=" + school +
        '}';
  }
}
