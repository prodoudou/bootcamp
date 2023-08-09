public interface Player {

 //int calculateScore();

 static void fillThePocket(Pocket pocket){
  while(!pocket.isFull()){
    //Random a ball with a random color
    pocket.add(Ball.random());
  }
}

  
}
