package week4tue.objects123;

import java.util.Objects;

public class Point {
  public int x;
  public int y;
  
  public Point(int x, int y){
    this.x = x;
    this.y = y;
  }

  public int getX(){
    return this.x;
  }

  public int getY(){
    return this.y;
  }

 public static void print(Long x){
  System.out.println(x);
}

@Override
public String toString (){
  return "[x=" + this.x//
  + ",y=" + this.y//
  + "]";
}

  @Override 
  public int hashCode(){
  return Objects.hash(this.x, this.y);
  }

    @Override
  public boolean equals(Object o){//o = p2//refer to line 33
   if (this == o){//o = p2// this =p1
    return true;
   }
   if(!(o instanceof Point)){//o = p2//o 係咪Point生出黎
    return false;

   }

   Point point = (Point) o;// p2
   //return point.x == this.x && point.y ==this.y;
     return Objects.equals(point.x, this.x)//p2.x = p1.x  , at this moment  , point = p2
        && Objects.equals(point.y, this.y);//p2.y = p1.y
  }

  public static void main (String[] args){
   Point p1 = new Point(1, 1);
   Point p2 = new Point(1, 1);
   Point p3 = new Point(1, 2);
   System.out.println(p1==p2);//false "原本"＝＝係CHECK ADDRESS
   System.out.println(p1.equals(p2));// true// 
   System.out.println(p2.equals(p3));//false
   System.out.println(p3.toString());//[x=1], [y=2]

   System.out.println(points.toString(p3));// [x=1, y=2]
   
      }

  
  }
