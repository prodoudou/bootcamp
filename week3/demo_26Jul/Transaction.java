package week3.demo_26Jul;

public class Transaction {

  private int itemNo;

  private ItemDesc itemDesc;

  private int quantity;

  private double unitPrice;

  public Transaction(int itemNo, ItemDesc itemDesc, int quantity, double unitPrice) {
    this.itemNo = itemNo;
    this.itemDesc = itemDesc;
    this.quantity = quantity;
    this.unitPrice = unitPrice;
  }

  // getSu
  public int getItemNo() {
    return this.itemNo;
  }

  public ItemDesc getItemDesc() {
    return this.itemDesc;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public double getUnitPrice() {
    return this.unitPrice;
  }

  public void setItemNo() {
    this.itemNo = itemNo;
  }

  public void setItemDesc() {
    this.itemDesc = itemDesc;
  }

  public void setQuantity() {
    this.quantity = quantity;
  }

  public void setUnitPrice() {
    this.unitPrice = unitPrice;
  }

  public double subtotal(){//用到因為有quantity同unitPrice 係呢個PAGE
    return this.quantity*this.unitPrice;
    
  }
}
