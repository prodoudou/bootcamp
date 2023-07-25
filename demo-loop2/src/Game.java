import java.util.Random;
import java.util.Scanner;

public class Game {
  public static void main(String[] args){
    // 1- 100
    //bomb = 45(random number)
    //Next round: Please in put a number (1 - 100)
    //user input :30
    //Next round :Please input a number (31-100);
    //user  input 60
    //Next round: Please input a number (31 - 59);
    //user input 45
    //exit loop.bomb
    int min =1;
    int max = 100;
    int bomb = new Random().nextInt(100) +1;// 1- 100
    int input=0;
    Scanner scanner = new Scanner(System.in);
    
    
    
    
    do{
      System.out.println("please enter the number betwwen " + min + " - " +max);
      input = scanner.nextInt();// your answer 50// bomb is 90
       //debug syntax //min < input < bomb
      if(input < bomb && input > min ){ // min < input
       min = input;
      } else if(input > bomb && input < max){// input < bomb
       max = input;
      }
    }while(input != bomb);// if input bomb not match the bomb, if loop again
    System.out.println("bomb!!!!");

    


  }
}
