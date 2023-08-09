package week4mon.abstract1;

public abstract class Person {
  //abstract class

private int age;//0

private double height;//.0
//abstract = cant new//
//final = cant extend
//may contain instance method with implementation

public Person(){

}

public Person(int age, double height){
  this.age = age;
  this.height = height;
}

public int getAge(){
  return this.age;
}


public double getHeight(){
  return this.height;
}


public void run(){
  System.out.println("I am Person,I am running");
}
//May contain abstract method (without implementation)
public abstract void sleep();//abstract method
//difference between pulblic class and public abstract class 
//appear abstract method without implementation)
//唔講佢呢個MEHTOD做咩


}


