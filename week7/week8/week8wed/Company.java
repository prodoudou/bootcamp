package week7.week8.week8wed;

import java.util.ArrayList;
import java.util.List;

public class Company {
  List<Staff> staffs;



  public Company (){
    staffs = new ArrayList<>();
  }

  public Company(List<Staff> staffs){
    this.staffs = staffs;

  }

  public List<Staff> getStaffs(){
    return this.staffs;
  }

  public void add(Staff staff){
    this.staffs.add(staff);
  }

  /**
   * Get start name by staff id
   * @param staffId
   * @return
   */
  public String getStaffName (int staffId){
    return this.staffs.stream()//
    .filter(s -> s.getId() == staffId) // List<Staff>
    .map( s-> s.getName())// Convert List<Staff> to List<String>
    .findAny()// optional<String>
    .orElse(null);//String

  }

  public static void main(String[] args) {
    Company company = new Company();
    company.getStaffs().add(new Staff (1, 20000, "John"));//ok
    company.add(new Staff(2, 10000, "Peter"));

    company.getStaffName(1);//John
  }
}
