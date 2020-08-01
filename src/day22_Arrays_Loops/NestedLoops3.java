package day22_Arrays_Loops;

public class NestedLoops3 {
    public static void main(String[] args) {

        int[][] numbers={{1,2,3},
                         {4,5,6,7,8,9,},
                         {10,11,12,13,14},
                         {15,16,17,18,19,20,21}
        };

        //1.print all even numbers in a same lin
        // 2.count odd numbers ==> return the total odd number
        int countodd=0;

        for(int k=0;k<numbers.length;k++){
            for(int i=0;i<numbers[k].length;i++){
                int num=numbers[k][i];
                if(numbers[k][i]%2 ==0){
                    System.out.print(num+" ");
                }else{
                    countodd++;
                }
            }
        }
        System.out.println();
        System.out.println(countodd);












    }
}
