package day20_ArraysContinue;

import java.util.Arrays;

public class Arrays_Sorting {
    public static void main(String[] args) {

        int[] arr1={9,8,7,2,3,4,5,1,6};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("Smallest number is "+arr1[0]); //smalest
        System.out.println("Biggest number is "+arr1[arr1.length-1]);//maximum

        char[] ch={'Z','E','D','X','A','B','W','Y'}; // ascii table order
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));

        String[] names={"Bekir","Deniz","Osman","Rustem"}; // asci table order
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        System.out.println("=============");
        int[] arr={3,1,4,-1,-100,200,155};
        Arrays.sort(arr);

        int[] arrDesc=new int[arr.length];
        System.out.println(Arrays.toString(arr));
        int j=0;

        /*for (int i=arr.length-1;i>=0;i--) {
            System.out.print(arr[i]+" ");
        }*/
        for (int i=arr.length-1;i>=0;i--) {
            //System.out.print(arr[i]+" ");
            arrDesc[j]=arr[i];
            j++;
        }

        System.out.println(Arrays.toString(arrDesc));












    }
}
