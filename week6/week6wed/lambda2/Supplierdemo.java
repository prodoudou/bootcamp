package week6.week6wed.lambda2;

import java.time.LocalDate;
import java.util.Random;
import java.util.function.Supplier;

public class Supplierdemo {
  public static void main(String[] args) throws Exception{
    Supplier<LocalDate> now = () -> LocalDate.now();
    System.out.println(now.get());////2023-08-16

    test(now, LocalDate.of(2023, 8, 16));

    Supplier<Integer> random = () -> {
      return new Random().nextInt(3);//0,1,2
    };
    test(random,2);
  }

  public static <T>void test(Supplier<T> testcase, T result) throws Exception{
    if(testcase.get().equals(result));
    //return;
    throw new Exception();
  } 
}