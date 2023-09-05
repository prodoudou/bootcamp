package com.hkjava.bootcamp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
//import org.junit.jupiter.api.Assertions;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)// default
public class AbcTest {

  private int x;//if static variable = accumulate, if non-static varible, create every object with every method called
  // instance variable

  @Test
  void testAssertEqual() {
    // Assertions.assertEquals(actual value, expected value)
    
    assertEquals(App.add(2, 3), 5);
    assertEquals(App.add(2, 5), 7);
    assertEquals(7,App.add(2,5));
    assertEquals(App.add(0, 0), 0);
    assertEquals(App.add(-6, -2), -8);
    x++;
    assertEquals(1,x);

  }
    @Test
    void testAssertNotEqual(){
      assertNotEquals(App.add(1,2), 4);
    }

  public static void main(String[] args) {
    AbcTest t1 = new AbcTest();
    t1.testAssertEqual();
    AbcTest t2 = new AbcTest();
    t2.testAssertNotEqual();
}
}