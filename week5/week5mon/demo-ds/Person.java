public class Person implements Player{
  Pocket[]pockets;
  

  public Person(){
    this.pockets = new Pocket[]{new Pocket(), new Pocket()};//array [2] //length =2
    //this.pockets[0] = new Pocket();
    //this.pockets[0] = new Pocket();
   }
   
   public int totalScore(){
    return this.getLeftPocket().totalScore() + 
    this.getRightPocket().totalScore();
   }


  public Pocket getLeftPocket(){
    return this.pockets[0];
  }

   public Pocket getRightPocket(){
    return this.pockets[1];

  }


  
  public static void main(String[] args) {
    Person p1 = new Person();
    Player.fillThePocket(p1.getLeftPocket());
    Player.fillThePocket(p1.getRightPocket());
  
    System.out.println(p1.getLeftPocket().getSize());//5
    System.out.println(p1.getRightPocket().getSize());//5

    System.out.println("p1 Total Score:" + p1.totalScore());
    System.out.println("p1 Left pocket Ball Details:" +p1.getLeftPocket().toString());
    System.out.println("p1 right Pocket Ball Details: "+p1.getRightPocket().toString());

    

    Person p2 = new Person();
   Player.fillThePocket(p2.getLeftPocket());
    Player.fillThePocket(p2.getRightPocket());

    
  }
}
