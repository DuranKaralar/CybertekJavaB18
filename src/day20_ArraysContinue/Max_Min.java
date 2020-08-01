package day20_ArraysContinue;
/*
  1. write a program that can find the maximum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE CLASS
    2. write a program that can find the minimum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE
 */
public class Max_Min {
    public static void main(String[] args) {

        int[] arr={2,3,4,5,6,7,8,9};
        int lastindex=arr.length-1; //if there is -1 it is index number

        int max=arr[0];//just assume that first array is max but after that we asssign one by one
        int min=arr[0];

        for(int i=0;i<=lastindex;i++){
            if(arr[i]>max){// array's index are compared with each other and whicever is greater will be asssigned too max
                max=arr[i];
            }
            if(arr[i]<min){//array's index compared with each other, whicever is samller will be assigned
                min=arr[i];
            }

        }

        System.out.println("Max Number "+max);
        System.out.println("Min Number "+min);












    }
}
