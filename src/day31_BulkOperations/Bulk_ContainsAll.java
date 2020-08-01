package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_ContainsAll {
    public static void main(String[] args) {


        ArrayList<Integer> list1 = new ArrayList<>();

    list1.add(10);
    list1.add(20);
    list1.add(30);
    list1.add(40);
    list1.add(50);


    boolean r1=list1.contains(10);
    boolean r2=list1.contains(20); //true;
         boolean r3=list1.contains(60); //false

    boolean resul2=list1.containsAll(Arrays.asList(10,20,30)); //true line order is not important
        Integer[] arr={20,10,30};
        boolean result3=list1.contains(arr); //true
        System.out.println(result3);




    }

}
