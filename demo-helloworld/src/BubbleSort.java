import java.util.Arrays;

public class BubbleSort {
  public static void main(String []args){
    //[5, 1, 4, 8, 2] max number to right side, step by step,
    //step1.1: [1, 5, 4, 8, 2] index 0 compare to index 1 = 1 , 5
    //Step1.2: [1, 4, 5, 8, 2]
    //step1.3: [1, 4, 5, 8, 2] no swap, due to 5 < 8)
    //step1.4: [1, ,4, 5, 2, 8]

    //step2.1: [1, 4, 5, 2, 8] no swap, due to 1 < 4)
    //step2.2: [1, 4, 5, 2, 8] no swap, due to 4 < 5)
    //step2.3  [1, 4, 2, 5, 8] swapped 2 < 5
    //step2.4  [1, 4, 2, 5, 8] no swap, due to 5 < 8

    //step3.1  [1, 4, 2, 5, 8] no swap
    //step 3.2 [1, 2, 4, 5, 8] swapped 2 < 4
    //..
    //target: [1, 2, 4, 5, 8]
    int temp = 0;
    int [] nums = new int[] { 5, 1, 4, 8, 2};
    
   
      System.out.println(Arrays.toString(sort(nums)));
      
  }


  public static int[] sort(int []arr){
  int temp = 0;
      for (int i = 0; i < arr.length-1;++i){ // i < 2 = every step pattern is swap first number and second number
      for (int y = 0;y < arr.length- 1-i; y++){// -1 = times of comparison
        if(arr[y] > arr[y+1]){//y < y+1 = first number compare with second number
         temp = arr[y];
          arr[y] = arr[y+1];
          arr[y+1] = temp;
        }
        }
      }
      return arr;
    }
  }
