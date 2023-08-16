package week6.week6mon.exception.unchecked;

public class DemoStringIndex {
  
  public static void main(String[] args) {
    try{
      "abc".charAt(3);
    }catch (StringIndexOutOfBoundsException e){
      System.out.println("String index issue");
    }
  }
}
