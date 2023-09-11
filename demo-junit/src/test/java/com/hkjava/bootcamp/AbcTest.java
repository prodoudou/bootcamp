package com.hkjava.bootcamp;

//import org.junit.jupiter.api.Assertions;

import java.util.List;
import java.time.Duration;
//import org.junit.jupiter.api.Assertions;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
//import org.junit.jupiter.api.Assertions;

@TestInstance(TestInstance.Lifecycle.PER_METHOD) // default
// @TestInstance(TestInstance.Lifecycle.PER_CLASS)//
@DisplayName("AssertEquals Test")
public class AbcTest {

  private int x;// if static variable = accumulate, if non-static varible, create every object
                // with every method called
  // instance variable

  @Test
  @DisplayName("AssertEqual")
  void testAssertEqual() {
    // Assertions.assertEquals(actual value, expected value)
    assertEquals(5, App.add(2, 3));
    assertEquals(App.add(2, 3), 5);
    assertEquals(App.add(2, 5), 7);
    assertEquals(7, App.add(2, 5));
    assertEquals(App.add(0, 0), 0);
    assertEquals(App.add(-6, -2), -8);
    x++;
    x++;
    x++;
    assertEquals(3, x);
  }

  @Test
  void testAssertNotEqual() {
    assertNotEquals(App.add(1, 2), 4);
    x++;
    assertEquals(1, x);
  }

  @Test
  void testAssertThrows(){
    assertThrows(ArithmeticException.class, () -> {
      App.divide(10,0);
    });

    assertDoesNotThrow(() -> {
      App.divide(10, 5);
    });
  }

  @Test
  void testAssertNotTimeout(){
    assertTimeout(Duration.ofMillis(1000), () -> {
    Thread.sleep(200);// ms
  });
}

@Test
void testCombine() {
  assertAll(
    () -> assertTrue (10 > 3),
    () -> assertEquals(10, App.add(4,6)),
    () -> assertNull(null)
    );
}

@Test
void testSame(){
  String s1 = new String ("JUnit");
  String s2 = new String("JUnit");
  assertNotSame(s1,s2);// test object reference

  String s3 = ("Junit");
  String s4 = ("Junit");
  assertSame(s3, s4);
  assertEquals(s3, s4);
}

  public static void main(String[] args) {
    AbcTest t1 = new AbcTest();
    t1.testAssertEqual();
    AbcTest t2 = new AbcTest();
    t2.testAssertNotEqual();
  }
}