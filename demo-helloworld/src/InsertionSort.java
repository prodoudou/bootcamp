import java.util.Arrays;

public class InsertionSort {
  public static void main(String []args){
    //[5, 1, 4, 8, 2]
    //step1.1: [1, 5, 4, 8, 2] (insert 1 to arr[0], 1 <5 )
    //After round 1, [1,5] is sorted
    //step2.1: Compare 4 < 5
    //step 2.2: Compare 1 < 4 -> [1, 4, 5]
    //After round 2, [1 ,4, 5] is sorted
    int[] array = new int[] {5, 1, 4, 8, 2};
     int temp = 0;
    for(int i = 1; i < array.length; i++) {
			temp = array[i];
			int j = i - 1;
			
			while(j >= 0 && array[j] > temp) {//run the condition until complete it
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = temp;
		}
     System.out.println(Arrays.toString(array));

     for (int s: array){
      System.out.println(s);
     }

     for(int i=0;i<array.length;i++){
      System.out.print(array[i]+"  ");
     } 

}
}