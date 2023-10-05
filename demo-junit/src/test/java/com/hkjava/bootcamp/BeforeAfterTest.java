package com.hkjava.bootcamp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class BeforeAfterTest {
  private int x;

  
  @BeforeEach
  void configuration(){
    assertEquals(0,this.x);
    this.x += 3;
  }

  
  @AfterEach
  void endOftest(){
    System.out.println("endOfTest start");
    this.x -= 2;
    System.out.println("ended. x=" + this.x);
  }

  @Test
  void testAdd(){
    assertEquals(8, App.add(this.x, 5));
  }

  @Test
  void testAdd2(){
    assertEquals(8, App.add(this.x, 5));
  }
}
