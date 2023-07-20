import java.util.Scanner;

public class DowhileLoop {
 
  public static void main(String []args){
    //do=white, do first, then check condition to start looping
    int count = 0;
    do{
      System.out.println("hello, count=" + count);
      count++;
      
    }while (count <3);
    

    int input = 0;
     do{
      Scanner scanner = new Scanner(System.in);
      System.out.println("please a integer:");
      input = scanner.nextInt();

      //if input is even number -> continue, 
      //odd -> exit looop and priint the number
      // if(input)
      }
     while (input % 2 ==0);

     System.out.println("input =" +input);
     //scanner.close();

    }
  }

