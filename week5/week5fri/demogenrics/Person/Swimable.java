package week5.week5fri.demogenrics.Person;

import java.util.List;

public interface Swimable {
  
  void swim();

  //public static <T extends Swimable> void start(List<T> humans){
    public static void start(List<? extends Swimable> humans){ //上下都一樣
    for(Swimable human : humans){
      human.swim();
    }
    
    

  }

}
