package week6.week6wed.lambda2;

import java.util.function.Predicate;

public class CombinDemo {
  public static void main(String[] args) {
    Predicate<String> startWithV = str1 -> str1.startsWith("V");
    Predicate<String> endsWithE = s -> s.endsWith("E");

    Predicate<String> comdbined= startWithV.and(endsWithE);
    System.out.println(comdbined.test("VE"));//true
    System.out.println(comdbined.test("AE"));//false
    System.out.println(comdbined.test("VA"));//false
   
    Predicate<String> comdbined2= startWithV.or(endsWithE);
    System.out.println(comdbined2.test("VE"));//true
    System.out.println(comdbined2.test("AE"));//true
    System.out.println(comdbined2.test("VA"));//true

  }
}
