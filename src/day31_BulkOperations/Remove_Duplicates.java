package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Duplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3));
                                 //expected result 1,2,3
        ArrayList<Integer> result=new ArrayList<>();


        for(int i=0;i<list.size();i++){

        }

        for(Integer each : list){
            if(!result.contains(each)){
                result.add(each);
            }
        }
        System.out.println(result);
        System.out.println("==================");
        /*
        write a program that can remove duplicates from array of integer;
        do not use for each loop
         */
        Integer[] arr={1,1,2,2,3,3};

        ArrayList<Integer> nonDuplicates=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(!nonDuplicates.contains(arr[i])){
                nonDuplicates.add(arr[i]);
            }
        }
        System.out.println(nonDuplicates);





    }

}
