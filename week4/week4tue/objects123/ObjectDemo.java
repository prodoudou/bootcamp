package week4tue.objects123;

import java.util.Arrays;

import week4tue.Circle10;
import week4tue.Shape;
import week4tue.Square10;

public class ObjectDemo {
  String name = "hello";

  // Rule 1: All class extends Object Implicitly
  @Override
  public String toString() {
    return this.name;
  }

  // public String toString(int[] arr){
  // String s ="";
  // for(int a:arr){
  // s+=a+", ";
  // }
  // return s;
  // }

  public static void main(String[] args) {
    // Example1 : ObjectDemo extends Object
    ObjectDemo objectDemo = new ObjectDemo();
    System.out.println(objectDemo);// week4tue.objects.ObjectDemo@7e9e5f8a
    System.out.println(objectDemo.toString());// week4tue.objects.ObjectDemo@7e9e5f8a
    objectDemo.hashCode();// another presentation of object reference
    // becuase has code has a short range of value storage
    // so, it cannot store all memorty address (object refernce) in your machine

     // HashCode is a number/ integer
    // another presentation of object reference 32bit 64bit
    // But not the same as Memory Address
    // As Range of HashCode is so small, it is not enought to store all memory
    // address

    Circle10 circle = new Circle10(10.0d);// static mehtod
    Square10 square = new Square10(3.0d);// static mehtod
    Shape[] shapes = new Shape[] { circle, square };//// static mehtod
    Shape.area(shapes);// static mehtod

    int[] arr = new int[] { 1, 2, 3 };
    System.out.println("25" + arr);// [I@58644d46 // @ = tostring
    Arrays.toString(args);
    String str = "abc";
    System.out.println(str);// abc

    System.out.println(objectDemo);
    System.out.println(objectDemo.toString());
    System.out.println(objectDemo.toString());


    System.out.println("abc hashCode" +str.hashCode());//96354
    //a * 31^2 + b * 31^1 + c
    System.out.println(97 * (int)Math.pow(31,2) + 98 * 31 + 99);

    Integer i1 = 3;
    System.out.println(i1.hashCode());//3
    Long l1 = 100L;
    System.out.println(l1.hashCode());//overflow


    ObjectDemo a = new ObjectDemo();//
    ObjectDemo b = new ObjectDemo();//
    System.out.println(a);// toString()-> hasCode
    System.out.println(b);//toString() ->hashCode
    if( a==b){ // address (object reference)

    }

     //equals()
     String s1 ="abc";
     String s2 = "abc";
     System.out.println(s1.equals(s2));//true //點樣EQUALS DEFIND BY attirabte
     

 //instanceOf , object.class
 Object obj = new String("abc");//obj is an object reference(address_) //becuase defualt string is under object
 Object obj2 = new Integer(1);
// System.out.println();
//  obj=Long.valueOf(10);
//  System.out.println();
 System.out.println(obj instanceof String); // true
 System.out.println("hi");
 obj = Long.valueOf(10);
 System.out.println(obj instanceof String);// falas
 System.out.println(obj instanceof Long);// true

 Shape shape = new Circle10(5.0d);
 //shape.print();//no print method in shape
 //Hide child prit() method
 Circle10 c = (Circle10) shape;
c.print();// I am cicle10


 //NUmber
 Integer int1 = Integer.valueOf(100);
 System.out.println(int1 instanceof Number);// true
 Double d1 = Double.valueOf(100);
 System.out.println(d1 instanceof Number);//true // instanceof = 實例


 //Primitives, for comparison, we use ==
//wrapper class, for comparsion ,we use equals 
System.out.println();
Integer j1 = 128;
Integer j2 = 128;
System.out.println(j1.equals(j2));//true
j1 = 127;
j2 = 127;
System.out.println(j1.equals(j2));// true
Boolean bool1 = false;
Boolean bool2 = false;
System.out.println(bool1.equals(bool2));//true,checking color, instead of 

System.out.println(bool1.equals(false));//true



  

  }
}
