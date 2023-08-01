package week4tue.objects123;

import java.util.Objects;

public class Ball { //impicitly extends object
   private String color;


public Ball (String color){
  this.color= color;
}

@Override 
public int hashCode(){
  //Hash Code is not unique representation of objecet reference
return Objects.hash(this.color);
}


   @Override
   public boolean equals(Object o){
    // if adddress same, values inside the object mst be same
    if(this==o){
      return true;
    }
    if(!(o instanceof Ball)){
      return false;
    }
    Ball ball = (Ball) o;//downcast
    return ball.color.equals(this.color); //true or false//use equals beacuse this is string cant use >>==<<<
   }

@Override
public String toString(){

  return "[color=" +this.color//
         +"]";
}



public static void main(String []args){
  Ball b1 = new Ball ("Blue");// address 1
  Ball b2 = new Ball ("Blue");//address 2
   System.out.println(b1==b2);//false checking addres
  System.out.println(b1.equals(b2));//true, checking color, instead of memory
  System.out.println(b1);// [color =BLue]
  System.out.println(b1.toString());//[color =BLue]
   System.out.println(b1);
}

}
