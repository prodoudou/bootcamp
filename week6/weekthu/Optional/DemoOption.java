package week6.weekthu.Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DemoOption {
  public static void main(String[] args)  throws Exception{
    List<Book> books = new ArrayList<>();
    books.add(new Book("John"));
    books.add(new Book("Mary"));
    books.add(new Book("Peter"));
    books.add(new Book("Peterww"));

    Optional<Book> book = books.stream()// object book is not null
    .filter(b -> b.author.startsWith("P"))//
    .findAny();


    book.ifPresent(b -> {   //搵到就print hello, 
      System.out.println(b);
      //codes...
    });

     if(book.isPresent()){
System.out.println(book.get());
     }else{
      System.out.println("No Book found");
     }
    
    Optional<Book> book2 = Optional.of(new Book("Eric"));//cant put null at optional
    //Optional<Book> book3 = Optional.of(new Book(null));//runtime-error
    Optional<Book> book4 = Optional.ofNullable(null);
    System.out.println(book4.isPresent());//false
    Optional<Book> book5 = Optional.ofNullable(new Book("Jenny"));//ofnullable can put null
    Optional<Book> book6 = Optional.empty();
   System.out.println(book6.isPresent());// false

    Optional<Book>book7 = null;

    //Optional<book? -> book
    Book newBook =book6.orElse(new Book ("Default"));//orELse = 如果無野就放"default"
    Book newBook2 =book6.orElseGet(() -> new Book("default"));
    Book newBook3 = book6.orElseThrow(() -> new Exception());

    
  }

   public static Optional<Book> getBook(){
    //get bok logic
    return Optional.empty();//this case 係迫人佢用optional return type, 姐係用.orElse(),等佢唔好比人有機會declare null
   }


}
