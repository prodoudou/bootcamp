package week6.week6mon.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AnimalMap<T> {// java removed this feature
  Map<T, String> map;
  ArrayList<Integer> num;

  public AnimalMap() {
    map = new HashMap<>();
    //num = new ArrayList<>();
  }

  public void put(T key, String animal) {
    map.put(key, animal);
  }

  public static void main(String[] args) {
    AnimalMap<String> map1 = new AnimalMap<>();
    map1.put("abc", "Dog");

    AnimalMap<Integer> map2 = new AnimalMap<>();
    map2.put(1, "Dog");

   // map1.num.add(3);// null 因為你無new 個object
    System.out.println(map1);
    System.out.println(map1.num);

  }
}
