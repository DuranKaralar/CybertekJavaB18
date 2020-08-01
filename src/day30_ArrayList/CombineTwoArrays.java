package day30_ArrayList;

import java.util.ArrayList;

public class CombineTwoArrays {
    /*
    5. write a program that can combine two String arrays into one arrayList
    		ex:
    			arr1 = {"A", "B", "C"};
    			arr2 = {"D", "E", "F", "G"};
    			list ==> {"A", "B", "C", "D", "E", "F", "G"}
     */
    public static void main(String[] args) {

        String[] arr1={"A","B","C"};
        String[] arr2={"D","E","F","G"};

        ArrayList<String> list=new ArrayList<>();

        for(int i=0;i<arr1.length;i++){
            String EachElement=arr1[i];
            list.add(EachElement);
        }
        for(String each :arr2){
            list.add(each);
        }
        System.out.println(list);



    }

}
