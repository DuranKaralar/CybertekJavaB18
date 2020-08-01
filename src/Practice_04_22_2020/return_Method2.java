package Practice_04_22_2020;

import java.util.Arrays;

public class return_Method2 {
    //write a return method that can return the second maximum number from an int array
    public static void main(String[] args) {
        int[] arr={1010,40,500, 50, 30, 1100, -5, -100};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int lasIndexNum=arr.length-1;
        int secondlastIndex=lasIndexNum-1; // second maximum number
        int secondMaxNum=arr[secondlastIndex];

        int arr2[]={1,2,3,4,5,6,7,8};
        int s2max=Secondmaximum(arr2);
        System.out.println(s2max);

    }
    public static int Secondmaximum(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int lasIndexNum=arr.length-1;
        int secondlastIndex=lasIndexNum-1; // second maximum number
        int secondMaxNum=arr[secondlastIndex];
        return secondMaxNum;

    }

    //


}
