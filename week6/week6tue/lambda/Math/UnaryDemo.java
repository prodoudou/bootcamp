package week6.week6tue.lambda.Math;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryDemo {
  
  public static void main(String[] args) {
    
    UnaryOperator<String> uppercase = str -> str.toUpperCase();

    System.out.println(uppercase.apply("Hello"));//HELLO

    BinaryOperator<String> concat = (s1, s2) -> s1.concat(s2);
    System.out.println(concat.apply("Hello", " world"));



    //-------------------------------

    SuperUnaryOperator<String> concat2 = 
    (s1, s2, s3) -> s1.concat(s2).concat(s3);
    System.out.println(concat2.apply("abc", "def", "ghi"));
  }
}
