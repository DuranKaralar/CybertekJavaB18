package day21_MultiDimensionalArrays;

import javax.jws.soap.SOAPBinding;
import java.util.Arrays;

public class DeepToString {
    public static void main(String[] args) {
        int[] arr1D={1,2,3};

        System.out.println(Arrays.toString(arr1D));

        int[][] arr2D={{1,2,3},{4,5,6,7}};
        System.out.println(Arrays.toString(arr2D));// it will give us sometinh different because it only convert single arrays

        System.out.println(Arrays.deepToString(arr2D)); // we use deeptoSting
                         //   0          1
         int[][][] arr3D = {{{1,2,3,},{4,5,6}},{{7,8,9},{10,11,12}}};
          //                         0                  1

        System.out.println(Arrays.deepToString(arr3D[1]));

        System.out.println(Arrays.toString(arr3D[0][1]));

        System.out.println(arr3D[1][1][2]);









    }
}
