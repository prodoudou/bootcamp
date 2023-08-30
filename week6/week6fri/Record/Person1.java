package week6.week6fri.Record;
public record Person1 (String name, int age) implements TestInterface{
//Immutable Objects
//final class , support Generics
//Support Interface, but no Parent Class (extends Object.class)
//Private final String name;
//Private final int age;
// ALL-args constructor ONLY
//ALL Getters
//No Setters (final instance variable)
//custom static methods, static variable
//custom constant
//custom instance methods
//No other instance variables
//Already @Override equals(), hashCode(), toString();

// int salary;

static int counter = 0; //instance varible = class varible = not belong to object

static final int MIN_PLAY = 50; // constant

public boolean isElderly(int age){
  return age >= 65;
}

public static int add(int x , int y){
  return x + y;
}

@Override
public void read(){

}
//Tools

}