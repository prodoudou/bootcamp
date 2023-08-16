package week6.week6mon.Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Card extends Paper {
  int number;

  public Card(int number, int size) {
    super(size);
    this.number = number;
  }

  @Override // Complier
  public String toString() { // wildclass = "?""
    return "Card [number=" + this.number//
        + ", size=" + super.size //
        + "]";
  }

  public static void main(String[] args) {
    // approch 1
    Card test1 = new Card(1, 2);
    Card test2 = new Card(4, 3);

    List<Card> test = new ArrayList<>();
    test.add(test1);
    test.add(test2);

    // approch 2
    List<Card> cards2 = new ArrayList<>(Arrays.asList(new Card(1, 2), new Card(4, 3)));

    // approch 3 , but fixed length
    List<Card> cards = Arrays.asList(new Card(1, 2), new Card(4, 3));
    // cards.add(new Card(3, 10));// run time error
    System.out.println("TEST" + cards);
//---------
    // approach 1
    SortBySize condition = new SortBySize();
    Collections.sort(cards, condition);

    // approach 2
    Collections.sort(cards, new SortBySize());

    System.out.println(cards);

    List<? extends Number> numbers = new ArrayList<Integer>();
    numbers = new ArrayList<Double>();

    Number number = Integer.valueOf(10);// polymorphism
    number = Double.valueOf(2.3);// polymorhism
  }

}
