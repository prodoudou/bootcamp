package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor// The minimal ags to create Student Object
// required arg constructor for (nonnull and final);
@AllArgsConstructor
//@NoArgsConstructor
public class Student {
private int age;

  public static void main(String[] args) {
    Student student = new Student();//  come from RequiredArgsCon
   
  }
}
