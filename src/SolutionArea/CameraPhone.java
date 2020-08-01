package SolutionArea;

import java.util.Arrays;

public class CameraPhone extends Phone {
    public static int missingNumber(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int number = 1;
        int missing=10;
        for (int i = 1; i < arr.length; i++) {
            int missed=i+1;
            if (arr[i] !=missed ) {
                missing=missed;
                break;
            }else{

            }

        }
        return missing;
      /*  Arrays.sort(arr);
        int missed=10;
        for (int i = 0; i< arr.length; i++) {
            int index = i+1 ;
            if (arr[i] != index) {
                missed = index;
                break;
            }
        }
        return missed;*/
    }

    public static void main(String[] args) {
        int[] arr={10, 5, 1, 2, 4, 6, 8, 3, 9};
       int result= missingNumber(arr);
        System.out.println(result);
    }
}
