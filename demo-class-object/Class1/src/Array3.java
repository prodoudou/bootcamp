public class Array3 {
  public static /*int[]*/void addOne(int[] arr) {// arr -> object refereence // arr is addres i dun know// pass by reference
    //int [] res = new int [arr.length]; // create a ball 
   for (int i = 0; i < arr.length;i++){
      arr[i] = arr[i] + 1;
    
   }
  //return res; //reture addres????
  }
//All wrapper Class + String pass by value
public static String concat(String a, String b){ //alll wrapper class pass by value
  a = "hello";
  System.out.println(a);//
  return a + b;
}

  public static void main(String []args){
    int [] nums = new int []{3, 4, 8};
    /*int[] newAddress = */addOne(nums);// 4, 5, 9// newaddress = 有野接nums
// nums -> 4,5,6
    for(int i = 0; i < nums.length; i++){
      System.out.println(nums[i]);
    }
// reference and object is two things
    //call concat
    String a = "abc";
    String b = "def";
    String result = concat(a,b); // hellodef
   
    // a = abc
    // b = def
  }
}
