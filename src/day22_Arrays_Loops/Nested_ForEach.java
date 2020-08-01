package day22_Arrays_Loops;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Nested_ForEach {
    public static void main(String[] args) {

        int[][] arr2D = {{1,2,3},{4,5,6,7} };
        //                  0        1

        for(int[]each1Darray:arr2D){
         for(int eachElement : each1Darray){
             System.out.print(eachElement+" ");
         }
        }
        System.out.println("===========================");

        char[][] ch2D ={{'A','B',},{'C','D','E'}};

        for(char[] ch1 :ch2D ){
            for(char ch2 : ch1){
                System.out.print(ch2);
            }
        }





    }
}
