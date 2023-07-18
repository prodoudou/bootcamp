public class methods {
  public static void print() {// method name : print()
    System.out.println("Hello in print() method.");
  }
     public static void main(String[] args) {// method name : main()
    String str = "Hello";
    str = str + "world";

    // approach 1
    System.out.println("Hello in print( method.)");
    // Approach 2: my method
    print();// print "Hello in print() method.

    // approach 1
    int x = 10;
    int y = 100;
    int m = x + y;// 110
    // approach 2
    int z = sum(x, y);// z=110
    int i = sum(-30, 1000);// 970
    int j = sum(80, 30); // 110
    System.out.println(z);
    System.out.println(i);
    System.out.println(j);
    // if (sum(1000, -30) == 970 {})
    if (i == 970) {
      System.out.println("the sum is 970");
    }

      //call method 2
      method2("Hello");// print string=hello
      method2("Github");//print string=GitHUB
      method2("");

      double circleAre = 5 * 5 * pi();
    }

  public static int sum(int a, int b) {
    // left int = return type
    // the int inside the bracket are parameters
    int c = a + b;
    return c;
  }

  /*public static boolean sum2(int a, int b) {
    if (a == b)
      return true;
    return true;*/

    public static int substract (int x, int y) {
      return x - y; //execute x - y first, then return the result 
    }
     
    public static void method2(String str){
     if (str == null || "".equals(str)){ // null is not empty , empty -> ""
       return;
      }
      System.out.println("String=" + str);// main logic
    }
    
    public static double pi(){
      return 3.14159;
    }
}
