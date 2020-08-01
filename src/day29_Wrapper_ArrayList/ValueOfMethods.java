package day29_Wrapper_ArrayList;

import javax.jws.soap.SOAPBinding;
import java.util.Arrays;

public class ValueOfMethods {
    public static void main(String[] args) {

        String str="123";
        Integer a=Integer.valueOf(str); // Integer, repper class , 123
        System.out.println(a);
     byte c=10;
        // Integer b=c; // Integer only accepts its own type

     double b=Integer.valueOf(str); //Unboxing

     //double = Integer
        System.out.println(b);

        String str2="15.5";
       double d1= Double.valueOf(str2);
        System.out.println(d1);
        // double = double // none
        double d2=Double.parseDouble(str2);
        // double =Double // Unboxing
        System.out.println(d2);

        System.out.println(d1==d2); //true

        System.out.println("=========================");
        int z1=2000;
        //Long l1=z1; doesnt accept any other primitives except for

        String r1="true";
        Boolean b1=Boolean.valueOf(r1);
           // Boolean == Bollean none
        boolean b2=Boolean.valueOf(r1);
          //boolean =Boolean unboxing

        System.out.println("============================");

        int maxNum = Integer.MAX_VALUE;
        System.out.println(maxNum);

        double maximum=Double.MAX_VALUE;
        System.out.println(maximum);

        int minNum=Integer.MIN_VALUE;

        System.out.println("====================================");

        boolean[] arr=new boolean[3];
        System.out.println(Arrays.toString(arr));

        Integer[] arr2=new  Integer[3];
        System.out.println(Arrays.toString(arr2)); // all of the repper class default values are nulll


    }

}
