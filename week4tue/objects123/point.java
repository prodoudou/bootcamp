package week4tue.objects123;

import java.util.Objects;

public class point {
  public int x;
  public int y;
  
  public point(int x, int y){
    this.x = x;
    this.y = y;
  }

  public int getX(){
    return this.x;
  }

  public int getY(){
    return this.y;
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
   if(!(o instanceof point)){//o = p2//o 係咪Point生出黎
    return false;
   }

   point point = (point) o;// p2
   //return point.x == this.x && point.y ==this.y;
     return Objects.equals(point.x, this.x)//p2.x = p1.x  , at this moment  , point = p2
        && Objects.equals(point.y, this.y);//p2.y = p1.y
  }

  public static void main (String[] args){
   point p1 = new point(1, 1);
   point p2 = new point(1, 1);
   point p3 = new point(1, 2);
   System.out.println(p1==p2);//false "原本"＝＝係CHECK ADDRESS
   System.out.println(p1.equals(p2));// true// 
   System.out.println(p2.equals(p3));//false
   System.out.println(p3.toString());//[x=1], [y=2]

   System.out.println(points.toString(p3));// [x=1, y=2]
   

  
  }
}
