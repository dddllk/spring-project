package com.dlkyy.utils;

import java.util.Date;

/**
 * Created by dlkyy on 2021/3/1 21:46
 */
public class ServiceTools {
  public static void doLog(){
    System.out.println("非业务方法，方法的执行时间：" +new Date());
  }

  public static void doTrans(){
    System.out.println("方法执行完毕以后，提交事务");
  }
}
