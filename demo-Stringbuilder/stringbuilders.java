import java.util.Arrays;

public class stringbuilders{

  public static void main(String[] args) {
    StringBuilder s = new StringBuilder("Hello");// Constructor
    // s -> address (reference)
    s.append("world");// type is string builder
    System.out.println(s);//Hello word// append() is faster than "+" in String
    System.out.println(s.toString()); // Stringbuiler to string  ->//"Hello" // likely getter  
    s.append(1.3f);

    System.out.println(s.toString());

    System.out.println(s.append(true).append(4000L).length()); //22

    String str = "  he5  llo ";
    String[] strs = str.trim().replace('h', 'e').split(" ");
    System.out.println(Arrays.toString(strs));
    System.out.println(strs.length);

    StringBuilder s2= new StringBuilder("start");
    //Approach 1
    System.out.println(s2.append('a').toString().charAt(3));//
    //Approach 2
    StringBuilder s3 = s2.append('a');//after append is string builder???/
    String s4 = s3.toString();
    s4.charAt(3);////r
    //inssert
    String s10 = "hello";//how to insert a spacae between//
    
    StringBuilder s11 = new StringBuilder("hello");
    s11.insert(3,' ');
    System.out.println(s11);// hel lo
    //
  
    s11.insert(0, "world").append("world");// append = last 
    System.out.println(s11);// worldhel loworld

    System.out.println(s11.deleteCharAt(3).toString());//wordhel loworld

  Integer a = 10;
  System.out.println(a + 10);// 20
  //a = 10

  s11.setCharAt(4,'J');// string builder method
  System.out.println(s11.toString());


  }
}
