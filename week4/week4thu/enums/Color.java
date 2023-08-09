package enums;

public enum Color {
  //hexCode
  RED("#FF0000"),//
  GREEN("00FF00"),//
  BLUE("#0000FF"),//
  ;


  private String colorcode;
  
  private Color (String colorcode){
    this.colorcode = colorcode;
  }

  public String getColor (){
    return this.colorcode;
  }
    
 
 
}
