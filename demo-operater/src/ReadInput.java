import java.util.Scanner;

public class ReadInput{
  public static void main(String []args) {
    String str = "Hello";
    str.charAt(0);// H
    //Scanner
    System.out.println("Please input an integer:");
    Scanner s = new Scanner(System.in);
    int input = s.nextInt();// read user input, expecting it is an integer
    System.out.println("input=" +input);
     
    for (int i=1; i < input; i++) {
      System.out.println("i=" + i+ ",Hello!"); 


      // continue
      for(int m = 0; m < 6; m++){
        System.out.println("Hello");
        if(m > 3){
          continue; // go to the nxt iteration
        }
          System.out.println("bye");
          //i = 0, hello, bye
          //i = 1, hello, bye
          //i = 2, hello, bye
          //i = 3, hello, bye
          //i = 4, hello, 
          //i = 5, hello, 
          //i = 6, exit
        

      }






    }
}
}