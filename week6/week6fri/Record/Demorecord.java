package week6.week6fri.Record;

import java.util.HashSet;
import java.util.Set;

public class Demorecord {
  public static void main(String[] args) {
    Person person = new Person("John", 30);

    Person1 person1 = new Person1("John", 30);
    Person1 anotherPerson = new Person1("John", 30);

    System.out.println(person.getAge());// 30
    System.out.println(person1.age()); // 30

    System.out.println(person.getName());// 30
    System.out.println(person1.name()); // 30

    System.out.println(person1.equals(anotherPerson));// true;
    System.out.println(person1);// Person1 [name= JOhn, age =30]

    System.out.println(person1.hashCode() == anotherPerson.hashCode());//true

    // HashMap, set -> equal(), hascode
    Set<Person1> set = new HashSet<>();
    set.add(person1);
    System.out.println(set.add(anotherPerson));// false
  }
}
