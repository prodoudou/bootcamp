package week3.demo_26Jul;

import java.util.Arrays;

public class StringBox {

  private String string;//String -> Class   

//construtor, getter, setter
public StringBox (){

}

public StringBox(String string){ 
  if(string == null){ //防守 防止 null 入嚟
  this.string ="";
  }this.string = string;

}

public String getString (){
  return this.string;
}

public void setString (String string){//
  this.string = string;
}

public StringBox append(String str){// if i want to .append it must StrringBuilder // this=object so that obj.append
  if(str == null || "".equals(str))   // null 不可以   .method用<<<<
  return this;
  this.string = this.string + str;
return this;// return Stringbox object reference

}
public static StringBox append (String str, String str2){
  return new StringBox(str + str2);// new ->>Stringbox = constractor // create an object of class tringbox by constactor

}
/**
 * 
 * @param idx range 
 * @param s The String to be inserted
 * @return Object of Stringbox
 */
public StringBox insert(int idx,String s){
  //idx range?
  if(idx < 0 || idx > this.string.length())
  return this;
  if(s == null || "".equals(s))//
  return this;
  //s == null?
// String start = s.substring(0, idx);
// String end = s.subdtring
// String end = "";
// return new StringBox[start + s + end];
this.string = this.string.substring(0, idx) + s + this.string.substring(idx, idx);
return null;
}

public String toString(){
  return this.string;
}

public char[] toCharArray(){
  char [] chs = new char[this.string.length()];
  for ( int i = 0; i < chs.length; i++){
    chs[i] = this.string.charAt(i);
  }

  return chs;
}


public static void main(String[]args){
  StringBox s = new StringBox();//empty constractor
  s.setString("Java");
  System.out.println(s.append("Python"));//refer 25
  s.insert(0, null);
  s.append("Javascript").append("html");//refer 24line

  String a = null;// null = 空置針？ 無指住任何野？？
  a.charAt(2);

  StringBox s2 = new StringBox();//this.string ->null
  s2.insert(3, "java");

  String s3 = StringBox.append("hello", "world").toString();//hello word
  char[] result = s3.toCharArray();
  System.out.println(Arrays.toString(result));


  
}


}

