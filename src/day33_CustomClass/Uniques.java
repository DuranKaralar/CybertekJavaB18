package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniques {
    public static void main(String[] args) {
         /*
          if the frequency of the object is greater than one, it remove all of the duplicated ones
          */
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,4,5,5));

        list.removeIf(p-> Collections.frequency(list,p )>1); // if the frequency of the object is greater than one, it remove all of the duplicated ones
        System.out.println(list);







    }

}
