package com.dlkyy;

import com.dlkyy.ba06.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dlkyy on 2021/2/28 9:52
 */
public class Test06 {
  @Test
  public void Test01(){
    ApplicationContext ac = new ClassPathXmlApplicationContext("ba06/total.xml");
    Student student = (Student) ac.getBean("myStudent");
    System.out.println(student);
  }
}
