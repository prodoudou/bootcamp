package week4mon.inherfitance;

import java.util.Objects;

public class Laptop  extends Machine {
  ////Lapt top is subclass(child), Machine is superclass(parent)
  //INheritMachine "doule weight"
//attribute 係繼承 
//override 係method
  //extends Machine 
  //Machine 所有的 Attributes/Methods 可被 Laptop 繼承
  private Keyboard keyboard;
  private Monitor monitor;
  private int volume;
  //double weight; //which has been declared in Machine Class


  public Laptop(){//constructor = 說明書 ＝no assign value
  //implicitly call superclass Machine empty constructor
  //subclass must call superclass constructor
  //super();//new machine

  }

  public Laptop(Keyboard keyboard,Monitor monitor){///constructor = 說明書 ＝no assign value
     //implicitly call superclass empty constructor
    this.keyboard = keyboard;
    this.monitor = monitor;
  }

  public Laptop(String buttonType, int noOfButton, double length, double width){
     //implicitly call superclass Machine empty constructor//constructor = 說明書 ＝no assign value
    this.keyboard = new Keyboard(buttonType, noOfButton);
    this.monitor = new Monitor(length, width);
  }

public Laptop(double weight,Keyboard keyboard,Monitor monitor ){//constructor = 說明書 ＝no assign value
   // new Machine(5) //call老豆constructor 放個WEIGHT入去
  super(weight);// super();  +  this setWeight(weight);
  this.keyboard = keyboard;// this.keyboard = 呢個this既Keyboard
  this.monitor = monitor;
}
@Override
public boolean equals(Object o){

  if (this == o){
    return true;
  }
  if(!(o instanceof Laptop)){
    return false;
  }
  Laptop laptop = (Laptop) o;
  return Objects.equals(laptop.keyboard, this.keyboard)
  && Objects.equals(laptop.monitor, this.monitor);
}



@Override//Method Override 
// @override = checking 有冇START METHOD//
public void start(){
  super.start();
  System.out.println("Laptop Start...");
}

@Override//Method Override
// @override = checking 有冇START METHOD//
//如果唔寫 而呢個MEHOTD 會紅線
public void stop(){
  System.out.println("Laptop stop...");
}

public void mute(){
  this.volume = 0;
}

  public static void main(String[]args){
Laptop laptop = new Laptop("abc", 100, 15, 10);
laptop.setWeight(3.0d);
System.out.println(laptop.getWeight());//3.0
laptop.start();//Laptop start// overrided refer 24line
laptop.stop();//Laptop stop// overrided refer 30 line

Machine machine = new Machine();
machine.setWeight(5.0d);
System.out.println(machine.getWeight());
machine.start();//machinie start...
machine.stop();// machine Stop

Laptop laptop2 = new Laptop();//empty constructor 
laptop.setWeight(10.0d); //SETWEIGHT
System.out.println(laptop2.getWeight());
//////after lunch//////////
Laptop laptop3 = new Laptop();
System.out.println(laptop3.getWeight());//1.0
System.out.println(Machine.staticMethod("abc", "def"));//abcdef
System.out.println(Laptop.staticMethod("abc", "def"));//abcdef
//laptop3.staticMethod("null","www");// not recommand


}
  }
