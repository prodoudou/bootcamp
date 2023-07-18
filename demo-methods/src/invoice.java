public class invoice {

  //A method to calulate total prices for an item
  public static double calcTotalItemPrice (int quantity, double unitPrices){//5 x 10.9}
  
  //early return
  //PAramterconyrol;
  
  /*double calc =  quantity * unitPrices;
  return calc;*/
  //
  if (quantity < 0 || unitPrices < 0){
    return 0;
  }
   return quantity * unitPrices;//main logic
  }

  //A method to calculate total amount of the invoice
  public static double calcTotalInvoiceAmount(double[] totalItemsPrices){
    double total = 0.0d;
    for (int i = 0; i < totalItemsPrices.length;i++){
    total += totalItemsPrices[i];
  }
  return total;
}
  
  public static void main(String[]args){
    int [] quantities = new int[] {5, 10, 4, 7, 20};
    double [] unitPrices = new double [] { 10.9, 100.3, 2.1, 9.0, 1000.3};
  

    double []totalItemsPrices = new double [unitPrices.length];
    double sum = 0;
    for (int i = 0;i < totalItemsPrices.length;i++ ){
     totalItemsPrices[i] = calcTotalItemPrice(quantities[i],unitPrices[i]);
     //建立一個 Array 
    }
  
    //Loop
    double invoiceTotalAmount = calcTotalInvoiceAmount(totalItemsPrices);
    //for (int i = 0; i < totalItemsPrices.length;i++){
    //  total += totalItemsPrices[i];
    //}
    System.out.println("totaal Amount=" + invoiceTotalAmount);
    }
