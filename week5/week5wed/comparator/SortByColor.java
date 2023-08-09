package week5.week5wed.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortByColor implements Comparator<Ball> {
  
  @Override
  public int compare(Ball b1,Ball b2){
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

//[[id=100, color=RED], [id=1, color=RED], [id=4, color=YELLOW], [id=5, color=BLUE]]
//balls.add(new Ball(100));
Collections.sort(balls);//排ID OR 名？？
System.out.println(balls);//
}




}
