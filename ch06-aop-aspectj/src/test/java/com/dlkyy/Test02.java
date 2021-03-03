package com.dlkyy;

import com.dlkyy.ba02.SomeService;
import com.dlkyy.ba02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dlkyy on 2021/3/3 20:32
 */
public class Test02 {
  @Test
  public void test(){
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    SomeService proxy = (SomeService) ac.getBean("someService");

    // 通过代理的对象执行方法，实现目标方法执行，增强功能
    String str = proxy.doOther("dd", 12);
    System.out.println(str);

    Student stu = proxy.doOther2("ll", 26);
    System.out.println(stu);
  }
}
