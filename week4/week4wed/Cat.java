public class Cat extends GameMember implements Move {
  
  String name;
  
 @Override
  public void up(){
    System.out.println("Moving up");
    super.addScore(1);
    // System.out.println(super.getScore());
    //GameMember.up(this);
  
  }
  

  @Override
  public void jump(){
    System.out.println("Jump");
    super.addScore(4);
    //GameMember.up(this);
  }

  @Override
  public void bigJump(){
    
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
}
