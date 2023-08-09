public class newdemo {
  public static void main(String[] args) {
    // Dynamic Polymophism (Run- time)
    Building building = new House();//
    // Building building2 = new Building();because building class is abstract
    // Compile-time checks
    // building.getCapacity();//compile error
    building.print(); // I am House,compile-time confirm you can call print() method
    // Run-time decide which print( is going to call)
    // So, "bulding" variable call House's print() method
    building.print2();// I am House
    building.print3();

    // static polymorphism (Compile-time)
    // Method singatue (Method name + parametes)
    // constructor Sugnature
    House house = new House();
    house.print("hello");
    house.print();
    House house2 = new House(3.0d);
    house2.print("hello");
    house2.print();
    // House house3 = new house("String");Constractor not found
    // house2.print(3L);//print(long) not found

    long l1 = Long.valueOf(1L);// wrapper class -> unbox
    Long l3 = 3L;//wrapper class -> auto boxupcasting

    long l2 = 2;//upcasting
    int i2 = (int)3L;//downcast

    // downcast
    Object obj = new Container();
    if (obj instanceof Cube) {// false
      Cube cube = (Cube) new Container();// downcast: Object -> Cude
      System.out.println("obj is instance of Cube");
    }
    Object obj2 = new Cube();
    if (obj2 instanceof Container){//true
       Container cube = (Container)obj2;//downcast: Object ->container
       System.out.println("obj is instance of Container");
    }

      Object obj3 = new Clone();
      //Cube cube2 = (Cube) obj3;//java.lang.CLasCastException
      //runtime exception: Run-time polymorphim

      Number number = Integer.valueOf(3);
      //Double d1 = (Double) number;//java.lang.CLasCastException




  }
}