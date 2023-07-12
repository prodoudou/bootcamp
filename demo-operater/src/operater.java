public class operater {

public static void main (String [] args) {
  int a = 1;
  a = a + 1;// 2
  a = a - 2;// 0
  int b = 10 / 5; // 2
  b = b * 3 + 5; // 11

  System.out.println("a+b=" + a + b);//

  int x = 1;
  x = x + 1;
  x++;// mean x = x + 1;
  ++x;// means x = x + 1;
  x +=5;// means x = x + 5;
  System.out.println("x=" + x);// x=9

  int y = 10;
 
  y--;
  --y;
  y -= 1;
  System.out.println("y=+" +y);

  //Other +,-,*,/
  int z = 4 ;
  z += 2;
  int i = 6;
  i = i -3;
  i -= 3;
  int w = 9;
  w = w * 3;
  w *= 3;
  int u = 81;
  u = u / 9;
  u /= 3;
  System.out.println("u=" +u);

  int integer =  12 % 5; //2
  int integer2 = 12;
  integer2 %= 5;//2
  System.out.println(integer2);

  // ++,--
  int m = 3;
  m++; //4
  int preIncrement = ++m;// ++first ? or assignment first?
  System.out.println("preIncrement=" + preIncrement); //5
  int postIncrement = m++; // assigement first, ＋1 later
  System.out.println("posIncrement=" + postIncrement);// 5
  System.out.println("m=" +m);// 6

  int n = 8;
  n--;//= 7
  int preDncrement = --n;// = 6
  System.out.println("preDncrement=" +preDncrement);
  int postDncrement = n--;//
  System.out.println("postDncrement=" +postDncrement);
  System.out.println("n=" +n);
  



  //String +=  String str = "hello"














}

}
