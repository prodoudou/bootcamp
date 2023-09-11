package com.hkjava;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Calculator {

private int weight = 2;//instance variable


  public int substract(int x, int y) { //instance method
    return y - x - this.weight;
  }

  public int multiply (int x , int y){
    return x * y;
  }
}
