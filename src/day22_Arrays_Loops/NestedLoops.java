package day22_Arrays_Loops;

public class NestedLoops {
    public static void main(String[] args) {

       char[][] arr2D ={{'A','B'},{'C','D','E'},{'F','J','H','I'}};

       //arr2D[0]  ==> A B
       for(int i=0;i<arr2D[0].length;i++){
           System.out.print(arr2D[0][i]);
       }

       for(int i=0;i<arr2D[1].length;i++){
           System.out.println(arr2D[1][i]);
       }

       for(int i=0;i<arr2D[2].length;i++){
           System.out.print(arr2D[2][i]);
       }

        System.out.println("===============================================================");
       for(int j=0;j<arr2D.length;j++){
           for(int k=0;k<arr2D[j].length;k++){
               System.out.println(arr2D[j][k]);
           }

       }








    }
}
