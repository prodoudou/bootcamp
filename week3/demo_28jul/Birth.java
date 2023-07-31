import java.time.LocalDate;
import java.time.Month;  
public class Birth {

  public static void main (String []args){
    LocalDate today = LocalDate.now();
    System.out.println(today);//2023-07-28
    LocalDate specifiDate = LocalDate.of(2023,Month.FEBRUARY, 28);
    System.out.println(specifiDate);

    LocalDate d1 = LocalDate.parse("2023-12-30");
    System.out.println(d1.getYear());//2023
    System.out.println(d1.getMonth());//December
    System.out.println();
    Month result = d1.getMonth();
    System.out.println(result.getValue());//12
    System.out.println(d1.getDayOfMonth());//30
    System.out.println(d1.getDayOfWeek());//saturaday (dayofweek)

    System.out.println(LocalDate.parse("2023-07-28").getDayOfWeek());
    System.out.println(LocalDate.parse("2023-07-28").getDayOfYear());
    
    System.out.println(d1.plusMonths(3L));//2024-03-30
    //plusDays
    //Plus Years
    boolean expiry = false;
    LocalDate effectiveDate = LocalDate.of(2023, 7 ,20);
    if(LocalDate.now().isBefore(effectiveDate.plusMonths(3L))){
      expiry = true;
      System.out.println(expiry);
    }
System.out.println(LocalDate.now().getDayOfWeek());
  }
}
