package week4tue;

public class Circle10 extends Shape {
   
  private double radius;

public Circle10 (){
  
}

public Circle10(double radius){
  this.radius=radius;
}


  @Override
  public double area() {//半徑*半徑 *PI ＝ area
    return Math.pow(this.radius, 2) * Math.PI;
  }

  public void print(){
    System.out.println("I am circle10");
  }
}
