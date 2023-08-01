
public class Person{ // // template
    //describe the person by attribute
 int age;
private char gender;//---> enum


public static boolean isMale(char gender){/// belongs to class = class = 公家的地方
    if(gender =='F') {
        return false;
    }
    return true;
}

public boolean isMale(){ //each objet has this method
    if(this.gender == 'F'){
        return false;
    }
    return true;
}

//getter
public int getGender(){
return this.gender;
}

public int getAge(){
    return this.age;// this.age
}

//setter
public void setAge(int age){// setAge just only set so, 
this.age = age; 
}

//setter
public void setGender(char gender){
    this.gender = gender;
}

public static void main(String[] args) {// p is like a ball, p2 is ball
    String s = new String ("abc");// new an object in heap
    String s2 = "abcd";//new an object in heap
    String s3 = String.valueOf("abcd");//new an object in heap// string.valueif("abcd") = static method
    Boolean b = new Boolean("true");
    Boolean b2 = Boolean.valueOf("false");
    Boolean b3 = true;//auto-box//newa naobject in heap
    Person p = new Person(); //Produce empty person object,with default value
    Person p2 = new Person(); // produce empty person object, with default value
    p.setAge(13);
    p.getAge();

    

    //static vs non-static
    //static 本身公家的地方 有既野(parameter) 再run 
    System.out.println(Person.isMale('F'));//-> false
    //non-static 
    p.setGender('M');
    p.isMale();//true
    

    Computer computer = new Computer();//public class 任何地方都可以NEW COMPUTER 只要PUBLIC// computer () = empty constructor
    computer.setColor("RED");
    computer.setRam(128);
    computer.setWeight(2);


    Computer computer2 = new Computer("Yellow");//king of setter
    computer2.getColor();//->yellow
    computer2.setColor("black");
    computer2.getColor();
    
    

}
}

