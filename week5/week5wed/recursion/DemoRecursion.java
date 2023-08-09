package week5.week5wed.recursion;

public class DemoRecursion {
  public static void main(String[] args) {
    //algoritm -> algo
    //


    System.out.println(sum(5));
    System.out.println(sum2(6));
    print(5);
    
  }

  //Question 1:
  //k + (k - 1) + (k - 2) + ....+ 0

  // 10,9,8,7,6,5,4,3,2,1,0
  public static int sum(int k){
    if(k < 1){//base condition
    return k ;}

  return k + sum(k -1);


  //sum(5)// no return
  //5 + sum(4), no return
  //5 + +4 + 3 + sum(2) 
  //5 + 4+ 3 + 2 + sum(1)
  //5+4+3+2+1+sum(0)

  //3 + sum(2), no return
  //2 + sum(1), no return
  // 1 + sum(0), no return
  //0 < 1 , return 0
  }

  //Question 2:
  //0, 1, 1, 2, 3, 5, 8, 13... kth elements[0, 1, 2, 3,..]
  //k = 6, return 8
  public static int sum2(int k){
   //base condition
   if(k <=1 )
   return k;
   return sum2(k - 1) + sum2(k - 2 );
  }
  
    //  int sum =0;
  //  for(int i =k; i >= 10 ;i--){
  //    sum+= i;
  //  }
  // return sum;

//qusetion 3:
// 3 2 1 1 2 3, k =3
//
public static void print(int k){
  //base condition
  if(k < 1){
  return ;}
System.out.println(k + " ");// 2
print(k -1);//print (1)
System.out.println(k + " ");//2
}
  
}
