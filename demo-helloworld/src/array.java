import java.util.Arrays;

public class array {
  public static void main(String[]args){
  int num = 7;
  int num2 =8;
  int num3 = -30;


  // create Empty array (Approach 1)
  int [] nums = new int[3]; // 3 is the length of array nums
  //with index 0,1,2

  nums[0] = -40;
  nums[1] = 500;
  nums[2] = -1000;
  nums[0] = 50000;
  // nums [3] = 5;// ArrayIndexOutOfBounds Exception: Index 3out of bounds for length
  //your turn
  // double []

  double [] arr = new double [6];
  arr [0] = 0;  // 1st data
  arr [1] = 1;
  arr [2] = 2;
  arr [3] = 3;
  arr [4] = 4;  // 5th data
  arr [5] = 7;  // 6th data
  //arr [1] = 'a';//later
  //arr[0] = "123"; //type Issue
  //char[], int[],String[]
  
  //foR loop
  for ( int i = 0; i < nums.length; i++){// numslenght -> 3
   System.out.println("nums[" + i + "]=" + nums[i]);
  }
  //reversely print array nums
  for (int i = arr.length-1; i >=0;i--){
    System.out.println("arrs[" + i +"]=" + arr[i]);
  }
  //approach 2, creat array
  int [] array = new int []{3, 9, 12};
  for (int i = 0;i < nums.length; ++i){
    System.out.println("array[" + i +"] = " + array[i]);
  }
   //can add a new element at tail ? No
   //Modify an element
   array[2] = -10;
   //Access an elemnt
   int index = 2;
   System.out.println(array[index]); // -10

   //char[]
   char[] chars = new char[3];
   chars[2] = 'a';
   chars[0] = 'i';
   for (int i = 0; i < chars.length;i++){
    System.out.println("chars[" + i +"] = " + chars[i]);
   }

   long[] numbers = new long[4];
   numbers [0]=123;
   for (int i = 0; i < numbers.length;i++){
    System.out.println("numbers[" + i +"] = " + numbers[i]);
   
  }
  boolean[] arr2 = new boolean[2];
  arr2 [0] = true;
  for (int i= 0; i < arr2.length;++i){
   System.out.println("arr2[" + i +"] = " + arr2[i]);
  }
  //String
  String[] strs = new String[]{"Hello", "abc","goodbye"};
  strs [1]= "Typoon";
  for ( int i = 0;i <strs.length;++i){
  System.out.println("strs[" + i + "]=" + strs[i]);
  }
  
  String [] fruits = new String[5];
  fruits[0] = "apple";
  fruits[1] = "watermelon";
  fruits [2]= "orange";

  System.out.println(Arrays.toString(fruits));
  //[apple, watermelon, orange, null, null]


   byte [] bytes = new byte[6];
   bytes [3] = -4;
   System.out.println(Arrays.toString(bytes));
   //[0, 0, 0, -4, 0, 0]


   
}
}
