package week6.week6wed.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoArrayList {
  public static void main(String[] args) {
    List<String> strings = new ArrayList<>();
    strings.add("abc");
    strings.add("ghi");
    strings.add("def");

    // for-each
    for (String s : strings) {
      System.out.println(s);
    }

    // stream
    Stream<String> streamStrings = strings.stream();// <<<instance method
    // strean.Filter
    streamStrings = streamStrings.filter(s -> s.startsWith("a"));
    // Strean,forEAch
    streamStrings.forEach(s -> System.out.println("test= " + s));// abc //foreach(consumer's return type is void
                                                                 // 所打唔係TYPE既野)

    strings.stream()//
        .filter(s -> s.endsWith("i"))//
        .forEach(s -> System.out.println(s));// ghi

    List<String> strings2 = strings.stream()// list ->> stream
        .filter(s -> s.length() == 3)// s is string??
        .collect(Collectors.toList());// list??? //最尾係用.collect 所以要搵返List 接住佢refer 31 line

    System.out.println("strings2 size = " + strings2.size());// 3

    List<Integer> lengths = strings2.stream()//
        .filter(e -> e.startsWith("a") || e.startsWith("d"))
        .map(e -> e.length())// Stream<Integer>// map function
        .collect(Collectors.toList());

    lengths.forEach(e -> System.out.println(e));// 3 3

    strings2.stream()//
        .sorted((s1, s2) -> s2.compareTo(s1))// descebdubg order// natural order// this is stream type then nd to change
                                             // type
        .collect(Collectors.toList())
        .forEach(s -> System.out.println(s)); // use collect to chnage type

    if (strings2.stream()//
        .anyMatch(e -> e.startsWith("a"))) {
      System.out.println("one of the elements starts with a");
    }

    // interminate operations of Stream:
    // filter(), map(), sorted(), anyMatch()

    // terminated operations of Stream:
    // collect(), forEach(), count()

    // Stream can only terminate once,
    // but it may have multiple intermineate operations

    List<Person> persons = Arrays.asList(new Person("John", 30), new Person("Mary", 25));
    // stream -> get all the ages from persons
    List<String> names = persons.stream()//
        .map(e -> {
          return e.getName();
        }) // Stream<String>
        .collect(Collectors.toList());

    System.out.println(names);

    System.out.println(names.stream()
        .filter(e -> e.startsWith("John"))
        .count());

    // Stream static mehtod

    long l = Stream.of("abc", "def", "ghivv")//
        .filter(e -> e.length() == 3)
        .distinct()// remove duplicates
        .count();// 1

    List<Integer> integers = Stream.of(1, 2, 3, 4)//
        .filter(e -> e == 2)//
        .map(e -> {
          System.out.println("map" + e);// 2//
          return 2;
        })// .forEach( E )
        // .count();// terminate operation
        .collect(Collectors.toList());

    System.out.println(integers);

    int setSize = Stream.of(1, 2, 3, 3)//
        .collect(Collectors.toSet()).size();// toSet=整走duplicate
    System.out.println(setSize);// 3

    Stream.of(1, 2, 3, 3, 5)//
        .filter(e -> e < 6 && e > 2)//
        .forEach(e -> System.out.println(e));// 3 3 5

    List<String> animals = Arrays.asList("lion", "tiger", "bear");

    Map<String, Integer> animalMap = animals.stream()//
        .collect(Collectors.toMap(string -> string, snakelength -> snakelength.length()));
        //Function <? super T, ? extends K> 
        // Method   R apply(T t)
        // e -> R
        
    /// LoopMap
    for (Map.Entry<String, Integer> entry : animalMap.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

    // Stream.iterate()
    Stream.iterate(1, n -> n + 2)// n+=2 , n = n + 2
        .limit(10)//
        .forEach(e -> System.out.println(e));
    // Group by
  }

  public static boolean findElderlry(List<Person> persons) {
    return persons.stream()
        .filter(e -> e.getAge() >= 65)// Stream<>
        .findFirst()// Optional <>Person
        .isPresent();// boolean if 有就離開

  }

    }