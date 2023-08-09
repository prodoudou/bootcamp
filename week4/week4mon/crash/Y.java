package week4mon.crash;

public class Y {
  private String name;

  public Y() {

  }

  public Y(String name) {
    this.name = name;
  }

  
  public String getName() {
    return this.name;
  }
// refer to X Approach 2
  // public void setName(String name) {
  //   this.name = name;
  // }

  public static void staticMethod() {
    System.out.println("I am Y");
  }
}