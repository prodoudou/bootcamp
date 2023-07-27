public class Computer {
  // arttributes
  private int ram;
  private int weight;
  private String color;

  // Constructors

  public Computer() {

  }

  public Computer(String color) { // (1) No return type. (2) constructor name = class name
    this.color = color;// 唔寫代表有
    // 寫左無其他constructor
    //
  }

  public Computer(int ram, int weight, String color) {// (1) No return type, (2)
    this.ram = ram;
    this.weight = weight;
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }
  // method

  public void setRam(int ram) {
    this.ram = ram;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public static void main(String[] args) {
    Computer c1 = new Computer();
    Computer c2 = new Computer(4, 5, "BLACK");
    System.out.println("before : " + c2.getColor());
    
    c2.setColor("WHITE");
    System.out.println("after : " + c2.getColor());

    c2.color="";
    System.out.println(" Last : " +c2.getColor());
  }
}
