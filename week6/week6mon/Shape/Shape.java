package week6.week6mon.Shape;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Shape<T> {
  abstract double area();

  // public static <T extends Shape>double area(List<T> shapes){
  public static double area(List<? extends Shape> shapes) {// 上下2個情況都可以寫
    BigDecimal total = BigDecimal.ZERO;
    // shapes.add(new circle(]'');//compile-tiem check, type-safe
    for (Shape shape : shapes) {
      // total = total.add(BigDecimal.valueOf(shape.area()));
    }
    return total.doubleValue();
  }

  public static void main(String[] args) {
    // Polymophism
    Shape shape = new Circle(); // Polymophism
    Shape shape2 = new Square(); // Polymophism
    ArrayList<Shape> shapes = new ArrayList<Shape>();
    // shapes = new ArrayList<Circle>();// compil-error //呢個唔係Polymophism
    List<? extends Shape> list = new ArrayList<Square>();// ? extends shape 度門太闊
    // right side <> is declare square arrlist
    list = new ArrayList<Square>();// OK
    List<? extends Shape> list9 = new ArrayList<>();

    list9 = new ArrayList<Square>();// OK
    // list = new ArrayList<Shape>();//OK

    //list.add(new Circle());// compile check refer to declaration
    Shape<Circle> test001 = new Circle();

    List<Map<String, String>> list2 = new ArrayList<>();
    list2.add(new HashMap<>());
  }
}
