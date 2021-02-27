package com.dlkyy;

import com.dlkyy.ba01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Created by dlkyy on 2021/2/27 20:29
 */
public class Test01 {
  @Test
  public void test01(){
    String config = "ba01/applicationContext.xml";
    ApplicationContext ac = new ClassPathXmlApplicationContext(config);

    // 从容器中获取Student对象
    Student myStudent = (Student) ac.getBean("mystudent");
    System.out.println("student对象=" + myStudent);

    Date date = (Date) ac.getBean("mydate");
    System.out.println("date = " + date);
  }

}
