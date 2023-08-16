package week6.week6tue.lambda.Math;
@FunctionalInterface
public interface SuperFunction<T, S, U, R>{

  R apply(T t, S s, U u);
  
}
