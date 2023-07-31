package week3.demo_27jul;

import java.util.Arrays;

public class Square {
  //private static int edgecounter;
  private final Edge[] edges;// instance varible// what is final array???? final 緊D咩？
//唔能夠派去第2個address// this is final the arr[]既address

  // public Square(){//empty constructor
  // this.edges = new Edge [4];//[null, null, null, null]
  // this.edges[0] = new Edge(3, "RED");
  // this.edges[1] = new Edge(3, "YELLO");
  // this.edges[2] = new Edge(3, "BLACK");
  // this.edges[3] = new Edge(3, "BLUE");
  // }

  public Square(double length) {//this designe????????用家唔應該擔心lengh array？？？
    if (length <= 0.0)
      length = 1.0d;
      int id = 0;
    this.edges = new Edge[4];//[null nulll nnull] //第一個汳
    this.edges[0] = new Edge(++id,length, "RED");//第二個汳
    this.edges[1] = new Edge(++id, length, "RED");//第三個汳
    this.edges[2] = new Edge(++id, length, "RED");//第四個汳
    this.edges[3] = new Edge(++id, length, "RED");//第五個汳
    //Square.resetId();
  }


 
  
// public static void resetId(){
// edgeCounter = 0;
// }



  public Edge getEdge( int edgeId){
    return this.edges[edgeId - 1];//num[i]
  }





  public void modify(double length){
    this.getEdges()[0].setLength(length);
    this.getEdges()[1].setLength(length);
    this.getEdges()[2].setLength(length);
    this.getEdges()[3].setLength(length);
  }

   public void modify(String color){
    this.getEdges()[0].setColor(color);
    this.getEdges()[1].setColor(color);
    this.getEdges()[2].setColor(color);
    this.getEdges()[3].setColor(color);
   }

   public void modify(int edgeId, String color){
    this.getEdges()[edgeId].setColor(color);
   }

   public Edge[] getEdges() {//
    return this.edges;
  }

  // public Edge getColor(){
  // return this;
  // }

}
