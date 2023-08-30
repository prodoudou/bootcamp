
package week6.week6fri.switchexpress;

public class Demo {
  // instance variable
  // static Variable(1X)
  // constructors
  // public instance methods// main logic
  // static methods // tools
  // private methods

  public static void main(String[] args) {
    System.out.println(grade(90));
    System.out.println();
    Weekday weekday = Weekday.TUE;
    // Approach 1
    int result = switch(weekday){
      case MON -> 1;
      case TUE -> 2;
      case WED -> 3;
      case THU -> 4;
      case FRI -> 5;
      //default -> 0; default = else 
    };
     
    // Approach 2
    int result2 = switch(weekday){
      case MON, TUE:// condition is not allowed in java 17
      System.out.println("Monday or Tuesday");
      yield 1; //yield means "return + break"
      
      case WED:
      System.out.println("Wednesday");
      yield 3; 

      case THU:
      System.out.println("Thursday");
      yield 4; 
     
      case FRI:
      System.out.println("Friday");
      yield 5; 

      //default -> 0; default = else 
    };
   
    // String str = "hello world";
    // String result2 = switch(str){
    //   case String str.length() > 5 -> "length > 5";
    //   case String str.contain("world") -> "contains world";
    //   default -> "unknow";
    // }
  }

  // Approach 1
  // public static int getdayNumber(Weekday weekday) {
  // switch (weekday) {// enum
  // case MON:
  // return 1;
  // case TUE:
  // return 2;
  // case WED:
  // return 3;
  // case THU:
  // return 4;
  // case FRI:
  // return 5;
  // default:
  // return 0;

  // }

  // }

  public static char grade(int score) {
    char grade = ' ';
    switch (score) {
      case 90:
        grade = 'A';
        break;
      case 80:
        grade = 'B';
        break;
      default:
        grade = 'F';
    }
    return grade;

  }
}
