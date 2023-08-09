package week5.week5wed.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DemoSorting {
  public static void main(String[] args) {
    int [] arr = new int[] {4, -10, 9, -20, 100};
    Arrays.sort(arr);// n * logn, merge sort
    System.out.println(Arrays.toString(arr));

ArrayList<Integer> arrayList = new ArrayList<>();
arrayList.add(100);
arrayList.add(-100);
arrayList.add(-88); 
arrayList.add(4);
Collections.sort(arrayList);//nlogn ,ascend sorting
System.out.println(arrayList);//[-100, -88, 4, 100]

ArrayList<Ball> balls = new ArrayList<>();
balls.add(new Ball(4, Color.YELLOW));
balls.add(new Ball(1, Color.RED));
balls.add(new Ball(5, Color.BLUE));



//balls.add(new Ball(100));
Collections.sort(balls);//排ID OR 名？？
System.out.println(balls);//


   // nlogn + n
   //reverse
   //for (int i = arr.length)


  }
}
