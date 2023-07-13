public class Loop {
  public static void main(String [] args) {
   // For Loop


  for (int i = 0;i < 4; ++i){
    System.out.println("i=" + i+ ", Hello");
    //logic flow
    // i = 0 -> - < 4 , print 1st Hello
    // ++1 -> i = 1 -> 1 < 4 ,print 2nd Hello
    // ++1 -> i = 1 -> 2 < 4, 3rd Hello
    // ++1 -> i = 1 -> 3 < 4, 4th Hello
    // ++1 -> i = 1 -> 4 < 4 is not smaller htan 4, exit loop
  }
  for (int j = 6; j > 0; j--){
   System.out.println("j= " +j); //6times
  }
 
  int max = 10;
  int total = 0;
  for (int i = 1; i < max; ++i){
    total += i; // 0,1 ...9
    System.out.println(total);
  }

 int sum1 = 0;
 for (int i = 1; i <= 10; i++){
 sum1 += i;
 System.out.println(sum1);
 }




int sum4 = 0;
for (int k = 1;k <= 10;k+=2 ){
  System.out.println("sum4 = " + sum4);
  System.out.println("k = " + k);
  sum4 += k;
  System.out.println("Final sum4 = " +sum4);
  System.out.println();

}

int sum5 = 0;
for (int j=1;j<10;j++){
  if(j%2==1){
    System.out.println("j value is "+j );
    System.out.println("sum5 value is "+sum5 );
    sum5+=j;
    System.out.println("j + sum5 value is "+sum5 );
    System.out.println(); 
  }
}



 //Sum upp all odd number
 //Sum up all odd numbers, except5
 int sum= 0;
 int sumoOddnumWithout5=0;
 for (int i = 0; i < 10; i++){
 //odd number
 if(i %2 ==1){
  sum += i;

  System.out.print("s");
 }
 if (i % 2 == 1 && i != 5){
  sumoOddnumWithout5 += i;
 }
 }

for (int i = 0; i < 5; ++i){
  System.out.println("hello");
  if ( i > 2){
    break;

}
}
 // continue
 for(int m = 0; m < 6; m++){
  System.out.println("Hello");
  if(m > 3){
    continue; // go to the nxt iteration
  }
    System.out.println("bye");}
    //i = 0, hello, bye
    //i = 1, hello, bye
    //i = 2, hello, bye
    //i = 3, hello, bye
    //i = 4, hello, 
    //i = 5, hello, 
    //i = 6, exit

    ///////////
    //Nest Loop
    /*for (int i = 0; i < 4; i++){
      for (int j = 0; j < 3; j++){
        System.out.println("hello");
    }
  }*/
     //how many hello?
     // i= 0, j = 0, hello
     // i= 0, j = 1, hello
     // i= 0, j = 2, hello
     // i= 0, j = 3, exit
     // i= 1, j = 0, hello
     // i= 1, j = 1, hello
     // i= 1, j = 2, hello
     // i= 1, j = 3, exit
     // i= 2, j = 0, hello
     // i= 2, j = 1, hello
     // i= 2, j = 2, hello
     // i= 2, j = 3, exit
     // i= 3, j = 0, home
     // i= 3, j = 1, home
     // i= 3, j = 2, home
     // i= 3, j = 3, exit

     //* 
     //**
     //***
     //****
     //*****
     for (int a = 1; a < 5 ;a++ ){
      for(int b = 1; b <= a ;b++){
      System.out.print("*");
      }
      System.out.println();
     }





}
}


  
  
