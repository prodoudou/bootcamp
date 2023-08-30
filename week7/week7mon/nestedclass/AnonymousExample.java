package week7.week7mon.nestedclass;

import java.util.LinkedList;
import java.util.Queue;

interface Reading {
  void read();
}

public class AnonymousExample {
  public static void main(String[] args) {
    Reading read1 = () -> {
      System.out.println("I am lambda, reading...");
    };

    read1.read();

    Reading read2 = new Reading() {

      int x;

      @Override
      public void read() {
        this.x++;
        System.out.println("I am anonymous, reading" + x);
      }
    };
    
    read2.read();
    read2.read();

  }
}
