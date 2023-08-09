package week4mon.inherfitance;

import java.util.Objects;

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

  @Override
  public boolean equals(Object o){
    if(this ==o){
      return true;
    }
    if(!(o instanceof Keyboard)){
      return false;
    }
    Keyboard keyboard = (Keyboard) o;
    return Objects.equals(keyboard.buttonType, this.buttonType)
    && Objects.equals(keyboard.noOfButton, this.noOfButton);
  }
}

