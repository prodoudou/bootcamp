package week6.week6tue.nestedclass;
public class Demo {
  public static void main(String[] args) throws CheckException {

    try {
      System.out.println("Hello world");
      throw new CheckException();
    } catch (CheckException e) {
      System.out.println(e.getMessage());
    }

    // try{
    // System.out.println("hello world");
  throw new CheckException();
    // }catch (checkException e){

    // }
    // throw new checkException();
  }
}