package day22_Arrays_Loops;

public class Nested_ForEach_Practice {
    public static void main(String[] args) {


        int[][] numbers={{1,2,3},
                {4,5,6,7,8,9,},
                {10,11,12,13,14},
        {15,16,17,18,19,20,21}
    };
    int count=0;
         int sumofeven=0;
        //1.print all even numbers in a same lin
        // 2.count odd numbers ==> return the total odd number
        for(int[] eachElement :numbers ){
            for(int eachNumbers : eachElement) {
                if (eachNumbers % 2 == 0) {
                    sumofeven +=eachNumbers;
                    System.out.print(eachNumbers + " ");
                }else{
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println(count);












    }
}
