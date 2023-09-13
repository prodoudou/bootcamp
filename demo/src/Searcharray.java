import java.util.Arrays;

public class Searcharray {
  public static void main(String []args){
   //seach

   char target = 'm';
   char [] chars = new char[]{'j', 'p', 'm', 'm', 'q', 'c' };
   //Loop to find the index of the target in array chars

   for (int i = 0; i < chars.length; i++ ){
    if(chars[i] == target){
     System.out.println("index =" +i);
    }
   }
   //tochararray ()  // 
   String str = "I am a boy";// 11 characters
   char[] arr = str.toCharArray();// length 11
   //System.out.println(arr[11]);//error
   System.out.println(Arrays.toString(arr));// array
// [I ,  , a, m,  , a,  , b, o, y, .]

//find max. values in the array
int[] nums = new int[]{240, 800, -23, 6, 98};
int max = 0;//the min. of int
for (int i = 0; i < nums.length; i++){ //nums.length = 5
  //i = 0, nums[0] -> 240
  if(nums[i] > max){
    max = nums[i];
  }
}
System.out.println(max);

//find min. value in the array
int [] nums2 = new int[]{ 240, 800, -23, 6, 98};
int min = 0;
for (int i = 0; i < nums.length;i++){
  if(nums2[i] < min){
    min = nums2[i];
  }
}
System.out.println(min);
  }
}
