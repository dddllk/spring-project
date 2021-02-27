package com.dlkyy;

import com.dlkyy.service.SomeService;
import com.dlkyy.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Created by dlkyy on 2021/2/27 14:50
 */
public class TestMain {
  @Test
  public void test01(){
    SomeService service = new SomeServiceImpl();
    service.doSome();
  }

  /**
   * spring默认创建对象的时机：在创建Spring的容器是，会创建配置文件中的所有对象。
   * spring创建对象：默认调用的是无参数构造方法
   */
  @Test
  public void test02(){
    // 使用spring容器创建的对象
    // 1.指定spring配置文件的名称
    String config = "beans.xml";
    // 2.创建表示spring容器的对象
    // ApplicationContext就是表示Spring容器，通过容器获取对象了
    // ClassPathXmlApplicationContext：表示从类路径中加载spring的配置文件
    ApplicationContext ac = new ClassPathXmlApplicationContext(config);

    // 从容器中获取某个对象，要调用对象的方法
    SomeService service = (SomeService) ac.getBean("someservice");

    // 使用spring创建好的对象
    service.doSome();
  }

  // 获取非自定义类对象
  @Test
  public void test03(){
    String config = "beans.xml";
    ApplicationContext ac = new ClassPathXmlApplicationContext(config);

    // 使用getBean()
    Date myDate = (Date) ac.getBean("mydate");
    System.out.println("Date = " +myDate);
  }
}
