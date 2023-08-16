package week5.week5fri.demogenrics.ShoppingCart;

public class CheckoutItem extends Item{
  
  int quantity;
  
  public CheckoutItem(int quantity, int price){
    super(price);
    this.quantity = quantity;
  }

  public int getQuantity(){
    return this.quantity;
  }
}
