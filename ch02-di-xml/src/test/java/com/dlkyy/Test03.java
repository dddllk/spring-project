package com.dlkyy;

import com.dlkyy.ba03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;


/**
 * Created by dlkyy on 2021/2/27 14:50
 */
public class Test03 {
  @Test
  public void test03(){
    String config = "ba03/applicationContext.xml";
    ApplicationContext ac = new ClassPathXmlApplicationContext(config);

    // 从容器中获取Student对象
    Student myStudent = (Student) ac.getBean("myStudent");
    System.out.println("student = " + myStudent);

    File file = (File) ac.getBean("myFile"); // ac.getBean("myFile") 是Object类型，所以需要强转
    System.out.println("file = " + file.getName());

  }
}
