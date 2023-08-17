package week6.week6wed.lambda2;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaDemo {
  public static void main(String[] args) {
    Function<String, Integer> lengthFunc = str -> str.length(); // left is input, right is output)
    // function???
    Function<String, Character> firstCharFunc = str -> str.charAt(0);//

    System.out.println(lengthFunc.apply("abc"));// 3
    System.out.println(firstCharFunc.apply("month"));// m

    LengthFunction lengthFunction = new LengthFunction();// 多魚
    System.out.println(lengthFunction.apply("def"));//// 3 多魚

    // function Example in Map
    Map<String, String> map = new HashMap<>();
    map.put("abc", "Mary");
    // Function<String, String> formula = s -> "default"; //if 2 varuable = 2{}
    String result = map.computeIfAbsent("bdf", s -> "default");
    System.out.println("result= " + result);
    System.out.println("map= " + map);
    System.out.println(map.size());// 2

    // BiFunction
    BiFunction<Integer, Integer, BigDecimal> addition = (x, y) -> BigDecimal.valueOf(x + y);
    // BiFunction<T, U, R> R= result type// that is BigDecimal. that why change type into Integer//
    System.out.println("Bifuncetion=" +addition.apply(-4, 3).abs());// 1 // becuase bigcimal can use .abs() method

    // map.compute("bcd", (s1, s2)-> "value");
    // System.out.println(map.size());//3
    // map.compute("bcd", (s1, s2)-> "another");
    // System.out.println(map.size());//3
    // System.out.println(map.get("bcd"));//有就REPLACE 無就PUT入去

    // map.compute("bcd", (s1, s2)-> null);
    // System.out.println(map.size());//2

    Map<String, Integer> stock = new HashMap<>();
    stock.put("clothes", 100);

    stock.compute("clothes",
        (item, oldPrice) -> (int) (oldPrice - oldPrice * 0.1));
    System.out.println(stock.get("clothes"));// 90

    stock.compute("clothes", (item, oldPrice) -> null);// old value = item , oldprice new value = null//
    // if null all removed
    System.out.println(stock.size());// 0

    //
    stock.compute("shoes", (item, oldPrice) -> 120);
    System.out.println(stock.get("shoes"));

  }
}
