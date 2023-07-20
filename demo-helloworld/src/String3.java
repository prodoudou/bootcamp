public class String3 {

  public static void main(String[]abc){
    // method signature = method name + parameter type & quantity

// trim(), remove leading space trail space
    String str = "hello i am tom i love eating";
    String str2 = "   hel   lo  ";
    System.out.println("str.trim()=" + str.trim());// "hello"
    System.out.println("str.trim()=" + str2.trim());// "hel   lo"

    //starsWith(), check if the String start with the target string
    if (str.startsWith("hel")){
     System.out.println("The string starts with hel");

     //endsWith(), check if the string ends with the target string
     boolean endsWithSpace = str.endsWith(" ");
     if (endsWithSpace){
      System.out.println("the string ends with space");
     }
       //indexOf(char)
       System.out.println("The index of o in str=" + str.indexOf('o'));// 4
       //indexOf ((string))
       System.out.println("The index of o in str=" + str.indexOf("ll"));//2
       System.out.println("The index of o in str=" + str.indexOf("lll")); // -1
       System.out.println("the index of o in str, search from index 5 = "+ str.indexOf('o',5));//-1
       System.out.println("the index of o in str, search from index 5 = "+ str.indexOf("ll",3));//-1
       
       // lastIndexOf (int), the last ocurrence of the char/string in the string
       String str3 = "hello";
       System.out.println(str3.lastIndexOf('l')); // 3
       System.out.println(str3.lastIndexOf("ll")); // 2
       System.out.println(str3.lastIndexOf('l', 2));// 2

       // replace
       String s = "Java is a programming lanuage";
       System.out.println(s.replace("Java","Python"));//Python is a programming lanuage
       System.out.println(s.replace('p','q'));//Java is a qrogramming lanuage

       //equals(), equalsIgnorecase()
       if ("hello".equals(str3)){// true
        System.out.println("str3 = hello");
       }

       if ("Hello".equals(str3)){// falase, case senstive
        System.out.println("str3 = Hello");
       }

       if ("Hello".equals(str3)){// true, non case sententive
        System.out.println("non case sententive");
       }

       if(str3.toUpperCase().equals("HELLO")){
        System.out.println("Alternative");
       }

       //concet(String), append something
       String newString = str3.concat(" Java!");// + operation
       System.out.println("newstring=" + newString);// hello Java!
       str3 = str3.concat(" JAVA!");
       System.out.println("str3 =" +str3);// hello JAVA!

      //compareTo
      String apple = "apple";
      String facebook = "facebook";
      System.out.println(apple.compareTo(facebook));  //-5, 1 - 6 ('a' - 'f')
      



    }

  }
  
}
