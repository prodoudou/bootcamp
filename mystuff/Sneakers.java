package mystuff;

import java.time.LocalDate;

public class Sneakers extends Product {

  private String name;
  private String model;
  private LocalDate releaseDate;
  private double size;
  private double price;

  public Sneakers() {

  }

  public Sneakers(String name, String model, LocalDate releaseDate, double size, double price) {
    this.name = name;
    this.model = model;
    this.releaseDate = releaseDate;
    this.size = size;
    this.price = price;
  }

  public double getPrice() {
    return this.price;
  }

  public String getName() {
    return this.name;
  }
  
  public String getModel(){
    
  }
}
