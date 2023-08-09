public class Student extends Person 
implements Runnable, Swimable, Move {// class signature

  private String name;

  //private int score;

  @Override
  public void jump() {

  }

  // @Override
  // public void right() {

  // }

  // @Override
  // public void up() {
  //   this.score += 1;
  // }

  // @Override
  // public void down() {

  // }
  @Override
  public void bigJump(){
    
  }


  @Override
  public void breath() {

  }

  @Override
  public void run() {
    System.out.println("student is  running");
  }

@Override
  public void eat(){
    System.out.println("student is  eatting");
  }
@Override
public void swim() {
 
  
}


  public static void main(String[] args) {
    // MAX_SPEED
    System.out.println(Move.MAX_SPEED);// 10

    Move student = new Student();// interface can declare variable
    student.jump();
    // student.down();
    // student.left();
    // student.right();
    // System.out.println(move.MAX_SPEED);//not recommened
    Move dog = new Dog();
    dog.jump();
    // dog.down();
    // dog.left();
    // dog.right();

    Swimable swimable = new Student();
    swimable.swim();

    Person person = new Student();
    person.breath();
    person.getAge();
  }
}