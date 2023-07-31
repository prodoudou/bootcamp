public class Revision {

  // instance variable(non- static) // static = 唔係belongs to 1個OBJECT 
  String name;// address// non-promitive -> address
  
  public Revision(){
    
  }
  
  public Revision(String name){
    this.name=name;
  }
  public void print(String input) {
    System.out.println("hello" + input + " " + this.name);
  }

  public static void print2(String input) {
    System.out.println("hello" + input);
  }

  public static void main(String[] args) {

    Revision r1 = new Revision();
    r1.name = "John";
    Revision r2 = new Revision();
    r2.name = "John";


    System.out.println(r1.equals(r2));
    r1.print("world");// instance method

    System.out.println(r1 = r2);// false
    System.out.println("test" +(r1.name == r2.name));// true

    r2.name = new String("John");
    System.out.println("finally " +(r2.name==r1.name));

    String s1 = "abc";// double quote, no "new" key word
    String s2 = "abc";
    System.out.println(s1 == s2);// tru, literal pool

    String s3 = new String("abc");
    System.out.println(s1 == s3);// false

    Integer i1 = 127;
    Integer i2 = 127;
    System.out.println(i1 == i2);// true, cache
    Integer i3 = 128;
    Integer i4 = 128;
    System.out.println(i3 == i4);// false

    String temp = s1;
    s1 += "d"; // immuable
    System.out.println(temp == s1);// false


  StringBuilder s = new StringBuilder("abc");
  char c = s.append("null").charAt(1);
  System.out.println("string= "+c);




  }



  
}
