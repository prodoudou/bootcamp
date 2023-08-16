package week6.week6mon.exception.checked;

import java.util.Deque;
import java.util.LinkedList;

public class AmountZeroException  extends Exception{
  public AmountZeroException(String message){
    super(message);
  }
}
