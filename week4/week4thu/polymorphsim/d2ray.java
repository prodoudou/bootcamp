
import java.util.Arrays;
import java.util.Random;

public class d2ray{

  int age;
  public static void main(String[] args) {
    int[] nums = new int[3];
    // int [] nums; ->declaration
    // new int [3]; ->initalization
    nums = new int[10]; // re-assignnment
    nums = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };// re-assignemnt

    int[][] matrix = new int[3][4];// new int[row][column]
    // 3 rows x 4 colums
    // 1, 2, 3, 10
    // 4, 5, 6, 7
    // 10, 2, 3, 1

    // random a number and assign to an 2D array (0 - 12)
    // nested loop

    System.out.println(matrix.length);// 3 row length
    System.out.println(matrix[0].length);// 4 (colum length of row = 0)

    for (int i = 0; i < matrix.length; i++) {// 0, 1, 2
      // matrix[0] -> return int[]
      // matrix[0][2] -> get the idx 2 from the array of the row p
      for (int j = 0; j < matrix[0].length; j++) {
        matrix[i][j] = new Random().nextInt(13);
        
      }}
       System.out.println("2Darray =" +Arrays.deepToString(matrix));
       //convery 2D array to 1D array
       int idx = 0;
      int [] arr = new int [matrix.length * matrix[0].length];//12
      for (int i = 0; i < matrix.length; i++){// 0, 1 ,2
        for(int j = 0;j < matrix[0].length;j++){//0 , 1, 2 ,3
          arr[idx++] = matrix[i][j];
        }

      }
      System.out.println(Arrays.toString(arr));


      //Convert 2D array to a string
      String str = "";
      for(int i = 0; i < matrix.length; i++){// 0, 1 ,2
        for(int j =0; j < matrix[0].length;j++){//0, 1, 2, 3
         str += matrix[i][j];
        }
      }
       System.out.println(str);
       //3D array
       int [][][] arr3d = new int [1][2][3];
       //4D array
       int[][][][] arr4d = new int [1][2][3][4];

       d2ray[][] demo = new d2ray[2][2];
       demo[0][0] = new d2ray();
       demo[0][1] = new d2ray();
       demo[1][0] = new d2ray();
       demo[1][1] = new d2ray();

       for (int i = 0 ; i < demo.length; i++){
        for(int j = 0; j < demo[0].length;j++){
          System.out.println(demo[i][j].age);// 0 print age of each demo object
        }
      }

       String [][] strings = new String [][]{{"abc","def"}, {"xyz", "ijk"}};
       for (int i = 0 ; i < strings.length; i++){
        for(int j = 0; j < strings[0].length;j++){
          System.out.println(strings[i][j]);
        }
       }



  }
}