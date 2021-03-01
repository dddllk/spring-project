package com.dlkyy.ba05;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by dlkyy on 2021/2/27 17:04
 */
@Component("mySchool")
public class School {

  @Value("powernode")
  private String name;

  @Value("bj")
  private String address;

  public School() {
  }
  @Override
  public String toString() {
    return "School{" +
        "name='" + name + '\'' +
        ", address='" + address + '\'' +
        '}';
  }
}
