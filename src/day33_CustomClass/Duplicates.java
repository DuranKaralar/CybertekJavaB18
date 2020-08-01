package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,3,4,4,5,6));

        list.removeIf(p-> Collections.frequency(list,p) ==1);

        System.out.println(list);



    }

}
