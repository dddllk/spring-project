package com.dlkyy;

import com.dlkyy.ba03.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dlkyy on 2021/3/3 21:34
 */
public class Test03 {
  @Test
  public void test(){
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    SomeService proxy = (SomeService) ac.getBean("someService");
    String str = proxy.doFirst("lishi", 13);
    System.out.println(str);
  }
}
