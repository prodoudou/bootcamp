public class WhileLoop {
  public static void main (String[] args) {
    //while 
    int count = 0;
    while (count <5){//coninue condition: true / false 
      count++;
    }
    // count = 5
    
    boolean isHoliday = false;
    int counter = 0;
    while (!isHoliday){//Is not holday
      
      System.out.println("counter= " + counter);
      counter++;
    if (counter > 6){
      isHoliday = true;
    }
     }
     int c = 0;
     while(c >= 0 && c <5){// mostsly two variable in while boolean while loop condition 
      System.out.println(c);
      c++;
     }
       
     int a = 0;
     int b = 10;
     while (a < 5 || b > 0){
      System.out.println("hell at this moment a= "+a+" b = "+b );
      a++;
      b--;
     }
// break; contiune;
int k = 0;
while (k < 6){
  System.out.println("break: hello");
  k++;
  if(k > 3 ){
    break;
  }
}
// continue
  int j = 0;
  while (j < 6){
  j++;
  if(j > 3){
  continue;
}
  System.out.println("continue hello"+j);

    }
  }
}
