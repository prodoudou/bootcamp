public class String1 {
  public static void main(String[] args) {
    String str = "I am happy, but raining";
    str = str + ".";
  System.out.println(str);//I am happy, but raining.

  //Method
  int i = str.length();// length(), tool to return the length of str
  System.out.println("i=" + i);// convert i to string" "24-> "i=24"
  System.out.println("hello".length());
  System.out.println(str.length());

  //equals()
  String str1 = "abc";
  String str2 = "abcd";
  String str3 = "abc";
  boolean areTheyEqual = str1.equals(str2);//false
  boolean areTheyEqual2 = str1.equals(str3);//false
  boolean b4 = str2.equals(str1 + "d");
  System.out.println(areTheyEqual2);

// chatAt(2), find the char at index 2 of the string
String str4 = "helloworld";
//index 0 of str4 -> 'h'
//index 4 of str4 -> 'o'
System.out.println(str4.charAt(2));// result:l
System.out.println(str4.charAt(20));


  
  }
  
}
