public class Strings implements CharSequence {

  char[] arr;// "abc, [a, b, c]"

  public Strings(String str) {
    arr=str.toCharArray();
    // arr = new char[str.length()];
    // for (int i = 0; i < str.length();i++){
    //  arr[i] =str.charAt(i); //stringcharAt    }
    //}
  }

public Strings ValueOf(String str){
  return new Strings(str);
}

  @Override
  public int length() {
    return arr.length;
  }

  @Override
  public char charAt(int idx) {
    return this.arr[idx];
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    if(end < start || start < 0 || end < 0 || start > this.arr.length-1
    || end > this.arr.length){
    return String.valueOf(this.arr);}
    // return String, StringBuilder, StringBuffer
    StringBuilder sb = new StringBuilder();
    for (int i = start; i < end; i++) {//end -1
   sb.append(this.arr[i]);
    }
    return sb.toString();//String
  }

  public static void main(String[] agrs) {
    // CharSequence -> Interface
    // String implement Charsequence
    String str = "abc";
    String s = new String("abc");
    System.out.println(s.subSequence(0, 2));
  }
}
