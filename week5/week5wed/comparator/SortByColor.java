package week5.week5wed.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortByColor implements Comparator<Ball> {

  @Override
  public int compare(Ball b1, Ball b2) {
    // 1 -> means ou want put b2 to left
    // -1 -> means you want put b1 to left
    if (b2.color == Color.YELLOW && b1.color == Color.YELLOW)
      return b2.id < b1.id ? 1 : -1;
    if (b2.color == Color.YELLOW)
      return 1;
    if (b1.color == Color.YELLOW)
      return -1;
    return b2.color.id < b1.color.id ? 1 : -1;
  }

  public static void main(String[] args) {

    ArrayList<Ball> balls = new ArrayList<>();
    balls.add(new Ball(4, Color.YELLOW));
    balls.add(new Ball(1, Color.RED));
    balls.add(new Ball(5, Color.BLUE));
    balls.add(new Ball(100, Color.RED));

    // Collections.sort(balls, new SortByColor());//影響唔到人地
    // System.out.println(balls);//

    // [[id=100, color=RED], [id=1, color=RED], [id=4, color=YELLOW], [id=5,
    // color=BLUE]]
    // balls.add(new Ball(100));
    Collections.sort(balls);
    ;// 排ID OR 名？？
    System.out.println("OUTPUT 1 : Comparable , 排ID number");
    System.out.println(balls);//

    Collections.sort(balls, new SortByColor());
    System.out.println();
    System.out.println("OUTPUT 2 : Comparator , 用 new SortByColor() 排顏色次序");
    System.out.println(balls);//
  }

}
