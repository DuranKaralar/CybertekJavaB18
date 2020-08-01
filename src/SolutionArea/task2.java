package SolutionArea;

import java.util.*;

public class task2 {

    static  String name=new String("Bekir");
    static ArrayList<Integer> list1;

    public static void main(String[] args) {

        System.out.println(name.charAt(0));
       // System.out.println(list1.size());  It give us NullPointerWxception


        String str2=null;
        Integer i1=null;
        //int num=  null type can not be cconverted to int

        HashSet<String> list1=new HashSet<>();  //ArrayList Accept null
        list1.add(null);

        System.out.println(list1);

        String number = "123";

        int num1 = Integer.parseInt(number);

        System.out.println(num1);





    }
}
