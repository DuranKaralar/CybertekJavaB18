package day22_Arrays_Loops;

import java.util.Arrays;

public class Multi_DArrays {
    public static void main(String[] args) {

        int[] arr={1,2,3};
        //         0 1 2
        //n dimensiNonal array contains n-1 dimensional arrays
        //2D array:[index num of 1D array][]

        int[][] arr2D={{1,2,3},{4,5,6} };
                    //    0

        int[] arr1D=arr2D[0];
        System.out.println(Arrays.toString(arr1D));
        System.out.println(Arrays.toString(arr2D[0])); // if we divide like that it will give us same resuly
        System.out.println(Arrays.deepToString(arr2D));

        System.out.println(arr2D[0][2]);// 3
        System.out.println(arr2D);// it will give us h code

        System.out.println(Arrays.toString(arr2D[1]));

        for(int eachElement : arr2D[0]){
            System.out.println(eachElement);
        }
        for(int i=0;i<arr2D[0].length;i++){
            int each = arr2D[0][i];
            System.out.println(each);

        }




    }
}
