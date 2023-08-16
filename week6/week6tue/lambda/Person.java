package week6.week6tue.lambda;
public class Person {
  String name;

public Person(String name){
  this.name= name;
}


  public void swim(){
    System.out.println("Person is swimming");
  }

  @Override
  public String toString(){
    return this.name;
  }
  

  public static void main(String[] args) {
    // Person person = new Person();
    // person.swim();

    Swimable person1 = () -> System.out.println("Person1 am swimming");
    person1.swim();

    Swimable person2 = () -> System.out.println("Person2 am swimming");
    person2.swim();
  }
}
