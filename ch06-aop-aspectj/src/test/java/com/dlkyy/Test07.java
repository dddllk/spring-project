package com.dlkyy;

import com.dlkyy.ba07.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dlkyy on 2021/3/3 22:50
 */
public class Test07 {
  @Test
  public void test(){
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    SomeServiceImpl proxy = (SomeServiceImpl) ac.getBean("someService");

    /**
     * 目标类没有借口，使用cglib动态代理，spring框架会自动调用cglib
     */
    // proxy: com.dlkyy.ba07.SomeServiceImpl$$EnhancerBySpringCGLIB$$b4d3929b
    System.out.println("proxy: " + proxy.getClass().getName());
    // 执行
    proxy.doThird();
  }
}
