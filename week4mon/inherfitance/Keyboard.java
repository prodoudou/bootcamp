package week4mon.inherfitance;
public class Keyboard {
  
  private String buttonType;
  private int noOfButton;

  public Keyboard(String buttonType, int noOfButton){
    this.buttonType = buttonType;
    this.noOfButton = noOfButton;
  }
  public void setButtonType(String button){
    this.buttonType=button;
  }
  public void setNoOfButton(int noOfButton){
    this.noOfButton=noOfButton;
  }
  public String getButtonType(){
    return this.buttonType;
  }
  public int getNoOfButton(){
    return this.noOfButton;
  }
}

