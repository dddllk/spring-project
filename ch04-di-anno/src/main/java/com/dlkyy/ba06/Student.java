package com.dlkyy.ba06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

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
   * 饮用来日常
   *@Resource 来自JDK中的注解，spring框架提供了对这个注解的功能支持，可以使用它给引用类型赋值
   *          使用的也是自动注入原理，支持byName,byType。默认是byName
   *  位置：1、在属性定义的上面，无需set方法，推荐使用。
   *        2、在set方法上面
   *
   * @Resource 只使用byName方式，需要增加一个属性 name
   *            name的值是bean的id（名称）
   */
  // 默认是byName：先使用byName自动注入，如果byName赋值失败，在使用byType
  @Resource(name = "mySchool")
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
