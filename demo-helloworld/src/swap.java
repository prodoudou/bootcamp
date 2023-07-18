public class swap {
  

  public static String SwapOddEventCharacter(String str){
    //Hello! -> ehll!o
    //abcd -> badc
    //aabb -> aabb
    //abcdef -> bac
     char [] arr = str.toCharArray(); //abcd > babc abc ->bac
    for (int i = 0; i < arr.length;i++ ){
      char set=' ';
       if (i % 2 == 1){ // 0,2,4,6
        set = arr [i];
        arr[i] = arr [i - 1];
        arr [i - 1] = set;

       }
    }
    String test2 = new String(arr); //b,a,d,c - > "badc"
    return test2;
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
   
        
  //Swap
  }
}
