package enums;

public enum Direction {//special keyword since Java 1.5
  //1. public class Direction extends Enum
  //2. enum is final class 無野可以extend enum



  //全局唯一, 4object (EAST, SOUTH,WEST,NORTH)
  // new Direction("EAST")
  EAST('E',90),//
  SOUTH('S', 180),//
  WEST('W', 270), //
  NORTH('N',360),
  ;//個個. 佢都係同一個VALUE

  private char direction;
  private int degree;


  private Direction (char direction,int degree){//背後自己有人CALL 可以當佢係廢//因為我enum要有id同degree value
   this.direction = direction;
   this.degree = degree;
  }

  public char getDirection(){
    return this.direction;
  }

  public int getDegree(){
  return this.degree;
  }

  public boolean isOppsite(Direction direction){
    return Math.abs(this.degree - direction.getDegree())== 180;
  }


  public static void main(String []args){
    System.out.println(Direction.EAST);//EAST
    System.out.println(Direction.EAST.name());//EAST
    System.out.println(Direction.NORTH);//

    Direction east = Direction.EAST;//TBC (heap)
    System.out.println(east == Direction.NORTH);//false; in this example is checking address refer above syntax
    System.out.println(east != Direction.NORTH);//true
    // == and != are checking the object reference

    //value() -> loop
    for(Direction d:Direction.values()){//{Direction.values()->>> static 
      System.out.println((d.name())); 
    }

    System.out.println(Direction.SOUTH.ordinal());//1
    System.out.println(Direction.EAST.ordinal());//0

    System.out.println(east.getDegree());//90
    System.out.println(east.getDirection());//90
    
    Color c1 = Color.RED;
   
    
    System.out.println(c1.getColor());
    System.out.println(Color.GREEN);

    System.out.println(Direction.EAST.isOppsite(Direction.WEST));//true/use object call method is not static method
    System.out.println(Direction.WEST.isOppsite(Direction.EAST));//true
    System.out.println(Direction.EAST.isOppsite(Direction.NORTH));//false





    }
  }
