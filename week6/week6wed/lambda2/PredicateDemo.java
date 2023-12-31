package week6.week6wed.lambda2;

import java.time.LocalDate;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
  public static void main(String[] args) throws Exception {
    // develpoer
    Predicate<Character> isMale = c -> c == 'M';
    Predicate<String> isUpperCase = s -> {
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) < 65 || s.charAt(i) > 90)
          return false;
      }
      return true;
    };
    // tester
    test(isMale, 'F', false);//
    test(isMale, 'M', true);//
    test(isUpperCase, "ABCaD", false);
    test(isUpperCase, "ABCDD", true);
    // test(isUpperCase, null, false);
    test(isUpperCase, "", true);

    // BiPredicate
    BiPredicate<String, String> equals = (s1, s2) -> s1 != null && s2 != null && s1.equals(s2);

    test(equals, "abc", "abc", true);
    // test(equals, "abc", "abc", false);
    test(equals, null, "bcd", false);
    test(equals, "abc", null, false);
    test(equals, null, null, false);
    test(equals, null, "", false);
    test(equals, "", "", true);

    Predicate<LocalDate> isCoolingOff = effDate -> effDate.plusMonths(1).isAfter(LocalDate.now());

    test(isCoolingOff, LocalDate.of(2023, 7, 16), false);
    test(isCoolingOff, LocalDate.of(2023, 7, 17), true);

    // test 3 :
    System.out.println("test 3 : " + test3( "abc", "abc"));
  }

  public static <T> void test(Predicate<T> testcase, T data,
      boolean expectedResult) throws Exception {
    if (testcase.test(data) == expectedResult)
      return;
    throw new Exception();
  }

  public static <T, U> void test(BiPredicate<T, U> testcase, T data, U data2, boolean expectedResult) throws Exception {
    if (testcase.test(data, data2) == expectedResult)
      return;
    throw new Exception();
  }

  public static <T,U> boolean test3(T data, U data2)  {
    if (data2.equals(data))
      return true;
    return false;
  }

}
