package week5.week5wed.comparator;

import java.util.Comparator;

public class Ball implements Comparable<Ball>{
  int id;
  Color color;



  public Ball (int id, Color color){
    this.id = id;
    this.color =color;
  }


  //Yellow come first, if color same, id ascending order
  //if not Yellow, id descending order
  @Override
  public int compareTo(Ball ball){//why exist here?? because someone call  this 
  //return ball.id > this.id ? 1 : -1;//如果ball.id大過this.id 就1, 如果大唔過就-1
  return this.id - ball.id ;// 

  //return this.color == Color.YELLOW ? 1 : -1;
  }

  @Override
  public String toString(){
    return "[id=" + this.id//
     + ", color=" + this.color//
     +"]";
  }
}
