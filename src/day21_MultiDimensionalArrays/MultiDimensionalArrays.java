package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

        int[] arr={1,2,3};
        int[][] arr2D={{1,2,3},{4,5,6,7}};

        System.out.println(arr.length);

        int[] arr1D= arr2D[0]; //1,2,3
        System.out.println(Arrays.toString(arr2D[0]));

        int num1=arr2D[1] [3];
                       //  0   1   2     0   1   2
        char[][] char2={ {'A','B','C'},{'D','E','F'},{'G','H'} }; // it will give us F because first we chose second array and it's
        // second index number
         char ch1=char2[1][2];
        System.out.println(ch1);

        char[] ch2=char2[2];

        System.out.println(Arrays.toString(ch2));

        String[][] str2D ={{"A","B","C",},{"D","E","F"},{"G","H","I"}};

        String str1=str2D[2][1];
        System.out.println(str1);











    }
}
