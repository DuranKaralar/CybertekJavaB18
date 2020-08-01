package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_removeAll {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,3,3,3,3,3,4,5,6,7,8,9,8,1,3));
        //remove 1,3,5,8

        Integer a=1;
        list.remove(1);// it will remove the just first one not all 1's
        list.remove(1);//it removed the next 1

        Integer b=3;
        list.remove(b);//it remove the first object

        list.removeAll(Arrays.asList(3,1)); //any object which matching with aslist() will be removed

        Integer[] arr={1,3}; // if we use arr in asList() it is same

        System.out.println(list);

        System.out.println("===================================");


        String[] names={"Ahmed","John","Aaron","Ahmed","Daniel"};

        ArrayList<String> nameList=new ArrayList <>(Arrays.asList(names));

        nameList.removeAll(Arrays.asList("Ahmed"));//it will not for loop method, in the future we will learn something that help us to use it
        System.out.println(nameList);



    }
}
