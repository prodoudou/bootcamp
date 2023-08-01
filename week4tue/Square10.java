package week4tue;

public class Square10 extends Shape{
  private double length;


  public Square10(){

  }

  public Square10(double length){
   this.length = length;
    
  }
  @Override
  public double area(){
    return Math.pow(this.length, 2);//Math pow = 次方
  }
}
