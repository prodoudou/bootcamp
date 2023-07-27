package week3.demo_27jul;

public class Circle {
  
  private int id;//instane variable / attribute
  private double radius;
    //static -> shared variable
   // final -> one time initialization only
  
  private static final double pi = 3.14159;//final = 定理,// static variable// class variable
  //有同無有咩意思//static final //static final 有PI·

  private static int counter;
  //calculate the number of circle being created


  public Circle(){
    this.id++;   //ID同counter既分別？？？
    AddCounter();
  }

  public int getId(){
    return this.id;
  }
    public static void AddCounter(){
      counter++;//<---- count how many circle object you create
    }
  
  public double area(){
    return Math.pow(this.radius, 2) * this.pi;
  }
   
  public double circumference(){// 周界instance method = non-static method
    return 2 * radius * pi;// 2 * radius = 
  }

  public void setRadius(double radius){
    this.radius = radius;
  }

  public double getRadius(){
    return this.radius;
  }
  
  public static void main(String []args){
   Circle c = new Circle();// Construtor
   c.radius = 1;
   c.setRadius(2);
   c.area();
   c.circumference();
   System.out.println(c.getRadius());

   Circle c2 = new Circle();// Construtor
   c2.radius = 1;
   c2.setRadius(2);
   c2.area();
   c2.circumference();
  }
}
