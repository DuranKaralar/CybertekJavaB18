package day52_Collection;

import java.util.*;

public class Sets {

    public static void main(String[] args) {

       // Set<String> s=new Set<String>(); Erro

        Set<String> names=new LinkedHashSet<>();
        names.add("Sha");
        names.add("Zuura");
        names.add("Saban");
        names.add("Ozgur");
        names.add("Ozgur");     // sets only accepts one of them
        names.add("Ozgur");      //order is not in order
        names.add("Ozgur");


        System.out.println(names);
        String[] arr={"A","A","C","B","A"};

        LinkedHashSet<String> set1=new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(set1);


        System.out.println("===============");

        Set<Integer> numbers=new TreeSet<>(Arrays.asList(3,2,5,1,4,6,7,7,7));
        //first it will removes duplicates
        //next it will sort it;
        System.out.println(numbers);
        //TreeSet doesnt support null


        System.out.println("==============");

        TreeSet<String> treeset=new TreeSet<>();
        treeset.add(null); // it accept but give unchecked erroor

        System.out.println(treeset);// it give us null PointerException

        /*
        TreeSet doesnt support tree set
        TreeSet is the slowest, hashset is much more faster than TreeSet
         */




    }

}
