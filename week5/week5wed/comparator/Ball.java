package week5.week5wed.comparator;

import java.util.Comparator;

public class Ball implements Comparable<Ball> {
  int id;
  Color color;

  public Ball(int id, Color color) {
    this.id = id;
    this.color = color;
  }

  @Override
  public int compareTo(Ball ball) {// why exist here?? because someone call this
    // return ball.id > this.id ? 1 : -1;//如果ball.id大過this.id 就1, 如果大唔過就-1
    return this.id - ball.id;//
  }
  // Yellow come first, if color same, id ascending order
  // if not Yellow, id descending order

  // return this.color == Color.YELLOW ? 1 : -1;

  // @Override
  // public int compare(Ball b1,Ball b2){
  // //1 -> means ou want put b2 to left
  // //-1 -> means you want put b1 to left
  // if(b2.color == Color.YELLOW && b1.color == Color.YELLOW)
  // return b2.id < b1.id ? 1: -1;
  // if(b2.color == Color.YELLOW)
  // return 1;
  // if(b1.color == Color.YELLOW)
  // return -1;
  // return b2.color.id < b1.color.id ? 1 : -1;
  // }

  @Override
  public String toString() {
    return "[id=" + this.id//
        + ", color=" + this.color//
        + "]";
  }

}
