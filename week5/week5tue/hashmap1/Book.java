package week5.week5tue.hashmap1;

public class Book {
 String author;
 String name;
 
 public Book(String author, String name){
  this.author = author;
  this.name = name;
 }

 public String getName(){
  return this.name;
 }

 @Override
 public String toString(){
return "[" +this.author + ",name= " +this.name+"]";
 }


}
