package day29_Wrapper_ArrayList;

import java.lang.reflect.Array;
import java.util.Arrays;

public class WrapperClass_Practice {
    public static void main(String[] args) {

        String[] arr={"1","2.3","3","5","5.1"};

        double max=Double.MIN_VALUE;

        for(int i=0;i<arr.length;i++){

        }

        for(String each : arr){ // 5, each: 1,2.3,3,5, 5.1,
            double num=Double.valueOf(each);
            if(num>max){
                max=num;
            }
        }
        System.out.println("=====================================");
        /*
        String[] arr ={"1","2.3","3","5.1","5"]

         */

        String[] arr2={"100","1","2.3","3","4","5.1"};
       double[]  numbers=new double[arr2.length];//[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

      numbers[0] =Double.parseDouble(arr2[0]);

        for(int i=0;i<arr2.length;i++){
            numbers[i] =Double.parseDouble(arr2[i]);
        }
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-1]);


    }
}
