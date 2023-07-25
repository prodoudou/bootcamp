public class Car {
  //Instance Variable (Instance -> object)
  private int noOfwheel;//0

  private int capacity;//0 

  private String color;//null class default value is null

  //empty constructor
  public Car(){

  }
  //All-argurments constructor (All parameters)
  public Car(int noOfwheel, int capacity, String color){
   this.noOfwheel = noOfwheel;
   this.capacity = capacity;
   this.color = color;
  }



  public int getNoOfwheel() {
    return this.noOfwheel;

  }

  public void setNoOfwheel (int NoOfwheel){
    this.noOfwheel = NoOfwheel;
  }

  public int getCapacity() {
    return this.capacity;
  }

    public void setCapacity(int capacity){
      this.capacity = capacity;
  }
  public String getColor (){
    return this.color;
  }

  public void setColor(String color){
      this.color = color;
}
}
