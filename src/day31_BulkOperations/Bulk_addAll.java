package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_addAll {
    public static void main(String[] args) {

        ArrayList<Integer> list1=new ArrayList<>();

        //add 10,20,30,40,50,35,200
      /*  list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);    //It is not efficient way,
        list1.add(35);
        list1.add(200);*/
      list1.addAll(Arrays.asList(10,20,30,40,50,35,200));
      Integer[] arr1={10,20,30,40,50,35,200};

      int[] arr2={10,20,30,40}; // arraylist doesnt support primitive

      list1.addAll(Arrays.asList(arr1));

        System.out.println(list1);


        System.out.println("================================");

        ArrayList<String>  list2=new ArrayList<>();

        String[] arr3={"Bekir","Duran","Karalar","Mehmet","Karalar"};
        //               0        1       2          3       4

        //arr3[5]="0sman"; it will give compile error

        list2.addAll(Arrays.asList(arr3)); // it return us colletiontype
        list2.add("Osman"); // if we give osman it will not be removed, java is casesensitive
        list2.remove("Duran");

        System.out.println(list2);

        System.out.println("===============================================");
        Integer[] numbers={1,2,3,4,5,6,7,8,9};

        ArrayList<Integer> numList =new ArrayList<>(Arrays.asList(numbers)); // we cannot use int arraylist because it will not accept

        System.out.println(numList);










    }

}
