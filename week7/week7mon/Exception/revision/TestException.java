package week7.week7mon.Exception.revision;

public class TestException {

  public static int method(int amount)throws BusinessException{
   if( amount >= 0){
    return amount * 100;
   }
    throw new BusinessException("amount < 0");
  
  }
  // Approach 2: throws the BusinessException in method signature
  public static int method2 (int amount) throws AbcException{
    if(amount >= 0)
    return amount * 100;
    throw new AbcException();
  }


  public static void main(String[] args) throws BusinessException {
   //Exception // check exception
  //Approach 1: handled by try & catch

try{
  int result = method(-2);// once hit error, cannot proceed
  //skip the rest of the codes.....
}catch (BusinessException e ){
  System.out.println(e.getMessage());// amount < 0
}
finally{
  System.out.println("finaly code block");
}

 //RuntimException // unchecked exception
 int a = 10;
 if( a >= 0){
int result2 = method2(a);// Dont need to handle Runtime exception
  }



  }
}
