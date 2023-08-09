package week5.week5tue.hashmap1;

import java.util.Objects;

public class Author {
  String name;
  int age;

  public Author(String name, int age){
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString(){
    return this.name;//no mention age ,only john ,becuase only return this name
  }


  @Override
  public boolean equals(Object o){
  if(this ==o){
    return true;
  }
  if(!(o instanceof Author)){
    return false;
  }
    Author author = (Author) o;
    if(Objects.equals(this.name, author.name)) {
    return true;
    }
    return false;

  }

  @Override
  public int hashCode(){
return Objects.hash(this.name);
  }



}
