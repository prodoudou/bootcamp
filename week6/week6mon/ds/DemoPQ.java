package week6.week6mon.ds;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPQ  {
  
  public static void main(String[] args) {
    //Priority: natural order by default
    Queue<String> queue = new PriorityQueue<>();
    queue.add("bcd");
    queue.add("abc");
    queue.add("def");
    System.out.println(queue.poll()); // abc // sort by ACII cod

//Priotiry Custom Priority by Comparator
  Queue<String> custom = new PriorityQueue<>(new SortByDescending());
    custom.add("bcd");
    custom.add("abc");
    custom.add("def");
    System.out.println(custom.poll()); //def
    //Collections.sort(custom, new SortByDescending());

    


  }

}
