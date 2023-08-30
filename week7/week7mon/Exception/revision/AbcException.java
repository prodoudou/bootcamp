package week7.week7mon.Exception.revision;

public class AbcException extends RuntimeException{
  // by Zero
  // null pointer
  // array size (out bound)
  // concurrentModification
  public AbcException(){
    super("abc");
  }


  public static void main(String[] args) {
    int a = 10/0;
  }
}