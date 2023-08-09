import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DemoArraylist2 {

  private static final String Iterator = null;

  public static void main(String[]args){
    //ArrayLst String
    ArrayList<String> strs = new ArrayList<>();
    strs.add("abc");
    strs.add("def");
    strs.add("xyz");
    strs.add("def");
    System.out.println(strs);

    System.out.println(strs.subList(1, 2));//def, fromo idx 1 to idx 1// same as substring
    //Remove the first occurence of "def"
    strs.remove("def");//remove by object
    System.out.println(strs);//[abc, xyz, def]
    strs.remove(1); //remove by index
    System.out.println(strs);//[abc, def]

    Iterator<String>iterator = strs.iterator(); //類似array list

    while(iterator.hasNext()){//hasNext = 有下一個野
    System.out.println(iterator.next());
    }


     for(String s : strs){//for-each support Array and ArrayList
      System.out.println(s);
     }

     Object[] objects = strs.toArray();//ArrayList<String> -> object[]
     for(Object o :objects){
     if(o instanceof String){
      String str = (String) o;
      System.out.println(str);
     }
    }

    //Array -> ArrayList
    String[] strings = new String[]{"hello", "world", "!"};

    List<String> s2 = new ArrayList<>(); //List is Interface//
    //list 同array list分別係 LISt唔可以NEW，method唔同
    s2.add("abc");//add() method must be reflectiing the add() in arrayList

    System.out.println("s2= "+s2);


    //Read Only -> big BUg
    List<String> StringList = Arrays.asList(strings);
    //StringList.add("ijk");//run-time error
    System.out.println(StringList);
    
    //Read & write (soluion)
    List<String> stringList2 = new ArrayList<>(Arrays.asList(strings));
        //List<String> stringList2 = new ArrayList<>(strings );

    stringList2.add("ijk");
    System.out.println(stringList2);




  }
}
