public class wrapper {

  public static void main(String[]argus){
    //primitives: bytes, short...
    //wapper classes, corresponding primitive

    boolean isMale = true;// isMale is not an object
    //wrapper class 
    Boolean isFemale = true;// isFemale is an object reference

    isMale = false;
    if(isMale){

    }
    if(isFemale.compareTo(isMale) == 0){// asking if isFemale with the same value of isMale

    }
     isFemale = null; // true/ flase / null //isFemale = object so that it can be null

     int num = 2;
     Integer num2 = 4;// num2 is an object reference
     num2 = null;

     num2 = 1000;
     String s = num2.toString();// "1000"
     Integer i = Integer.valueOf("123");// 123
     Integer num3 = 4;

     char c = 'a';
     Character c2 = 'A';
     char result =Character. toLowerCase('B');// static method
     //Difference?
     Character c3 = Character.valueOf('s');
     Character c4 = 's';

     
  }
}
