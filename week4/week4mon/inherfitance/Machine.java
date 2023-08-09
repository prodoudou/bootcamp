package week4mon.inherfitance;

public class Machine {
  //First Define what machine is
  private double weight;
  
public Machine(){

}
  public Machine (double weight){
    this.weight = weight;
  }

  public double getWeight(){
    return this.weight;
  }

  public void setWeight(double weight){
    this.weight=weight;
  }
  public void start(){
    System.out.println("Machine Starts");

  }

  public void stop(){
  System.out.println("Machine Stop");
  }
//////after lunch//////////
  public static final String staticMethod(String x, String y){

return x+y;
  //
}

public static Machine produce(int code){
switch(code){
  case 1:
  return new Machine();
  case 2:
  return new Laptop(); // child
  
}
return new Machine();
}

public static void stop (int code){//what machine going to stop??
  Machine machine = Machine.produce(code);
  machine.stop();//difference child class will have different implementation
}

public static void main(String []args){
int pockeyMoney = 100;
boolean stopCondition = pockeyMoney < 0;//???
int code = 1;

if(stopCondition){
  Machine.stop(code);//Machine stop....
}

  Machine machine1 = Machine.produce(1);//Machine
  machine1.stop();//Machine stop...
  Machine machine2 =Machine.produce(2);//Laptop refer laptop file 54 line because return new laptop
  machine2.stop();//Laptop stop...
}
}