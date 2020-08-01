package day22_Arrays_Loops;

import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};

        for(int i=arr.length-1;i>=0;i--){
            int news =arr[i];
            System.out.println(news);
        }
        System.out.println("=========================");
        int[] Revarr=new int[arr.length]; //0 0 0 0 0 0
      /*  Revarr[0]=arr[4];
        Revarr[1]=arr[3];
        Revarr[2]=arr[2];
        Revarr[3]=arr[1];
        Revarr[5]=arr[0]; */

        int j=arr.length-1;
        for(int i=0;i<arr.length;i++){
            Revarr[i]=arr[j];
            j--;


        }
        System.out.println(Arrays.toString(Revarr));





        






    }
}
