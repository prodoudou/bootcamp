import java.util.Arrays;

public class helloworld {
  public static void main(String[] args) {

    int num = 9669;
    String str = String.valueOf(num);
    char [] chars = str.toCharArray()
    // System.out.println(str);
    //char [] chars = str.toCharArray();
    for (int i = 0; i < num.length(); i++) {
      if (str.charAt(i) == 6) { // str =" 9669" // chars "9,6,6,9"
          chars[i] = 9;
         break;
      }
    }

    int answer = Integer.valueOf(chars);

  }
}
