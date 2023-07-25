public class Student {
  // state / instance Variables
  String firstName;
  String lastName;
  int age;

  // all-argument constructor ->new object (instance)

  public Student(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public String fullName() {
    
    return this.firstName.concat(" ").concat(this.lastName);
  }
  // Behavior / Methods
  // public String getFirstName() {
  // return this.firstName;
  // }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  //  public String getFirstName(){
  //   return this.firstName;
  //  }
  // public String getLastName() {
  //  return this.lastName;
  //  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public boolean isAdult() {
    // if(this.age >= 18){
    // return true;
    // }
    // return false;
    return this.age >= 18;
  }

  public void setAge(int age) {
    this.age = age;
  }
  // public int getAge() {
  // return this.age;
  // }

}
