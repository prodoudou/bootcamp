package week6.week6wed.lambda2;
@FunctionalInterface
public interface SuperFunction<T, S, U, R>{

  R apply(T t, S s, U u);
  
}
