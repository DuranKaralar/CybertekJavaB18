package day52_Collection;

import java.util.*;

public class Lists {

    public static void main(String[] args) {

     //   List<String> list0 =new List<String>();


        List<Integer> list1=new ArrayList<>(); //Polymorphism
        list1.add(1);

        List<Integer> list2=new LinkedList<>();
        list2.add(10);
        list2.remove(0);

        System.out.println("===================");

        ArrayList<Integer> arrayList =new ArrayList<>();
        arrayList.add(10);

        Vector<Integer> vector=new Vector<>();
         vector.add(10);

         /*
         only difference betweeen them is action of vector is sycronist
         vector is sychronized
         what is synchronized , it can be applied to method or block
         scynronized: used for achieving thread safety
         thread:process of operating system schedulinng object
          */

        Stack<Integer> stack=new Stack<>();
        stack.add(20);//last in first out

        System.out.println("================================");
        Stack<String> names=new Stack<>();
        names.add("Sha");
        names.add("Dovran");
        names.add("Rahman;");
        names.add("Anna");
        names.add("Rustem");

        System.out.println(names);

        String k=names.pop();
        System.out.println(k);
        System.out.println(names);

    }

}
