package day22_Arrays_Loops;

import java.util.Arrays;

public class NestedLoops2 {
    public static void main(String[] args) {

        int[][] numbers={{1,2,3},{4,5,6},{7,8,9} };

        for(int k=0;k<numbers.length;k++){
            for(int i=0;i<numbers[k].length;i++){
                System.out.print(numbers[k][i]+" ");
            }
            System.out.println();
        }

        System.out.println("======================================");
        for(int k=0;k<numbers.length;k++){
            for(int i=numbers[k].length-1;i>=0;i--){// we started to print from the last
                System.out.print(numbers[k][i]+" ");
            }
            System.out.println();
        }

        for(int k=numbers.length-1;k>=0;k--){
            for(int i=0;i<numbers[k].length;i++){
                System.out.print(numbers[k][i]+" ");
            }
        }
        System.out.println();
       for(int k=numbers.length-1;k>=0;k--){
           for(int i=numbers[k].length-1;i>=0;i--){
               System.out.print(numbers[k][i]+" ");
           }
       }









    }
}
