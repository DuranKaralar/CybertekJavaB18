package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

       int max= Collections.max(list);
        System.out.println(max);

        int min=Collections.min(list);
        System.out.println(min);

        /*
        1.write a program that can return the second maximum number from Arraylist
        ex 1,1,2,3,4,5,,6,7,8,8
        output should be 7 and minumum second 2
         */
        System.out.println("===============================================");
        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(1,1,2,3,4,4));
        /*
        SECOND MAX:3 SECOND MİN :2
         */
        Integer maxNum=Collections.max(numbers); // 4

        numbers.removeAll(Arrays.asList(maxNum));

        System.out.println(numbers);

        int secondMax=Collections.max(numbers);


        System.out.println(secondMax);

        System.out.println("==================================");
        ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(1,1,2,3,4,5,6,7,8));
        Integer minNUM=Collections.min(list2);

        list2.removeAll(Arrays.asList(minNUM));
        int secondMin=Collections.min(list2);
        System.out.println(secondMin);

        System.out.println("=================================");

        ArrayList<Integer> list3=new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5)); // change 0 and 4 index

        Collections.swap(list3,0,4); // we swapped it
        System.out.println(list3); // 5,2,3,4,1

        System.out.println("=====================");
        ArrayList<Integer> list4=new ArrayList<>(Arrays.asList(1,1,2,3,4,5,6));

        Collections.replaceAll(list4,1,10);
        System.out.println(list4); //10 10 2,3,4,5,6,7

        ArrayList<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("Omer","Omer", "Marry","Sha","Fatih","Omer"));
/*
        names.set(0,"Irına");
        names.set(1,"Irına");
        names.set(5,"Irına");
*/
      Collections.replaceAll(names,"Omer","Irına");

        System.out.println(names);//Irına, Irına, Marry, Sha, Fatih, Irına






    }

}
