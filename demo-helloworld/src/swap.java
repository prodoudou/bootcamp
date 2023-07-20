public class swap {
  

  public static String SwapOddEventCharacter(String str){
    //Hello! -> ehll!o
    //abcd -> badc
    //aabb -> aabb
    //abcdef -> bac
     char [] arr = str.toCharArray(); //abcd > babc abc ->bac
    for (int i = 0; i < arr.length;i++ ){
      char temp=' ';
       if (i % 2 == 1){ 
        temp = arr [i];
        arr[i] = arr [i - 1];
        arr [i - 1] = temp;

       }
    }
    String str1 = String.valueOf(123);// 123
    String str2 = String.valueOf(123);// 123
    return String.valueOf(arr);// very common name of method
  }
  public static void main(String []args) {
    int [] arr = new int[]{100, -400, 3, 99};
    //code her ...to swap 100 and 99

    int sub = arr[1];
    arr[1]= arr [arr.length - 1];
    arr[arr.length -1] = sub;

    for (int i = 0; i < arr.length;i++){
    System.out.println("arr[" + i + "]=" + arr[i]);
     //code here
    }
   System.out.println(SwapOddEventCharacter("hello!"));
   System.out.println(SwapOddEventCharacter("abcd"));
   System.out.println(SwapOddEventCharacter("aabb"));

        
  //Swap
  }
}
