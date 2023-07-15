/**
 * Expected output:
 * 1 1 2 3 5 8 13 21 ...
 * 
 */

public class JavaQuest6 {
  public static void main(String[] args) {
    // for loop to print first 15 numbers in Fibonacci Sequence
    int after,before,answer;
      after = 1;
      before = 0;
      answer = 1;
      System.out.println(answer);
      int count = 0;
    for(int i = 1;i < 15;i++){
      answer = before + after;
      before = after;
      after = answer;
      System.out.println(answer);
    
      
    }
  }
}
