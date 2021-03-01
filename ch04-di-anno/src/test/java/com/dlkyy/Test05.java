package com.dlkyy;

import com.dlkyy.ba05.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dlkyy on 2021/3/1 19:48
 */
public class Test05 {
  @Test
  public void test01(){
    ApplicationContext ac = new ClassPathXmlApplicationContext("ba01/applicationContext.xml");
    Student student = (Student) ac.getBean("myStudent");
    System.out.println(student);
  }
}
