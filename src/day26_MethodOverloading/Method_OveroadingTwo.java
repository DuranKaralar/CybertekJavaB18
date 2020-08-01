package day26_MethodOverloading;

import java.util.Arrays;

public class Method_OveroadingTwo {
    /*
    sum of two numbers
    sum of three numbers
    sum of four numbers
     */
    public static void main(String[] args) {
        sum2numbers(10,15);
        sum3numbers(10,15,20);
        sum4numbers(10,15,20,25);

        sum(4,6);
        sum(2,3,4);
        sum(2,5,6,1);

        int[] arr1={3,2,1};
        char[] arr2={'z','s','a'};
        double[] arr3={7,3,6,4,20.6};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);// same method name, different
    }

    public  static void sum2numbers(int a,int b){
        System.out.println(a+b);
    }
    public  static  void sum3numbers(int a,int b,int c){
        System.out.println(a+b+c);

    }
    public  static  void sum4numbers(int a,int b,int c,int d){
        System.out.println(a+b+c+d);

    }

    //==============================================================

    public  static  void sum(int a,int b){
        System.out.println(a+b);

    }
    public  static  void sum(int a,int b,int c){
        System.out.println(a+b+c);

    }
    public  static  void sum(int a,int b,int c,int d){
        System.out.println(a+b+c+d);

    }

}
