package com.hkjava;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

/**
 * Unit test for simple App.
 */
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class MockTest {

    @Mock
    Calculator calculator;


    @InjectMocks
    Checkout checkout;

    @Test
    void testSubstract() {
        Calculator selfNew = new Calculator(3);
        assertEquals(-7, selfNew.substract(10, 6));
        assertEquals(6,selfNew.multiply(2,3));
    }

@Test
void testAdd1(){
    when(calculator.substract(3, 4)).thenReturn(100);
   // when(calculator.substract(5, 4)).thenReturn(100);
    //Checkout checkout = new Checkout(calculator); comment 因為有injection mock
   // Checkout checkout = new Checkout(new Calculator(3));
    int result = checkout.add(3,4);// Scenario: x > 1
    assertEquals(104, result);
    verify(calculator, times(1)).substract(3,4);

}

@Test
void testAdd2(){
    when(calculator.substract(1, 4)).thenReturn(1000);
    //Checkout checkout = new Checkout(calculator2); //comment 因為有injection mock

    int result = checkout.add(1,4);// Scenario: x <= 1
    assertEquals(5, result);
    verify(calculator, never()).substract(1,4);
}

@Test
void testMultiply(){
    when(calculator.substract(7, 9)).thenReturn (10000);
     when(calculator.multiply(7, 9)).thenReturn (10000);
    int result = checkout.multiply(7, 9); // Scenario: x <= 1
    assertEquals(10009, result);
}

    @Test
    void testMultiply2(){
        when(calculator.substract(3,8)).thenReturn(10000);
        int result2 = checkout.multiply (3,8);
        assertEquals(8, result2);
    }

    // @Test
    // void testAdd3(){
    //     when(Calculator.staticSubstract(3,8)).thenReturn(10000);
    //     Checkout checkout2 = new Checkout(calculator2);
    //     //Testing start
    //     int result2 = Checkout.staticAdd(1,4);
    //     assertEquals(5,result2);
    //     verify(calculator2, never()).staticSubstract(1,4);
    // }
}
