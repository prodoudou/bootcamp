package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

//@NoArgsConstructor //不會同隱藏既野有衝突
@EqualsAndHashCode // default is not calling super class
// @EqualsAndHashCode (callSuper = true)
@AllArgsConstructor // 不考慮parent class
@SuperBuilder
public class Staff extends Human {
  private double salary;

  // you have to manually codethe constructor with parent's attribute
  public Staff(String name, double salary) {
    super(name);
    this.salary = salary;
  }

  public static void main(String[] args) {
    Staff staff = new Staff("John", 3000.0);
    Staff staff2 = new Staff("Peter", 3000.0);
    System.out.println(staff.equals(staff2));// true

    Staff s3 = Staff.builder()//
        .salary(5000)
        .name("null")
        .build();

    Staff s4 = new Staff(Staff.builder()//
        .salary(5000)
        .name("null"));
    Staff s5 = Staff.builder()
        .build();

  }
}
