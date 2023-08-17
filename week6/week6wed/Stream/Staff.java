package week6.week6wed.Stream;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import javax.crypto.spec.DESKeySpec;

import week5.week5tue.linkedlist.Linkedlist;

public class Staff {
  String name;
 Department department;
 int performance;

  public Staff(String name, Department department, int performance){
    this.name = name;
    this.department = department;
    this.performance = performance;
  }

  public Department getDepartment(){
    return this.department;
  }


 @Override
public String toString(){
  return "Dept["//
  + "name=" + this.name
  +"dept=" + this.department//
  +"]";
}



  public static void main(String[] args) {
    List<Staff> staffs = Arrays.asList(
     new Staff("Mary",new Department("HR"), 50)
    ,new Staff("Peter", new Department("IT"),60)
    ,new Staff("Eric", new Department("IT"),70));
   
    Map<Department, List<Staff>> depts = staffs.stream()//department and list is common, thats why use map
   
    .collect(Collectors.groupingBy(staff -> staff.department))
    // return groupingBy(classifier, toList());
    
    ;
    depts.forEach(
      (dept, staffList) -> System.out.println(dept + " " + staffList));

      for(Staff staff: depts.get(new Department("IT"))){// equals() & hashcode
        System.out.println(staff.name);
      }

      //
      Map<Boolean, List<Staff>> gradeMap = staffs.stream()//
      .collect(Collectors.partitioningBy(staff -> staff.performance >= 65));


      gradeMap.entrySet().stream()// list, set -> stream()
      .forEach(e -> System.out.println(e));
  }
}
