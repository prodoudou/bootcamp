package week6.week6tue.lambda;
//Annotation: check if this interface has one abstract method only
// is no, compile-error

import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@FunctionalInterface
public interface Swimable {//functionInterface = only one method
  void swim();
  //void read();
 
  public static void main(String[] args) {
    //Lambda : you have to use "return", if you use {}
    Comparator <Person> sortByNameDesc //
    = (Person p1, Person p2) -> {return p2.name.charAt(0) > p1.name.charAt(0) ? 1 : -1;};
    List<Person> persons = Arrays.asList(new Person("Alison"), new Person("Eric"));
    Collections.sort(persons, sortByNameDesc);
    System.out.println(persons);
    // Person person = new Person();
    // person.swim();
    //new object <- "() -> sysout

    Swimable person1 = () -> System.out.println("Person1 am swimming");
    person1.swim();
 
   
    Swimable person2 = () -> {
    System.out.println("Person2 am swimming");
    System.out.println("Person 2 stop swimming");
    };
    person2.swim();

     Swimable person3 = () -> {
     System.out.println("Person3 am swimming");
     };
     person3.swim();
  }


}
