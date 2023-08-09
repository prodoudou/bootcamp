package week4mon.abstract1;


public abstract class Adult extends Person {
  //abstract class extends abstract class
  //implicitly " extends" abstract method
 
 public Adult(){

 }
//  public void sleep(){
//    System.out.println("hi");
//   }
 public abstract void read ();
 //public abstract void run ();

  public void eat(){
    System.out.println("I am Adult, eating");
  }
}
