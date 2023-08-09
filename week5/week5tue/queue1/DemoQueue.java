package week5.week5tue.queue1;

import java.util.LinkedList;
import java.util.PriorityQueue;

import javax.swing.plaf.synth.SynthToolBarUI;

public class DemoQueue{
  public static void main(String[] args) {



    LinkedList<String> queue = new LinkedList<>(); //一睇priorityQueue 要就知 簡單排隊
    //First In First Out
    queue.add("hello");
    queue.add("world");
    System.out.println(queue.peek());// hello , peek the tube first element just peek,
    System.out.println(queue.poll());//hello
    System.out.println(queue.poll());// world
    System.out.println(queue.size());//0

    queue.add("abc");
    queue.add("def");
    queue.add("xyz");
    System.out.println(queue.remove("def"));//true
    System.out.println(queue.poll());//abc
    System.out.println(queue.poll());//xyz

    System.out.println(queue.offer("ijk"));//true add()
    System.out.println(queue.offer("abc"));//true add()
    System.out.println(queue.offer("ijk"));//add()暫當佢係add
    System.out.println(queue.size());//3


    if(queue.contains("ijk")){//true
     queue.remove("ijk"); //first occurence of element
    }
    


     LinkedList<String> backup =queue; //呢2個指住同一個OBJECT
    while(!queue.isEmpty()){//對付queue要用while loop
    
    System.out.println(queue.poll());//abc, ijk //
    }

    System.out.println(backup.size());//0 呢2個指住同一個OBJECT

    LinkedList<Integer> queueNum = new LinkedList<>();
    queueNum.add(10);
    queueNum.add(10);// 2nd even number
    queueNum.add(9);
    queueNum.add(0);
    queueNum.add(-3);
    queueNum.add(100);
    //10, 9 , -3. 100;

    int countEven =0;
    int element = 0;
     System.out.println("Start");
    //int first = queueNum.poll();//first = 10
    int size = queueNum.size();//6
    int i = 0;
    while(i++ < size){//??? compare完先＋＋？ // 0,1,2,3,4,5 <6
      element = queueNum.poll();
      if(element % 2 == 0 && ++countEven ==2){
      {
        //size--;
        continue;
      }
    }
        queueNum.add(element);
    } 
    System.out.println(queueNum);


  }
  }