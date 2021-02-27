package com.dlkyy;

import com.dlkyy.ba04.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dlkyy on 2021/2/27 23:23
 */
public class Test04 {
  @Test
  public void test(){
    String config = "ba04/applicationContext.xml";
    ApplicationContext ac = new ClassPathXmlApplicationContext(config);

    Student student = (Student) ac.getBean("myStudent");

    System.out.println(student);
  }
}
