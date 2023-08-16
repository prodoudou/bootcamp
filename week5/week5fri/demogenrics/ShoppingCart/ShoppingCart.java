package week5.week5fri.demogenrics.ShoppingCart;

import java.util.ArrayList;

import week5.week5fri.demogenrics.box.Box;

public class ShoppingCart {
 private ArrayList<CheckoutItem> items;
  
 public ShoppingCart(){
 items = new ArrayList<>();
 }

 public int totalAmount(){
  int sum= 0;
  for(CheckoutItem item : this.items){
    sum += Math.max(0 ,item.getPrice()) * Math.max(0,item.getQuantity());
    //因為驚有負數
  }
  return sum;
 }

public void clear(){
  this.items.clear();
}

public void add(int quantity, DisplayItem displayItem){//Food
  //items.add(item);
  //construct CheckoutItem
  CheckoutItem checkoutItem = 
  new CheckoutItem(quantity, displayItem.getPrice());
items.add(checkoutItem);
}

public boolean remove(CheckoutItem item){
 return items.remove(item);
}

public static void main(String[] args) {
  ShoppingCart cart1= new ShoppingCart();
  //cart1.add(new Rice());
  //cart.add(new Food());// Food is abstract
  // ShoppingCart<Drink> cart2 = new ShoppingCart<>();
  // ShoppingCart<Food> cart3 = new ShoppingCart<>();
  // ShoppingCart<Rice> cart4 = new ShoppingCart<>();


  //ShoppingCart<Object> cart3 = new ShoppingCart<>();
Box<Integer> box = getBox(Integer.valueOf(100));
Object object = getBox(Double.valueOf(1.0d)); //
//Object object <- Box<Double> 
Box<Double> d1 = (Box<Double>) object;

for(double d :d1.getNumbers()){
  System.out.println(d);//1.0
}


}



public static <T extends Number> Box<T> getBox(T element){
return new Box<>(element);
}



}

