package com.dlkyy;

import com.dlkyy.ba06.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dlkyy on 2021/3/1 20:06
 */
public class Test06 {
  @Test
  public void test01(){
    ApplicationContext ac = new ClassPathXmlApplicationContext("ba01/applicationContext.xml");
    Student student = (Student) ac.getBean("myStudent");
    System.out.println(student);
  }
}
