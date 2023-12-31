package com.hkjava.bootcamp;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)
public class PerclassTest {
  private int x;

  @Test
  @Order(1)
  void test1() {
    x++;
    assertEquals(1, x);
  }

  @Test
  @Order(2)
  void test2() {
    x++;
    assertEquals(2, x);
  }

  @Test
  void testAssertTrue() {
    assertTrue(12 == App.add(7, 5));
  }

  @Test
  void testAssertFalse(){
    assertFalse(13 == App.add(7,5));
  }

  @Test
  void testAssertNull(){
    String str = null;
    assertNull(str);
  }
  
  @Test
  void testassertNotNull(){
    Student student = new Student();
    assertNotNull(student.getSubjects());

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
}
 
