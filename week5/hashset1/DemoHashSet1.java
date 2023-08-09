package week5.hashset1;

import java.util.HashSet;

public class DemoHashSet1 {//avoid duplicate data structure
  
  public static void main(String[] args) {
    HashSet<String> strings = new HashSet<>();
    System.out.println(strings.add("abc"));
    System.out.println(strings.add("def"));
    System.out.println(strings.size());//2
    

    //HashSet is good at handling duplicates
    Boolean result = strings.add("abc");
    System.out.println(strings.size());//2
    System.out.println(result);//false;

    if(strings.add("def")){
      System.out.println("def is added");
    }else {
      System.out.println("def is not added");
    }
 
    // Example 2:
    HashSet<Coordinate> coordinates = new HashSet<>();
    Coordinate c1 = new Coordinate (1,1);
    Coordinate c2 = new Coordinate(1, 1);
    coordinates.add(c1);//true
    coordinates.add(c2);//true
    System.out.println(coordinates.size());//2
    
Coordinate c3 = new Coordinate(2, 1);
System.out.println(coordinates.add(c3));//true
System.out.println(coordinates.size());//2

  }
}
