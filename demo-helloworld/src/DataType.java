import java.security.AlgorithmConstraints;

public class DataType{
 public static void main(String[] agrs) {

  int n = 10;
  System.out.println("3");
  System.out.println(3);
  System.out.println("n");
  
  //bytes,short, long
byte b = 127;

short s = 23;
short s2 = -60;

long l = 400;
long l2 = 1000;
long l3 = 30L; //norm -> L, but not l
System.out.println(l2);

//floating point -> double / float
float f3 = 1.00000003f;
double d4 = 23.9;

// char, value should be assigned by single quote

char gen = 'M';
char s10 = ' ';

// boolean
boolean isMale = true;
boolean isSalaryGreaterThan1000 = true;
boolean isValid = false;

//initialization, means the 1st time of assignment
int a10 = 100;
System.out.println(a10);
// string + operation

String str1 = "hello";
String str2 = "World";
String result = str1 + str2;
System.out.println(result);

String result2 = "something" + "somethings";
System.out.println(result2);

System.out.println(result + " " + result2);

String str3 = "abc" + 13;// default behaviour : convert
String str4 ="abc" + 'A';
String str5 = "abcd" + true;
String str6 = "A";
System.out.println(str6);


//
int a = 1 + 3;// 4
int b10 = 1 - 3;//-2
int c10 = 2 - 88; //-78
int i = 2 * 101;// 202
int p = 10 / 3; // 3
int o = 10 % 3; // 1, 1 is reminder
System.out.println(o)
String s1 = "Hello";
String s3 = "Hello";
System.out.println(s1 == s3);







 }
}

