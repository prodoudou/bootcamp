package week4mon.abstract1;

public class Student extends Adult{
  //Must implement abstract method


  public Student(){
    super();// new adult()
  }
  public void sleep(){
    System.out.println("I am student, sleeping");
  }

  public void read(){
    System.out.println("I am student, reading");
  }

  // public void run(){
  //   System.out.println(" im running");
  // }

  public static void main (String[] args){
    Student student = new Student();
    student.sleep();
    student.read();
    student.run();
    student.eat();
    System.out.println(student.getAge());//belongs to person through adult//
    //adult>>>>person>>>getage = 0
  }
}
