package com.dlkyy.ba05;

/**
 * Created by dlkyy on 2021/2/27 17:04
 */
public class School {
  private String name;
  private String address;

  public School() {
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "School{" +
        "name='" + name + '\'' +
        ", address='" + address + '\'' +
        '}';
  }
}
