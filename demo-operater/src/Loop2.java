public class Loop2 {
  public static void main(String[]args){
    //break
  for (int i = 0; i < 6;i++){// 0, 1, 2, 3, 4,5
   for (int j = 0; j < 3;j++){//0, 1 , 2
     System.out.println("i="+i + "j="+ j);
     if(i == j){
     break;// this break statment just break the inner loop
     //i = 0, j=0 ,yes, break
     //i = 0, j=1 ,no 
    //i = 
     }
    }
   }
   System.out.println();
   //break will go to outer loop//
   //contiune( skip) will go to inner loop//
   // contiue
  for (int i=0; i < 6 ; i++){
  for (int j = 0;j < 3; j++){
    if( i == j){
      continue;// skip the rest in inner loop, go to next interation
    }
    System.out.println("i=" + i + ", j = " + j);
    //i = 0, j= 0 continue
    //i = 0, j= 1, print
  } //i = 0, j= 2, print
    //i = 1, j= 0, print
    //i = 1, j= 1, contiune
    //i = 1, j= 2, print
    //i = 2, j= 0, print
    //not finsih yet.....
   }
    String str = "I love programming. I love Java.";
    System.out.println(str.length());
    // for loop iteration times, based on the length of the String.
    for(int i = 0; i < str.length(); i++){ //i < 32 (0-31)
      System.out.println("Hello");
    }
    //print the index of the character,
    //first time of the characaater "e"
    // str.charAt(int index)
    
    //string use equal,
    System.out.println(str.charAt(2));//l, the 3rd character in the String
    for (int i = 0; i < str.length();++i){
      if(str.charAt(i)== 'e') {// true/false
        System.out.println("index=" + i);
        break;
      }
    }
    // check if 'y' exise in the string
    //Found or not found
   boolean found = false;// because boolean default false
    for(int i = 0; i < str.length(); ++i){
      if(str.charAt(i) == 'y'){
        found = true;
        break;
    }
    }
      if (found){System.out.println("y is found");
      }
        else {System.out.println("y is not found");
      }


      // if the number of occurrence of target >=3, print yes
      //otherwise, print no
      char target = 'o';
      int count = 0;
      boolean found2 = false;
      for (int i = 0;i < str.length(); i++){
        if( str.charAt(i) == 'o'){
          count++;
        }
        //nice to have
        if(count >=3){
          found2 = true;
          break;
        }
        }
        if(found2 == true){
        System.out.println("yes");
      }else{
        System.out.println("no");
      }
      }
    }


  


