import java.util.Arrays;

public class swap2 {
  public static void main(String[]args){
    int[] nums = new int[]{8, 3, 200, -10, 30, 100, -19};
    //move the max number to the tail
    //{8, 3, -10, 30, -19, 100}
    //Step1: find the index of the max number
    int max = 0;
    int count = 0;
    for (int i = 0; i < nums.length;i++){// lenght = 6
      if (nums[i] > max){//1, 8> 0.  2, 3 > 8  3, -10 > 8 , 4, 30 > 8   5, 100 > 30    6, -19 > 100
      max = nums[i];// 1, max = 8.  2, false   3, false.    4, max = 30  5, max = 100  6,  false 
      //first loop is looking for the max
      count = i; // count is max position = nums[4] = 100// count = 0, count = 3, count = 4
    }
     //step2 : swap the max number to tail
     //int tem

  }
 for (int i = count; i < nums.length -1;i++){ // second loop// 張MAX 後面既NUMBER 逐個逐個調上去
  nums[i] = nums[i+1];//first transformation is 100 = -19, 
 }
nums[nums.length-1]=max; // 張MAX放係最後 
System.out.println(Arrays.toString(nums));




int [] testCase= new int []{2, 3, 0};
System.out.println(average(testCase));// ~1.6667

int[] classA = new int []{20, 30, 80};
int[] classB = new int []{90, 30, 100};

if (average(classA)> average(classB)){
  System.out.println("Class A has a higher average score");
}


}

public static double average(int[]arr){
  //calculate the average of all numbers in arr

double sum = 0;// must double , if 

for (int i = 0; i < arr.length;i++){
  sum += arr[i];// sum = add all values
}
  double aver = sum / arr.length; //give variable to avere 

  return aver; // 
}



}