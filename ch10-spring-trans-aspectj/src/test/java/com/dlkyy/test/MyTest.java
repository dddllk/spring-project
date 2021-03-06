package com.dlkyy.test;

import com.dlkyy.service.BuyGoodService;
import com.dlkyy.service.impl.BuyGoodServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dlkyy on 2021/3/5 21:21
 */
public class MyTest {
  @Test
  public void test01(){
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    BuyGoodService buyGoodService = (BuyGoodService) ac.getBean("buyService");

    System.out.println("buyGoodService是代理："+buyGoodService.getClass().getName());
    // 调用方法
    buyGoodService.buy(1005,10);
  }
}
