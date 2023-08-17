package week6.week6wed.Stream;

import java.util.Objects;

public class Department {
String name;


public Department(String name){
  this.name = name;
}

@Override
public boolean equals(Object o){
  if (this==o)
  return true;
  if(!(o instanceof Department)) 
  return false;
  Department department = (Department) o;
  return Objects.equals(this.name, department.name);// this objects default objects, hv s
}

@Override
public int hashCode(){
  return Objects.hash(this.name);// this objects default objects, hv s
}


@Override
public String toString(){
  return "Dept["//
  + "name=" + this.name
  
  +"]";
}




}
