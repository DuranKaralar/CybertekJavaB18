package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Intro {
    public static void main(String[] args) {

        //ArrayList<DataType> listname=new ArrayList<DataType>();
        //          MANDATORY                        OPTIONAL

   ArrayList<Integer> scores=new ArrayList<Integer>();

   // WE cannot assign size to ArrayList, ArrayList is dynamic
        // add 5 elements size :5
        // add 3 elements size :8

        scores.add(10);//  Autoboxing   size : 1
        scores.add(20);//               size : 2
        scores.add(30);//               size : 3

        System.out.println(scores);

        Integer a1 = scores.get(2); //none
        int a2=scores.get(2);    //unboxing
        double a3=scores.get(2); //unboxing

        System.out.println(a1);

     //   System.out.println(scores.get(100)); // it is out of bound that means it gives us compile error




    }
}
