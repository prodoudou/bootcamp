package week5.week5tue.queue1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.SortedSet;
import java.util.TreeSet;

public class DemoArrayDeque {
  
  public static void main(String[] args) {
    ArrayDeque<String> strings = new ArrayDeque<>();
    strings.add("abc");
    strings.add("def");
    strings.add("abc");
    System.out.println(strings.poll());//abc
    System.out.println(strings.size());//2
    strings.addLast("xyz");//addLast() = add()
    System.out.println(strings.poll());//def
    //System.out.println(strings);
    strings.addFirst("ijk");
//poll隊頭出 //add隊尾入
    System.out.println(strings.peek());//ijk
    System.out.println("test" +strings);
    System.out.println(strings.pollFirst());//ijk, pollfirst() = poll()
    System.out.println(strings.pollLast());//xyz  
    System.out.println(strings);


    Deque<String> deque = new LinkedList<>();//right side implement muliti left side <= 
    Queue<String> queue = new LinkedList<>();//queue new linkedlist  右邊係 implement 左邊interface,
    //queue係細D自 


    queue.add("abc");
    deque.add("abc");
    deque.addFirst("def");

    run1(new LinkedList<>());//linkedlist
    //左邊唔改改右邊： 控制input parameter 既數據結構 ,唔搞亂原有data
    run1(new ArrayDeque<>());//array
    //run1(new PriorityQueue<>();// compile-error

    run2(new LinkedList<>());//linkedlist
    run2(new ArrayDeque<>());//array
    run2(new PriorityQueue<>());//

   Collection<String> arraylist = new ArrayList<>();//
   //左手影響範圍,令programme簡單表達 右手影響input，背後行既底層logic不一樣
   
     List<String> list = new LinkedList<>();//hide deque methods 
     //??????????
     //ArrayList<String> list2 = new List<>();

    HashMap<String, String> test = new HashMap<>();

  }

    public static void run1(Deque<String> deque){
      //左邊唔改改右邊： 控制input parameter 既數據結構 ,唔搞亂原有data
      deque.addFirst("ss");
      deque.addLast("ss");
    }

     public static void run2(Queue<String> queue){
      //用唔返dequq method eg. addFirst
      queue.add("ss");
      queue.add("ss");
    }



  
}
