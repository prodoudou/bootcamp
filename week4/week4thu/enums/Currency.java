package enums;

public enum Currency {
  USD(1,"US Dollor"),
  HKD(2,"Hong Kong Dollor"),
  CNY(3,"Chinese Yuan Renminbi"),
  GBP(4,"British"),
  ;
  
  private int id;
  private String desc;

  private Currency(int id,String description){
    this.desc = desc;
  }

  public int getId(){
    return this.id;
  }

  public String getDesc(){
    return this.desc;
  }

  public static Currency getCurrency(int id){
    //value()
    for(Currency currency : Currency.values()){
      if(currency.id == id){
        return currency;
      }   
    }
    return null;
  }

  public static void main(String []args){
    //valueOf
    //System.out.println(Currency.valueOf(HKD.getDesc()));
    System.out.println(Currency.valueOf("HKD"));
  }
}
