public class RerseString {
  public static void main(String[]args){
  String str = "hello i an ihm";
  //outputL olleh
  //str.charAt()
  String reversed ="";
  for(int x = str.length()-1; x >= 0;x--){
    reversed += str.charAt(x); 
  }
  System.out.println(reversed);
  
  }
}
