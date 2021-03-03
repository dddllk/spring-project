package com.dlkyy;

import com.dlkyy.ba05.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dlkyy on 2021/3/3 22:32
 */
public class Test05 {
  @Test
  public void test(){
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    SomeService proxy = (SomeService) ac.getBean("someService");

    // 执行
    proxy.doThird();
  }
}
