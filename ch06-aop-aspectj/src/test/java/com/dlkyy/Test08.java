package com.dlkyy;

import com.dlkyy.ba08.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dlkyy on 2021/3/3 22:57
 */
public class Test08 {
  @Test
  public void test(){
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    SomeService proxy = (SomeService) ac.getBean("someService");
    System.out.println(proxy.getClass().getName());
    // 执行
    proxy.doThird();
  }
}
