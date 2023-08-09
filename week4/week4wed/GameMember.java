public abstract class GameMember {

  private int score;

  public int getScore() {
    return this.score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public void addScore(int score) {
    this.score += score;
  }


  public void print(){
    System.out.println("GameMemberis jumping");
  }

  public abstract void up();

  public abstract void down();

  public abstract void left();

  public abstract void right();

  public static void upOnce(GameMember... members) {// >>...<< is in other way to show array
    for (GameMember member : members) {
      member.up();// dog / student objects
    }
  }

  public static void moveOnce(Move[] members) {
    for (Move member : members) {
      member.jump();// dog / student objects
    }
  }

  public static void main(String[] args) {

    Dog dog = new Dog();
    Cat cat = new Cat();
    // GameMember[] a = new GameMember[]{dog,cat};
    GameMember.upOnce(dog, cat);//

    System.out.println(dog.getScore());// 2
    System.out.println(cat.getScore());// 1

    Move[] members = new Move[] { dog, cat };
    GameMember.moveOnce(members);
    System.out.println(dog.getScore());// 5
    System.out.println(cat.getScore());// 5
    
    //interface move default instance method
    dog.print();
    cat.print();
    //static method
    System.out.println(Move.concat("abc", "def"));
    
    //
    Cow cow = new Cow();
    cow.print();

  }

}
