package week5.week5tue.hashmap1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DemoHashMap2 {
  public static void main(String[] args) {
     HashMap<Integer, Book> books = new HashMap<>();
  //  //Key = Address of Byte to value of Byte?
   books.put(128,new Book("Eric","hi"));
  books.put(128,new Book("Steve","hi2"));
  System.out.println(books.size()); //1

  HashMap<Author, Book> bookMap = new HashMap<>();
// Author unqiue key? -> equals()m hasCode();
Author author1 = new Author("John",30);
Author author2 = new Author("John ",29);//if dulipca 
System.out.println(author2);
bookMap.put(author1, new Book("dummy","Book3"));
bookMap.put(author2, new Book("dummy","Book4"));
 System.out.println("a"+bookMap.size());//1 

HashMap<Author, ArrayList<Book>> bookMap2 = new HashMap<>();
ArrayList<Book> booklist1 = new ArrayList<>();
booklist1.add(new Book("dummy","Book1"));
booklist1.add(new Book("dummy","Book2"));
ArrayList<Book>booklist2 = new ArrayList<>();
booklist2.add(new Book("dummy","Book3"));
booklist2.add(new Book("dummy","Book4"));

bookMap2.put(author1,booklist1);
//Override, because author1.equals(author2) ->
bookMap2.put(author2,booklist2);

System.out.println(bookMap2);//1


//Loop bookMap2, print out all the books from each autor
for(Map.Entry<Author, ArrayList<Book>> entry: bookMap2.entrySet()) {
//System.out.println(author.getKey().name);
for(Book book: entry.getValue()){
  System.out.println("Author Name: " + entry.getKey().name//);
  + ", Book name :" +book.getName());
}
}

for(Book book: bookMap2.get(new Author("John", 0))){
  System.out.println(book);
}




}
}
