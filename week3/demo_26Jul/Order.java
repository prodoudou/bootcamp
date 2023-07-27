package week3.demo_26Jul;

public class Order {
  private Transaction [] transactions;

  public Order (Transaction[] transactions){
    //pass by reference
   this.transactions = transactions;
  }

  // public Transaction [] getTransactions(){
  //  return this.transactions;
  // }

public double getTotal (){
  double total = 0;
  for (int i = 0;i < this.transactions.length;i++){//length = 2, t1,t2
   //total+=t[i].getUnitPrice() * t[i].getQuantity();

   total+=this.transactions[i].subtotal();//transaction[i]= 0,1 = t,t2

  }
  return total;
}

  //getTotal() -> sum up subtotal
}

