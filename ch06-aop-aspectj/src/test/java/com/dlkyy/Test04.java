package com.dlkyy;

import com.dlkyy.ba04.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dlkyy on 2021/3/3 22:03
 */
public class Test04 {
  @Test
  public void test(){
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    SomeService proxy = (SomeService) ac.getBean("someService");
    // 通过代理的对象执行方法
    proxy.doSecond();
  }
}
