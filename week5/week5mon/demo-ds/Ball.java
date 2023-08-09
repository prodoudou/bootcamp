import java.util.Objects;
import java.util.Random;

public class Ball {
  private int id;
  private Color color;
  private static int idCounter = 0;

  public Ball(int id, Color color) {
    this.id = id;
    this.color = color;
  }

  public Ball(Color color) {
    this.id = ++idCounter;
    this.color = color;
  }

   public int getScore(){
    return this.color.getScore();// refer to color class's getscore
   }


  public int getId() {
    return this.id;
  }


  public static Ball random(){
    //Get Random Color
    int random  = new Random().nextInt(3);//
    Color color = Color.getColor(random);
    return new Ball (color);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Ball))
      return false;
    Ball ball = (Ball) o;
    return this.id == ball.id && this.color == ball.color;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.color);
  }

  @Override
  public String toString(){
    return new String("Ball ID:"+this.id+"  Color: "+this.color);
  }

}
