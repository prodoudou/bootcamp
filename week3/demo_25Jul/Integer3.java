package week3.demo_25Jul;
// internal Cache (-128 to 127) same as byte range 先會地址一樣
public class Integer3 {
  public static void main(String[]args){
    Integer i1 = 100;
    Integer i2 = 100;
    System.out.println(i1 == i2);// true


    Integer i3 = 128;
    Integer i4 = 128;

    if(13 == 128){//13 -> int} (wrapper class - > primitive)用condition 會down 
    System.out.println(i3 == i4);//addres, false
  }

    Integer i5 = -128;
    Integer i6 = -128;
    System.out.println(i5 == i6);// addess, true

    Byte b1 = 127;
   // Byte b2 = new Byte(127);//destroy Internal Cache
    //short long// practice
  

    Float f1 = 1.3f;
    Float f2 = 1.3f;
    System.out.println(f1 == f2);//false // == check address
    System.out.println("123"+f1.equals(f2));// check value
    Double d1 = 1.3d;
    Double d2 = 1.3d;
    System.out.println(d1 == d2);//false

    Boolean bool1 = false;
    Boolean bool2 = false;
    System.out.println(bool1 == bool2);//true, same addres

    Character c1 = 'a';
    Character c2 = 'a';
    Character c3 = '8';
    Character c4 = '8';
    System.out.println(c1 == c2);// true, same address
    System.out.println(c3 == c4);// false

    Integer i7 = Integer.valueOf(127);// New Object
    Integer i8 = 127;
    System.out.println(i7==i8);//true

    Integer i9 = Integer.valueOf(128);//128
    Integer i10 = 128;
    System.out.println(i9 == i10);//false
    


    
  
}
}