package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString(onlyExplicitlyIncluded = true)
@Setter

@AllArgsConstructor // annotation
@NoArgsConstructor
public class PersonLomBok {
  @Getter
  private String name;
  @ToString.Include
  private int age;

  public static void main(String[] args) {
    PersonLomBok personLomBok = new PersonLomBok("Peter", 30);
    PersonLomBok p2 = new PersonLomBok();
    p2.setAge(13);
    p2.setName("Eric");
   // System.out.println(p2.getAge());// 13
    System.out.println(p2.getName());// Eric
    System.out.println(p2.toString());//PersonLomBok(age=13) because @tostring.include

  }

}
