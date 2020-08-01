package day29_Wrapper_ArrayList;
import Resources.Library;

import java.util.ArrayList;
public class List_Practice2 {
    public static void main(String[] args) {
        /*

        create alist of Integers
        add 5 integers
        return the maximum number from List
        do not use any sorting

         */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(400);
        list.add(300);
        list.add(50);
        System.out.println(list.size()); // size is five
        Integer max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }

        }
        System.out.println(max);
        int maximum2 = Integer.MIN_VALUE;
        for (Integer each : list) {
            if (each > maximum2) {
                maximum2 = each;
            }
        }

        System.out.println(maximum2);

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(100);
        list2.add(300);
        list2.add(200);

        int a=max(list2);
        System.out.println(a);
       int b= Library.max(list2);
        System.out.println(b);

    }

    public static int max(ArrayList<Integer> list) {
        Integer max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }

        }
        return max;
    }
}