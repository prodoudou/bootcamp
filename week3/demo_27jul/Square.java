package week3.demo_27jul;

import java.util.Arrays;

public class Square {

  private final Edge[] edges;// instance varible// what is final array???? final 緊D咩？

  // public Square(){//empty constructor
  // this.edges = new Edge [4];//[null, null, null, null]
  // this.edges[0] = new Edge(3, "RED");
  // this.edges[1] = new Edge(3, "YELLO");
  // this.edges[2] = new Edge(3, "BLACK");
  // this.edges[3] = new Edge(3, "BLUE");
  // }

  public Square(double length) {
    if (length <= 0.0)
      length = 1.0d;
    this.edges = new Edge[4];
    this.edges[0] = new Edge(length, "RED");
    this.edges[1] = new Edge(length, "RED");
    this.edges[2] = new Edge(length, "RED");
    this.edges[3] = new Edge(length, "RED");
  }

  public Edge[] getEdges() {
    return this.edges;
  }

  // public Edge getColor(){
  // return this;
  // }

  public static void main(String[] args) {
    Square s1 = new Square(10);
    Square s2 = new Square(4);
    Square s3 = new Square(5);

    // s1-> edge[0] color -> yellow
    s1.getEdges()[0].setColor("YELLOW");// set arr[0] 既yellow// 點解唔可以直接打s1.setColor("YEllOW"),
    // s1.getEdges()<---做完呢會變左TYPE,變左做Edges[] , 所以能夠s1.getEdges()[0]搵data，seems like
    // arr[0] // 因為 color係edge入面 要入左去先

    System.out.println(s1.getEdges()[0].getColor());
  }
}
