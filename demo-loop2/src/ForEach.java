import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
       // basic
      for (int i = 0; i < 3; i++){
        System.out.println("basic for -loop :Hello");
       }
       //for-each
       //for ("dataset") right is dataset
       //diference of for each:
       //1. for-each do not have stop condition/ counter is loop signature
       int[] arr = new int[]{1, 2, 3, 4};
       //for (type Element: dataset)
       for (int x :arr){// loop through all element
        System.out.println("for-each : Hello, x =" + x);
        System.out.println(arr[0]);// but you can still access element by index
        //modify
        arr[0] = 8;


        //{1, 4, 10, 13, 20, 0}
        //1, 0
        //4, 20
        //10 ,13

       }
       for(int i = 0; i < arr.length; i++){ //counter 
        if (i > arr.length / 2 -1 ){
            break;
        }
        System.out.println("for-each : Hello");;
        System.out.println("" + arr[i]+ arr[arr.length -i -1]);

       }
        //
        String [] strs = new String []{"Hello", "world"};

        for(String str :strs){
          System.out.println(str);
        }

        // Integer, character (Wra[[er cLASS]])
        Character [] chars = new Character [] {'L','a', '!', '('};
        for (Character c: chars){ // c = 之前既 for loop 既 i
            System.out.println(c);
        }

        String s2 = "Hello world ! I am vincent";
        System.out.println(Arrays.toString(split(s2)));//call method , run to method
        String[] strings = s2.split(" ");
        for (String s: strings){
            System.out.println(s);
          }

            //without using split, use a for loop spslit s2
            //outout: String[]
            //substring()
            //tocharArray
            
             //Approach 1 is substring()
             // Count spaces
             
            
            String save = "";
            int count = 0;
            char[] arr1 = s2.toCharArray();
            for (int i = 0; i < s2.length() -1; i++){
            if(arr1[i] ==' '){
             count++; // count how many ' 'show up
            }
            }
            System.out.println("count = " +count);

            int index = 0;
            String [] strr = new String [count+1];
            //^^^^^set a string array and number of string array is 幾多個字^^^^^
            for (int i = 0;i < s2.length();i++) {
                if(arr1[i] != ' '){
                save += arr1[i];     
                } else {
                    strr[index] = save;
                    index++;
                    save= "";
                }
            }
           System.out.println(Arrays.toString(strr));
        
       
        
        
            ///for (String x: b)}
}
public static String[] split(String s){


    int spaceCount = 0;
             for (int i = 0; i< s.length();i++){
                if (s.charAt(i) == ' '){// find spacebar
                    spaceCount++; //mark when space bar is found
                }
             } // spaceCount = 5 represent 6 words.
            String[] result = new String[spaceCount+1];// change into string array for the answer// spacecount +1 = words 
            
            int startIdx = 0;
             int idx = 0;
              
              for (int i = 0; i < s.length(); ++i){
                if (s.charAt(i)==' '){
                    result[idx] = s.substring(startIdx, i);// result[] = String array = quantity
                     idx++;
                     startIdx = i + 1;
                }else if (i ==s.length()-1){ //last character
                 result[idx] = s.substring(startIdx, s.length());
                }
           
              }
                return result;

}
    
}
