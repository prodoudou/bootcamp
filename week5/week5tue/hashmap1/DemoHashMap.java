package week5.week5tue.hashmap1;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
  
  public static void main(String[] args){
    //Background Sring[int],Array must use int as index 
    //limitation : you can only access the element by int index
    //Solution: HashMap<>
HashMap<String, String> map = new HashMap<>();//for example key string = 之前既index咁，打返個KEY搵個VALUE
//<String> String> -> <key, value>
map.put("abc", "hello world");//entry put = add
map.put("bcd", "I am Developer");//entry  put = add
System.out.println(map.size());//2 entries
//Map.Entry -> Key + value
System.out.println("test= "+map);

//if Duplicated(equals(), hashCode(),override )
map.put("abc", "hello world !!!");//Override the entry with key "about"
System.out.println(map.get("abc"));//hello world!!!
System.out.println(map.size());// 2 entries

System.out.println(map.isEmpty());//false
System.out.println(map.toString());//{{bcd=I am Developer, abc=hello world !!!}//有冇toString無分別// auto toString
System.out.println(map);//{bcd=I am Developer, abc=hello world !!!}


System.out.println(map.containsKey("abc"));//true
System.out.println(map.containsValue("I am Developer"));//true

System.out.println("entryset=" +map.entrySet());

if(!map.containsKey("abc"))
return;

//Loop Entries
for(Map.Entry<String, String> entry: map.entrySet()){
  System.out.println(entry.getKey() + ":" + entry.getValue());
}

//Loop Keys
for(String key: map.keySet()){
System.out.println(key);
}


//Loop Values
for(String value: map.values()){
System.out.println(value);
 }
System.out.println(map.remove("abc"));//hello world!!
System.out.println(map.remove("bcd", "I am NOT Developer"));// false
System.out.println(map.remove("bcd", "I am Developer"));// true



  

}
}