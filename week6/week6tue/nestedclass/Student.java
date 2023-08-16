package week6.week6tue.nestedclass;
import java.util.List;

//Outer Class
//Can Access static nested class attribute
public class Student {// Outer class
  private String name;
  // constructor, getterm setter, statuc method & variable
  Bag bag;
  //Grade grade;

  // public Student() {

  // }

  public Student(String name) {
    this.name = name;
    bag = new Student.Bag();
  }

  // method -> Bag.method, instance varible
  public int getBagSize() {
    return new Student.Bag().getSize();
  }

  public void clearBag() {
    Bag.clear(this.bag);// outer class access "Static nested class"
  }

  public static int add(int a, int b){
    return a + b;
  }

public String getName(){
  return this.name;
}

  @Override
  public String toString(){
    return "Student[name="+ this.name //
    +",["+ this.bag +"]"//
    +"]";
  }
  // static nested class
  // Cannot access Outer Class Attribute
  public static class Bag {// bag and student is indepentant// but bag is not belongs to student
    int size;
    List<String> strings;

    // constructor, getter setter,instance metho
    // this size is bag's size, even student has size, cant not access
    public int getSize() {
      return this.size;
    }
    // static method & variable
    public static void clear(Bag bag) {
      bag.strings.clear();
    }

    public void printStudentName(){
      System.out.println();
    }

    public static void printHello(){
      Grade.printHello();
    }


@Override
public String toString(){
  return "Bag[size=" + this.size//
    +"strings" + this.strings//
    + "]";
}


  }
  // Inner class (non-static nested class)
  public class Grade{
     private int score;// score = raw data;

     public int getScore(){
      return this.score;
     }

     //isMale()
     //isEldrly()
    public char getGrade(){
      switch(this.score){
        case 90:
        return  'A';
        case 80:
        return 'B';
        case 70:
        return 'C';
        default:
        return 'F';

      }
    }

    public Grade(int score){
      this.score=score;
    }


    public void printStudentName(){
      System.out.println(Student.this.getName());//John
    }

public static void printHello(){
  System.out.println("Hello");
}

  }

  public static void main(String[] args) {
    Student student = new Student("John");// student's constructor
    Student.Bag bag = new Student.Bag();// bag's constructor
    //bag.getSize();
    System.out.println(student.toString());// name
    Student.Grade grade = new Student("Peter").new Grade(70);//呢到係Object NEW 野 

    grade.printStudentName();;//John



  }

}