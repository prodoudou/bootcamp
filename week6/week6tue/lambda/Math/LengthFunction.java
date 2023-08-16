package week6.week6tue.lambda.Math;

import java.util.function.Function;

public class LengthFunction implements Function<String, Integer>{
  @Override
  public Integer apply(String str){
    return str.length();
  }
  
}
