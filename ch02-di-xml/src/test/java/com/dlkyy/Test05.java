package com.dlkyy;

import com.dlkyy.ba05.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dlkyy on 2021/2/28 9:21
 */
public class Test05 {
  @Test
  public void Test01(){
    ApplicationContext ac = new ClassPathXmlApplicationContext("ba05/applicationContext.xml");
    Student student = (Student) ac.getBean("myStudent");
    System.out.println(student);
  }
}
