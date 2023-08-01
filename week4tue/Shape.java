package week4tue;

import java.math.BigDecimal;

public abstract class Shape { 

  public abstract double area();//<<<< main important//因為有abstract 唔比NEW


  public static void main(String []args){
    double total = 0.0d;
    BigDecimal b = BigDecimal.valueOf(total);
    b = b.add(BigDecimal.valueOf(5));//要個B 接住佢 好似STRING 咁
    System.out.println(b.doubleValue());//5.0

    //shapes are( exmaple)
  Circle10 circle = new Circle10(10.0d);
  Square10 square = new Square10(3.0d);
  Shape[] shapes = new Shape[]{circle, square};//
  System.out.println(Shape.area(shapes));// 10 * 10 * PI + 3 * 3
  }
   //factory Pattern
  public static double area(Shape[] shapes){
  BigDecimal total = BigDecimal.valueOf(0);
    for (Shape s : shapes){
  total = total.add(BigDecimal.valueOf(s.area()));
    }
  //  double answer = total.doubleValue();
    //return answer;
    return total.doubleValue();//轉返DOUBLE TYPE
  } 
}
