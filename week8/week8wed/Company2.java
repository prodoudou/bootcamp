package week8.week8wed;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Company2 {
  Staff[] staffs;
  
  public Company2(){
    staffs = new Staff[0];
  }

  public Company2(Staff[] staffs){
    this.staffs = staffs;
  }

  public void add(Staff staff){
    Staff[] original = this.staffs;// references
    this.staffs = new Staff[this.staffs.length + 1];
    for( int i = 0; i < original.length; i++){
      this.staffs[i] = original[i];
    }
    this.staffs[this.staffs.length-1] = staff;
  }

  public Staff[] getStaffs(){
    return this.staffs;
  }

  public void remove(Staff staff){
  //found, reszie array and remove
  int idx = -1;
  for(int i = 0; i < this.staffs.length;i++){
    if(staffs[i].equals(staff)){
    idx = i;// 
    }
  }
  //not found, do nothings
  if (idx == -1)
  return;;
  //found, resize array and remove
  Staff[] original = this.staffs; // reference
  this.staffs = new Staff [this.staffs.length -1];
  int start =0;
  for (int i = 0; i < this.staffs.length; i++){
    if(i == idx)// index of the elements to be removed
    continue;
    this.staffs[start++] = original[i];
  }
  }

  public static void main(String[] args) {
    Company2 company = new Company2();
    company.add(new Staff(1,5000,"John"));
    System.out.println(company.staffs.length); //1
    company.add(new Staff(2, 10000, "Mary"));
    System.out.println(company.staffs.length);//2

    List<Person> persons = Arrays.stream(company.getStaffs())
    .filter(s -> s.getSalary() > 20000)
    .map( e -> new Person(e.getName()))
    .collect(Collectors.toList());


  }
}
