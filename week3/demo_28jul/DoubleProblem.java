import java.math.BigDecimal;
import java.math.RoundingMode;

public class DoubleProblem {
  public static void main(String[] args) {
    double result = 0.1 + 0.2;
    System.out.println(result);// 0.3000000004

    if (result == 0.3) {
      System.out.println("result = 0.3");
    } else {
      System.out.println("result != 0.3");
    }

    System.out.println(0.3 / 0.1);// 2.9999999996F
    System.out.println(0.2 * 0.1);// 0.02000000004


    //solution:
    BigDecimal b = new BigDecimal(6.23d);//use bigdeciaml = fix 精度問題
    BigDecimal b2 = BigDecimal.valueOf(4);//bigcecimal 大
    //BigDecimal b3 = 5.0//NOTok 
    Double d = 5.0d;
   
    


    System.out.println(b.multiply(b));//25
    System.out.println(b.subtract(b2));// 5 - 4 -> 1
    System.out.println(b.add(b));//5 + 5 = 10
    System.out.println(b.divide(b));// 5 / 5 =1
    System.out.println(b.add(new BigDecimal(7)));//5 + 7 = 12

    System.out.println(b.compareTo(b2));//; b = 5, b2 = 4, b> b2 result 1
    System.out.println(b2.compareTo(b));//b= 5, b2 =4 , b2 > b result -1
    System.out.println(b.compareTo(BigDecimal.valueOf(5)));


    BigDecimal b3 = BigDecimal.valueOf(3.456);
    System.out.println((b3.setScale(2, RoundingMode.UP)));//3.46
    System.out.println((b3.setScale(2, RoundingMode.DOWN)));//3.45
    
    System.out.println(b.equals(b2));//true 5==5

    BigDecimal b4 = BigDecimal.valueOf(5);
    System.out.println(b.equals(b2));//true 5==5

    System.out.println(b == b4);//aflse

    }


    

  }

