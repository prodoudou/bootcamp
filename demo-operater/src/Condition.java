public class Condition {
  public static void main(String [] args) {
    // if, else if, else
    int i = 10;
    if (i > 9){ // asking if i > 9, if yes, execute block od the code
      System.out.println("i=" + i); // i=10
    }
    //flow control: if-else
     if (i < 8){ // not fullfill
      System.out.println("i is samller than 8");
     } else{ 
      System.out.println("i is larger than or euqals to 8");
     }
     // else if 
     if (i > 12)
     System.out.println("i > 12");
     else if (i <= 12 && i >= 0){
     System.out.println("iu <== 12 and i >= 0");
     }else{
      System.out.println("i is negative");// not executed
     }

    int a = 2;
    int b = 5;
    int box = 0;
    if ( a > b) {
      box = 10;
    } else {
      box = 19;
    }
    //box = 19
    int number = 11;
    if (number % 2 == 1) {
      System.out.println("number is an odd number"); 
      }
     if(number % 2 == 0){ 
      System.out.println("number is an even number");
     }
     //String
     String str = "Monday";
     if (str.equals("Monday")){
      System.out.println("str = Monday");
     }
    if (str.charAt(4) =='d'){//false, chatAt(4) -> 'a'
      System.out.println("yes");
    }
     if (str.length()> 10){//false
     System.out.println("length > 10");
     }
     if(str.equals("Monday") || str.charAt(4) == 'd' || str.length() > 10){
      System.out.println("what is the result now?");
     }
     
     int score = 89;
     char grade = ' ';
     if (score >= 90){
      grade = 'A';
     } else if (score >= 80){
      grade = 'B';
     }else if (score >= 70){
      grade = 'C';
     }else if (score >= 60){
      grade ='D';
     }else {
      grade = 'F';
     }
     System.out.println("what is the grade=?" +grade);




    int age = 65;
    boolean isElderly = age >= 65; //true

    //if (age >= 65)
    if (isElderly) { 
    System.out.println("yes he is elderly");
    }

    //switch
    //Simple version
    int dayofweek = 3;
    String dayname = "";
    switch (dayofweek){ // check if value equals to the following case
      case 1:
        dayname = "Monday";
        System.out.println(1);
        
        case 2:
        dayname = "Tuesday";
        System.out.println(2);
        
        case 3:
        dayname = "wednesday";
        System.out.println(3);
       
        case 4:
        dayname = "Thurday";
        System.out.println(4);
        
        case 5:
        dayname = "friday";
        System.out.println(5);
        
        case 6:
        dayname = "saturday";
        System.out.println(6);
        
        case 7:
        dayname = "sunday";
        System.out.println(7);
        
      }
System.out.println("dayname=" +dayname);

      
     String fruit = "orange";
     switch (fruit) {
     case "orange":
     System.out.println("what ");

     case "apple":
     System.out.println("what is th");
     break;
     case "banana":
     System.out.println("wh: +fruit");
     }

     char grade2 = 'D';
     int pocketMoney = 100;
     switch (grade2){

      case 'A':
      pocketMoney += 100;
      break;
      case 'B':
      pocketMoney += 70; 
      break;
      case 'C':
      pocketMoney += 20;
      break;
      default:
      pocketMoney += 5;
     }
     System.out.println("pocket money=" + pocketMoney);

      int birthday = 911;
      switch (birthday){
        case 911:
        break;
        case 811:
        break;
        case 711:
        break;
        default:
      }
     System.out.println("birthday is " + birthday);

      

     }


    }
    
  
  
