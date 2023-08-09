package week3.demo_25Jul;


public class String3 {
  //String Literal pool (Heap) + String is immutable
public static void main(String[]args){
  String str = "abc";
  String str2 = "abc";
  System.out.println(str.equals(str2));//true, "abc" is same as "abc"  check value is use equals
  System.out.println(str == str2);// true, address same?? address its same
   

  //String Literal Pool -> "abc"
  String str3 = "abcd";
  System.out.println(str.equals(str3));//false
  System.out.println(str == str3); //false// their addresses are not same
 


  str = "abcd123";// becasuse "abc100" is not equal to "abc"-> immutable
  System.out.println(str==str2);//false
  //str2 = "abc"

  String temp = str;// copy adress 抄左個地址出黎
  str = new String("abcd100");//new object
  System.out.println(temp == str);//same value but false // "=="  係問地址係咪相同// 所以答案係false




  Integer a = 10;
  a = a + 20;// second a is a copy of that a
  //a = 30
}
}

