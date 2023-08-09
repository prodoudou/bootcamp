package week3.demo_25Jul;
public class Mathmath {


  public static void main(String[]agrs){
    System.out.println(Math.round(5.4));
    System.out.println(Math.round(5.5));
    System.out.println(Math.round(5.44));
    System.out.println(Math.round(5.45));

     System.out.println(Math.sqrt(-26));

     int num = -25;
     if(num > 0 && Math.sqrt(num)==5){// if num <=0 , exit
       //dosomthing
     }

     Math.random();// 0.0 - 1.0
     //base 10:
     //log10 -> 1
     //log1000 -> 3
     //base2:
     //log8 -> 3

    double number = 8.0; //The number for which we wamt to calculate
    double naturalog = Math.log(number);

    System.out.println(Math.log10(1000));//3.0

    int[] nums = new int []{-100, 100, 90, 50};

    // -100 -> 100
    //100 + 100 + 90 + 50
    int sum= 0;
    for(int i = 0; i < nums.length;i++){
    sum+= Math.abs(nums[i]);

    }
    System.out.println(sum);

    double[] arr = new double[] {-5.64, 5.34, 9.800, 6.55};
    
    int total = 0;
    for(int i= 0; i< arr.length;i++){
      total = total + (int)Math.round(Math.abs(arr[i]));
      
    }
     System.out.println(total);

     int cubeLength = 3;
     double volume = Math.pow(cubeLength, 2); //9

     System.out.println(volume);

      double[] bases = new double[] {2,3,4,5};
     double[] indexes = new double[] {3,4,5,6};
     double[] results = new double[]{bases.length};
     for(int i = 0;i < bases.length;i++){
      results[i] = Math.pow(bases[i], indexes[i]);

    System.out.println(results[i]);
    }
     


     

  }
}
