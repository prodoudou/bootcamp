package week5.week5fri.demogenrics.;

import java.util.ArrayList;
import java.util.List;

import week5.week5fri.demogenrics.Person.Person;
import week5.week5fri.demogenrics.box.Box;
import week5.week5fri.demogenrics.zoo.Animal;
import week5.week5fri.demogenrics.zoo.Cat;
import week5.week5fri.demogenrics.zoo.Dog;
import week5.week5fri.demogenrics.zoo.Zoo;

public class DemoGenerics {
  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<>();

    // Animal Example(
    Zoo<Dog> zoo1 = Zoo.of(Dog.of("wolf"));

    // zoo1.setAnimal(new Cat()); Comopli errot, strong type check
    zoo1.setAnimal(Dog.of("def"));

    Zoo<Animal> zoo2 = Zoo.of(new Cat());
    zoo2.setAnimal(new Animal());// ?
    zoo2.setAnimal(Dog.of("abc"));// ?
    zoo2.setAnimal(new Cat());// ?

    // Zoo<String> zoo3 = Zoo.of("Abc");
    // String is not extending Animal

    Box<Integer> box = getBox(Integer.valueOf(100));
    Object object = getBox(Double.valueOf(1.0d)); //
    // Object object <- Box<Double>
    Box<Double> d1 = (Box<Double>) object;
    for (double d : d1.getNumbers()) {
    System.out.println(d);// 1.0
    }

    List<Person> strings3 = new ArrayList<>();
    Database<Integer> strings4 = new Database<>();

    Database.add(new Person());// static method is independent" generic"

    



  }

  public static <T extends Number> Box<T> getBox(T element) {
    return new Box<>(element);
  }

}
