package week4fri;

public class StringSplit {
  public static void main(String[] args) {

     String s= "abc def xyz";


    for (String str : s.split(" ")) {
      System.out.print(str+"2");
    }
    System.out.println();

      for (String str : s.split("\s")) {// \s means space
        System.out.println("SEOND= " +str);
      }

      //  
      System.out.println("Name: \t Him"); // \t = tab
      System.out.println("Hello \n I am Him");  //  \n  = next Line
      System.out.println("Hello\\s I\sam\sHim");   //  \s = space
 
      String s2 = "   abc     def  xyz pld  ";
      for(String str: s2.trim().split("\\s")){// \s means space
        System.out.println("third=" +str);
      }



      
    }
  }

