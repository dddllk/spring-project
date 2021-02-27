package com.dlkyy;

import com.dlkyy.ba02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dlkyy on 2021/2/27 20:29
 */
public class Test02 {
  @Test
  public void test02(){
    String config = "ba02/applicationContext.xml";
    ApplicationContext ac = new ClassPathXmlApplicationContext(config);

    // 从容器中获取Student对象
    Student myStudent = (Student) ac.getBean("myStudent");
    System.out.println("student = " + myStudent);
  }

}
