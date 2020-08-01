package day53_Iterator_Maps;

import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterating_Collection {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5));

        for(int i=0;i<list1.size();i++){
            if(list1.get(i)<4){
                list1.remove(i);
            }
        }
        System.out.println(list1);
        System.out.println("=================================");

        ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5));
        list2.removeIf(p-> p<4); // it is using the iterator interface internally
        System.out.println(list2);

        System.out.println("======================================================");
        ArrayList<Integer> list3=new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5));
       Iterator<Integer> it =list3.iterator();


     //  while (it.hasNext()) { }

        //System.out.println(it.next());
        while (it.hasNext()) {
           if( it.next()<4){
               it.remove();
           }
        }
        System.out.println(list3);

        System.out.println("=================================");
        ArrayList<Integer> list4=new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5));


        for(Iterator<Integer> I =list4.iterator();I.hasNext();){
              int num= I.next();
           if(num<4){
               I.remove();
           }
        }


    }
}
