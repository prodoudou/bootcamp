public enum Color {
  RED(100),//score is belong to objecet
  BLUE(200),
  YELLOW(300),//
  ;

  private int score;

  private Color(int score){//must private enum constructor
    this.score = score;
  }

  public int getScore(){
    return this.score;
  }

  public static Color getColor(int id){//呢個METHOD於邊都一樣
    if(id < 0 || id > 2)
    return null;
    switch(id){
      case 0:
      return Color.RED;
      case 1:
      return Color.BLUE;
      case 2:
      return Color.YELLOW;
    }
     return null;
  }
}
