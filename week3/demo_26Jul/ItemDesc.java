package week3.demo_26Jul;

public class ItemDesc {
  private String header;

  private String body;

  public ItemDesc (String header, String body){
    this.header = header;
    this.body = body;

  }

  public static void main(String []args){
    ItemDesc itemDesc = new ItemDesc("Item A", "90% discount just for today");
    ItemDesc itemDesc2 = new ItemDesc("Item B", "70% discount just for today");
    Transaction t = new Transaction(1, itemDesc, 3, 10.5);
    Transaction t2 = new Transaction(1, itemDesc2, 4, 20.5);
    Order order = new Order(new Transaction[]{t,t2});
    //System.out.println(order.getTotal(order.getTransactions()));

    System.out.println(t.subtotal());
    System.out.println(t2.subtotal());
    System.out.println(order.getTotal());//3* 10.5 + 4* 20.5

     
  }
  
}
