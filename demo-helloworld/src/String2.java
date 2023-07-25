import javax.print.DocFlavor.STRING;

public class String2 {
  public static void main (String []args){
    // length(), equals(), charAt()

    String str ="hello";
    System.out.println(str.isEmpty());//false
    String str2 = "";// empty string
    System.out.println(str2.isEmpty());//true
    String str3 =" ";
    System.out.println(str3.isEmpty());//false
    //isBlank()
    System.out.println(str.isBlank());//false
    System.out.println(str2.isBlank());//true
    System.out.println(str3.isBlank());//true

    //toLowerCase(), toUpperCase()
    System.out.println(str.toUpperCase()); //HELLO
    System.out.println(str);//hello
    System.out.println(str.toUpperCase().toLowerCase());//hello
    if (str.toUpperCase().equals("HELLO")){
      System.out.println("yes it is HELLO");
    }

    //substring (starIndex, is normal index),
     //(endIndex, represents the position of last character +1)
    //hello -> he
    //str = hello
    System.out.println(str.substring(0, 2));// he (hard to different remember
    System.out.println(str.substring(2, 3));//l 
    System.out.println(str.substring(0, 5));//hello
    System.out.println(str.substring(0));//hello
    System.out.println(str.substring(3));//lo
    if (str.substring(3).equals("lo")){
      System.out.println("yes, str.substring(3) = lo");
    }

    //contain()
    String s = "lo";
    System.out.println(str.contains(s));//true (hello contain lo)
    System.out.println(str.contains("ol"));// false (hello not contains ol)
    if (str.contains("lo")){
      System.out.println("str contains lo");
    }
    

   str= str.toUpperCase(null);
   System.out.println(str);//HELLO
   str += str.toLowerCase();
   System.out.println(str);//HELLOhello



  }
  
}
