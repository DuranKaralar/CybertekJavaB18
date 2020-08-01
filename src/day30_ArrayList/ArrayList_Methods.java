package day30_ArrayList;


import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<Integer>  list1=new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        Integer  a=1;
        list1.remove(a);
        System.out.println(list1);

        list1.add(1,6);
        //list1.add(7,10); index out of bound

        list1.set(3,9);

        System.out.println(list1);

        ArrayList<String> list2=new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add(1,"C");
        list2.add(1,"D");   //List 2== A, D, C, B

        list2.set(3,"F"); // A, D, C, F
        list2.set(2,"E"); //A, D, E, F

        System.out.println("============================");

        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);




    }

}
