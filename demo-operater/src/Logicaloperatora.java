public class Logicaloperatora {
  public static void main(String[] args) {
    boolean isExpensive = true;
    boolean isWorthTobuy = false;
    // && operator -> AND
    //true,true -> true
    //true, false -> false
    //false, true -> false
    //false, false -> false
    boolean result = isExpensive && isWorthTobuy;// false
    // ||Operator -> OR
    // true, true -> true
    // true, false -> true
    // false, true -> true
    // false, false-> false
    boolean result2 = isExpensive || isWorthTobuy;// true

    int a = 5;
    int b = 10;
    int c = 13;
    //Logical Operator
    boolean result3 = a > 6 && b < 12;// false
    boolean result4 = c < 15 || a > 6 && b < 12;// true
    boolean result5 = c < 15 || (a > 6 && b < 12);// true
    boolean result6 = a < 6 || b < 9 || c < 9;// true

    //==,>=,<=
    //==,means asking if a equals b? -> true/false
    //=, assignment
    boolean result7 = a == b;// false
    boolean result8 = a >= 5;//true
    boolean result9 = c <= 13;// true
    boolean result10 = c != 13;// false
    // ! -> NOT
    // asking if the event of (c < 13) is false
    boolean result11 = !(c < 13);//true
    boolean resul12 = !(b == 9) && c != 13;// false

    //Operator precedence
    int result13 = (1 + 9) * 3;//30
    int result14 = ++result13 + 1;//32
    int i = 27;
    int result15 = i++ +1;// result15 = 28, i=28
    
    boolean result16 = 25 + 2 < result15 + 1;//true

    //
    int x = 5;
    int y = 10;
    int z = x += 3 * y;// step1: 3 * 10 -> 30, step2: 5 + 30 -> 35
    
    x = 5;
    int result17 = (x++ +2) * x++;// result17= 
    //(x++ +2) -> 7, x become 6
    //7 * 6 -> 42, x become 7 
    System.out.println("result17=" + result17);// 42
    System.out.println("x=" + x); // 7




  }
  
}
