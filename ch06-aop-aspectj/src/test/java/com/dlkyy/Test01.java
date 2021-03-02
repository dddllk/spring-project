package com.dlkyy;

import com.dlkyy.ba01.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dlkyy on 2021/3/2 21:42
 */
public class Test01 {
  @Test
  public void test01(){
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    // 从容器中获取目标对象
    SomeService proxy = (SomeService) ac.getBean("someService");
    System.out.println(proxy.getClass().getName());
    // 通过代理的对象执行方法，实现目标方法执行时，增强了功能
    proxy.doSome("dd", 12);
  }
}
