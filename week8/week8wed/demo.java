package week7.week8.week8wed;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class demo {
  public static void main(String[] args) {
    //Stream support List, Map, Arrays.stream()
    List<String> strings = new LinkedList<>();
    strings.add("abc");
    strings.add("def");
    strings.stream()
    .filter(e -> e.startsWith("a"))
    .forEach(e -> System.out.println(e));

    strings.stream()
    .map(e -> e.length())// convert string to int
    .filter(l -> l < 5)
    .forEach(e -> System.out.println(e)); //3


    Integer i = 10;
    Integer j = 10;
    System.out.println(i.equals(j));// true

    i = 1000;
    j = 1000;
    System.out.println(i == j); // false;

    String s1 = "abc"; //new String ("abc");
    String s2 = "abc"; // String literal pool
    System.out.println(s1 == s2);// true
    String s3 = s2;
    System.out.println(s3 == s1);// true
    s1 = s1 + "d";// String is immutable, new string ("abcd")

    Integer a = 129 ;// object 1 (129)
    System.out.println(System.identityHashCode(a));
    a = a + 1; // cannot revise the value of the object. Integer is immutable.
    System.out.println(System.identityHashCode(a));// reference changed
   
    Integer a2 = 129; //object 2

    Integer a3 = Integer.valueOf(127); // internal cache
    Integer a4 = Integer.valueOf(127);
    Integer a5 = Integer.valueOf(127);
    Integer a6 = Integer.valueOf(127);
  }


  public static List<Integer> getAges(List<String> list){
    return list.stream()
    .map(e -> e.length()) // convert string to int
    .filter ( e -> e < 5 )//
    .collect(Collectors.toList());//
  }

}
