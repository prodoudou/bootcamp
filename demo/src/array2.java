public class array2 {
  
  public static void main(String[]args) {
    System.out.println(swap("          ",3,0));
  }
  public static String swap(String str, int idx1, int idx2){
    //swap two characters in the string(index1 and index2)
    //return the swapped String
    if (str == null){ // null= no index eg: -->""<---
      return null;

    }
    if (str.isBlank()){// blank = 空白 or space
      return str;
    }
    
    if (idx1 < 0 || idx1 >= str.length()){// make sure those swapped number is within the str.length 因為長過的話根本無得調
      String error ="error pls enter um between";
      return error;
    }

    if (idx2 < 0 || idx2 >= str.length()){// make sure those swapped number is within the str.length 因為長過的話根本無得調
      String error ="error pls enter um between";
      return error;
    }
  

    char[] chars = str.toCharArray();
    //new char [str.length()];
    char temp = chars[idx1];
    chars[idx1] = chars[idx2];
    chars[idx2] = temp;
    return String.valueOf(chars);
  }
}
