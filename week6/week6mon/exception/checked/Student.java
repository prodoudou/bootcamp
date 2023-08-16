package week6.week6mon.exception.checked;

public class Student {
  String name;
  long pocketMoney;
  
public Student(){
   
  }

  public Student(String name){
   this.name = name;
  }

  public void setName(String name)throws NameTooLongException{// set up condition = need to add throws
    if (name.length() > 10)
    throw new NameTooLongException("Name is too long(> 50)");
   this.name = name;
  }

public void setPocketMoney(long money)throws AmountZeroException{// set up condition = need to add throws
    if (pocketMoney < 1)
    throw new AmountZeroException("Amount <=0");
   this.pocketMoney = pocketMoney;
  }
public static void main(String[] args){
  Student student = new Student("John");
  try{
    //checked exception
   //int i =10 /0 ;
student.setName("John 1sdfsdfsdsdgsdg");// if exception, throw it to the caller
student.setPocketMoney(-3);
   }catch (NameTooLongException | AmountZeroException e){//可以用EXCEPTION接 就係polymorphism 
   //System.out.println(e.getMessage());
   System.out.println("Student Setter Issue, message=" + e.getMessage());
   }catch (RuntimeException e){
    System.out.println(e.getMessage());
   }catch (Exception e){//exception is 最大 包埋run time
    System.out.println(e.getMessage());
   }finally{
    System.out.println("finally");
   }


   Student student2 = new Student();

   }


   //student2.name.length();//null pointer ,uncheck
   



}
