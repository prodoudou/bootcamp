public class Dog extends GameMember implements Move {

  //int score = 0;
String name;

public Dog(){

}

@Override
  public void bigJump(){
    
  }

@Override
public void jump(){
  
  super.addScore(3);
}

@Override
public void up(){
  System.out.println("Moving up");
  super.addScore(2);
  System.out.println(super.getScore());
  //GameMember.up(this);
}

@Override
public void left(){

}

@Override
public void right(){

}

@Override
public void down(){

}

public static void main(String[] args) {
  Dog dog = new Dog();
  dog.print();//print () from GameMember of Move?
}


}

