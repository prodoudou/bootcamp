public class helloworld {
  public static void main(String[]args) {
    
    for (int i = 1; i < 6;i++){
        for (int y = 1; y <= 2;y++){
          System.out.print("8");
        }
        System.out.println();
      }

    for (int i = 1; i <= 3;i++ ){
      for (int y = 1; y < 6;y++){
        System.out.print("o");
      }
      System.out.println();
    }
     /*練習二：
     試下整一個
     (橫要2 &直要10) 的長方形
     成個長方形都係要數字組成
     即
     88
     88
     88
     88
     88*/ 

     /*sum of all odd number*/ 
     int sum = 0;
     int sumoOddnumWithout5 = 0;
     for (int i = 0; i < 10; i++) {
      if(i % 2 != 0){
      sum = sum+i; // 25 = 
      System.out.println(sum);
      }

     }





  }
}
