package week5.week5mon.hashset1;

import java.util.HashSet;

import week5.week5tue.hashmap1.Book;

public class DemoHashSet1 {// avoid duplicate data structure

  public static void main(String[] args) {
    HashSet<String> strings = new HashSet<>();
    System.out.println(strings.add("abc"));
    System.out.println(strings.add("def"));
    System.out.println(strings.size());// 2
    System.out.println(strings);

    // HashSet is good at handling duplicates
    Boolean result = strings.add("abc");
    System.out.println(strings.size());// 2
    System.out.println(result);// false;

    if (strings.add("def")) {
      System.out.println("def is added");
    } else {
      System.out.println("def is not added");
    }

    // Example 2: With Override equal() method
    System.out.println("Example2");
    System.out.println();
    HashSet<Coordinate> coordinates = new HashSet<>();
    Coordinate c1 = new Coordinate(1, 1);
    Coordinate c2 = new Coordinate(1, 1);
    // c1.equals.c2
    System.out.println(coordinates.add(c1));// true
    System.out.println(coordinates.add(c2));// false, Coordinate euqals() return true
    //HashSet add() -> Coordinate c2.equals(any of coordinate in hashset)
    //              ->c2.equals (c1) -> true
    //              ->HashSet not allow duplicates
    //              -> return false
    System.out.println(coordinates.size());// 1

    Coordinate c3 = new Coordinate(2, 1);
    System.out.println(coordinates.add(c3));// true, Coordinate equals() return false;
    System.out.println(coordinates.size());// 2

    //Example3
    HashSet<Book> books = new HashSet <>();
    //System.out.println(books.add(new Book("Eric")));//true
    //System.out.println(books.add(new Book("Eric")));//true
   //System.out.println(books.add(new Book("Steven")));//true, diff address



  }
}
