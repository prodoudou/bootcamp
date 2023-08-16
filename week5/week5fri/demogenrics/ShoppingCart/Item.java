package week5.week5fri.demogenrics.ShoppingCart;

public abstract class Item {
  private int price;
  //int quantity;
  private String header;
  private String description;

  public Item(){};
  public Item(int price){
    this.price = price;
  }

  public int getPrice(){
    return this.price;
  }
  
}
