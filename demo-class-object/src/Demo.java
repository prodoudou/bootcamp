public class Demo {
  public static void main(String[] args) {
    Car car = new Car();
    Car car2 = new Car(4, 7, "RED");
    car2.getNoOfwheel();
    // print car 2
    System.out.println(car2.getCapacity());
    System.out.println(car2.getColor());
    System.out.println(car2.getNoOfwheel());

    // car2 = new Car(5,10, "yello"); //later
    car2.setColor("YELLOw");// car2 -> object reference, storing the object //*****/ the most
                            // important///*****
    car.setColor("BLUE");
    // car2 -> YELLOW
    // car - > BLUE
    System.out.println(car2);// print >>>Car@8bcc55f<<< = memory address or called reference address in the
                             // stack
    // car@8bcc55f -> object reference, storing the object object address

    car2 = new Car(3, 4, "black");//
    car2 = null;// 可以解作null = 無指向
    car2 = new Car(10, 3, "pink");
    // class = need construstor to new//

    // int []arr = new int []{}
    CarFactory carFactory = new CarFactory(); // object is carfactory
    carFactory.changeColor(car2, "white");//
    System.out.println(car2.getColor());// white

    Person person = new Person();//
    Computer computer = new Computer();
    String str = new String("Hello");// str ->object reference

    str.charAt(1);

    person.setAge(15);
    person.getAge();// 15

    Student student = new Student("Eric", "Lau", 30);
    System.out.println(student.fullName());// Eric Lau

    // class must assign value // class must have object
    // class must have "new xxx"
    Computer cc2 = new Computer();

    //cc2.color = "";<-----如果係public 咁樣就可以edit佢
    System.out.println(" Last : " + cc2.getColor());

    //cc2.setColor("");<----可以透過getter setter 修改入面既value


  }
}
