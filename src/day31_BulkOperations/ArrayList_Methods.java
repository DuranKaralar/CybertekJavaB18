package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");
        list1.add("F");

        boolean r1=list1.contains("C");
        System.out.println(r1); //true

        ArrayList<String> list2=new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        list2.add("E");

        Collections.sort(list1); // list1 A B C D
        Collections.sort(list2); // List2 A B C D

        boolean r2=list1.equals(list2);

        System.out.println(r2); // false

        System.out.println("=======================");
        int[] arr1={1,2,3};
        int[] arr2={3,2,1};
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean r3=arr1.equals(arr2);
        System.out.println(r3); // false

        boolean r4=Arrays.equals(arr1,arr2);
        System.out.println(r4); //true

        System.out.println("======================");
        ArrayList<Integer> list3=new ArrayList<>();

        list3.add(10);
        list3.add(100);
        list3.add(1000);
        list3.add(20);

        //expected 1000 100 20 10

        Collections.sort(list3);
        System.out.println(list3);

        ArrayList<Integer> reeversedList=new ArrayList<>();
        for(int i=list3.size()-1;i>=0;i--){
            reeversedList.add(list3.get(i));
        }
        System.out.println(reeversedList);

        // list3=reversedList3;
        System.out.println(list3);

        System.out.println(list3.size()); //4

        list3.clear();// removes everything ,size:0

        boolean r5=list3.isEmpty();
        System.out.println(r5);//true



    }

}
