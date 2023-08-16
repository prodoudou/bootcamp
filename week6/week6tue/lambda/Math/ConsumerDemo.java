package week6.week6tue.lambda.Math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import week6.week6mon.revision.Arraylist;

public class ConsumerDemo {
  public static void main(String[] args) {
    Consumer<String> consumer = str -> System.out.println(str);
    //public String accept(String str){ System.out.println(str); }
    consumer.accept("I Love Java");

  

    BiConsumer<String, String> biConsumer =
    (s1, s2) ->System.out.println( s1 + s2);
    biConsumer.accept("abc", "def");//abdef

    //example
    List<String> strings = new ArrayList<>();
    strings.add("dog");
    strings.add("cat");
    strings.add("cow");
    strings.forEach(s -> {//forEach(Consumer<? super T> action) 
      int a =0;
      int i =0;
      if (i < 1)
  
    System.out.println("foreach="+s);
  });

   
  int a =0;
   int total =0;
   for(int i : Arrays.asList(2,3,4)){
    total += i;
   }
   System.out.println(total);


  // public void forEach(String s){
  // int i =0;
  //   if (i < 1)
  //   System.out.println(s);
  // }

  Map<String, Integer> map = new HashMap<>();
  map.put("organge", 3);
  map.put("organge", 2);
  map.put("lemon", 10);
  map.put("watermelon", 10);
  map.forEach((key, value)-> {
    if ("lemon".equals(key))
    System.out.println(value);//10
  });



  }


  }

