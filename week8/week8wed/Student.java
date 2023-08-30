package week7.week8.week8wed;

public class Student<T extends Number> {
  T data;
// Public class Student {
// String data;

  public static void main(String[] args) {
    Student <Integer> student = new Student<>();
    Student.getThing(2);
  }

  public T getData(){
    return this.data;
  }

  public static <T> T getThing(T data){
    return data;
  }
  
}
