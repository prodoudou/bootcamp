

public class House extends Building {
  
  private double capacity;


  public House (){

  }
   
  public House (double capacity){

  } 

  public double getCapacity(){
    return this.capacity;
  }
 
  @Override
  public void print(){
    System.out.println("I am house");
  }
   //overloading
   public void print(String s) {
    System.out.println("overloading ..." +s);
   }

   public void buildingPrint(){

   }



}
