package week3.demo_26Jul;

import java.util.Arrays;

public class StringBox2 {
  
char [] string; // 
 
public StringBox2 (){
}

public StringBox2 (char [] sources){
  //approach 1
//this.string = new char[sources.length];
// for (int i = 0; i < sources.length; i++){//new object
// string[i] = sources[i];
// }
//approach 2
//copyOf()-> new array object, and with the copy value of the original
this.string = Arrays.copyOf(sources, sources.length);//{'a', 'c', 'b'};//sources = old arrays, sources 
}

public StringBox2 append(String s){// Hello ->helloworld
  //String -> toCharArray()
char[] res = new char[this.string.length + s.length()];// this is new arrays. becasue the length of array cant be changed.
int idx =0;
int j = 0;
while (j < this.string.length){ //j= 0,1,2
           
res[idx] = this.string[j]; //for acb //new arr [idx] = 0a, 1c, 2b
idx++;
j++;
}
j =0; //J 歸零
while (j < s.length()){// new for def (因為J 歸零，而IDX無變
  res[idx] = s.charAt(j);// new arr[345] = old arr (0, 1, 2),而 0,1,2 = d, e,f
  idx++;
  j++;
}
this.string = res;
return this;
} 


public String toString() {
  return Arrays.toString(this.string);//[a, c, b]
}

public static void main(String[] args) {
  char [] chars = new char [] {'a', 'c', 'b'};
  StringBox2 box = new StringBox2(chars);
  System.err.println(box.toString());

  chars[1] = 'x'; //pass by reference?????
  System.out.println(Arrays.toString(chars));//[a, x, b]???????refer 20
  System.out.println(box.toString());//[a, c, b]?????????????refer 20

System.out.println(box.append("def").toString());
System.out.println(box.toString());



}
}
