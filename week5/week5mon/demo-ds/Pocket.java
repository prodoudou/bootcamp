import java.util.ArrayList;
import java.util.Objects;

public class Pocket {
  ArrayList<Ball> balls;//attribute// 每一個array[0],[1]入面有 有一個array list

  public Pocket(){
    this.balls = new ArrayList<>();
  }


  public boolean isFull(){
    return this.balls.size() >= 5;
  }

  public ArrayList<Ball> getBalls(){
    return this.balls;
  }

  public void removeFirstBall(){
    this.balls.remove(0);
  }

  public void add(Ball ball){
    //if number of ball > 5 , remove the 1st (idx = 0), and add
    if(this.balls.size() >= 5){
      this.balls.remove(0);//?
      return;
    }
    this.balls.add(ball);
    
  }

    public void remove (Ball ball){
      this.balls.remove(ball);//first occurrence
    }
      public void remove (int ballId){//overloding
      for(Ball b : this.balls){
        if(b.getId() == ballId){//primitive
         this.balls.remove(b);
         return;//remove the first one and return
        }
      }
    }
    

  public int getSize(){
 return this.balls.size();
  }
   
  @Override
  public String toString(){
    StringBuilder sb = new StringBuilder("[");
    for(Ball b : this.balls){
      sb.append(b);
    }
   return sb.toString();
  }
  public int totalScore(){
    int sum = 0;
    for(Ball b : this.balls ){
        sum += b.getScore();
    }
    return sum;
  }




  }
