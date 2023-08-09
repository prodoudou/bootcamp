package week4mon.crash;

public class X extends Y {
  private String name;

  public X(String name) {
    // Approach 1
    super("John"); // name for Y
    // Approach 2
    // super();
    // this.setName("John");
    this.name = name; // name for X
  }

  public String getName() {
    return this.name;
  }

  public String getParentName() {
    return super.getName();
  }

  public static void staticMethod() {
    System.out.println("I am X");
  }

  public static void main(String[] args) {
    X x = new X("Peter");
    System.out.println(x.getName());// peter
    System.out.println(x.getParentName());// John
    // refer 13 line >> refer to Y 14, line>>> 7line
    // System.out.println((Y)x).getName();//強行case

    // hiding
    Y y = new X("Tommy");
    y.staticMethod();// I am Y , Hiding <<<<<< just education for example , do not remember
    // you should practice and understand below syntax
    Y.staticMethod();// I am Y >>> Y 18line
    X.staticMethod();// I am X >>> 17line
    System.out.println(y.getName());// Tommy

  }
}