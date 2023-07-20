import java.util.Random;
public class Random1 {
  
  public static void main (String[] args){

    int num = new Random().nextInt(3);// 0, 1, 2// 由0開始 3個indx
    System.out.println(num);
   
    System.out.println("------");

    // 1 -3?
    int num2 = new Random().nextInt(3) + 1;///target: random within 1,2,3 // +1 = random default is from 0
    System.out.println(num2);


    System.out.println(randomAbcde());
  }

// A, B, C,D ,E
public static char randomAbcde(){
  //Approach 1:
  //char [] chars= new chair []{'A', 'B', 'C','D','E'}
  //return chars [new Random().nextInt(5)]; 
   return (char) (new Random().nextInt(5) + 65);//(5) = 0 , 1, 2, 3, 4 // +65(char)= start from 'A' to count
}
}

