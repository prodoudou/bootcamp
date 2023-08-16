package week5.week5fri.demogenrics.zoo;

public class Zoo<T> {
  T animal;

  // Constuctor
  private Zoo(T animal) {
    this.animal = animal;
  }

  // Zoo<T> -> return type
  // T -> input
  // <T extends Animal> -> the range of T
  public static <T extends Animal> Zoo<T> of(T animal) {
    
    return new Zoo<>(animal);

  }

  public T getAnimal() {
    return this.animal;
  }

  public void setAnimal(T animal) {
    this.animal = animal;
  }
}
