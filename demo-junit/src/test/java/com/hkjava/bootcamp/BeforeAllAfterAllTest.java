package com.hkjava.bootcamp;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BeforeAllAfterAllTest {
private int x;
  
  @BeforeAll
 void beforeAll(){
    System.out.println("beforeAll start");
  }

  @AfterAll
  void afterAll(){
    System.out.println("afterAll start");
  }

  @Test
  void test(){
    x++;
    System.out.println("test x=" +x);
    assertTrue(x == 1);
  }

  @Test
  void test2(){
    x++;
    System.out.println();
    assertTrue(x ==2);
  }
}
