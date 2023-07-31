package week3.demo_27jul;

public class Edge {
  
  private int id;
  private double length;
  private String color;
  private static int counter;
  

  public Edge(int id, double length, String color){
    this.id = ++counter;//++左先放入去？
    this.length = length;
    this.color = color;
  }

  public static void resetId(){
    counter = 0;
  }


  public void setLength(double length){
      this.length =length;
  }

  public void setColor(String color){
    this.color =color;
  }
  public String getColor(){
    return this.color;
  }

  public static void main(String[] args) {
    Square s1 = new Square(10);
    Square s2 = new Square(4);
    Square s3 = new Square(5);

    // s1-> edge[0] color -> yellow
    s1.getEdges()[0].setColor("YELLOW");// set arr[0] 既yellow// 點解唔可以直接打s1.setColor("YEllOW"),
    // s1.getEdges()<---做完呢會變左TYPE,變左做Edges[] , 所以能夠s1.getEdges()[0]搵data，seems like
    // arr[0] // 因為 color係edge入面 要入左去先
  
    System.out.println(s1.getEdges()[0].getColor());
Square test = new Square(2);
    //getEdges() has 4 address, getEdges ()[0] - >> 1 address
    //s1.getEdges() =

}
}