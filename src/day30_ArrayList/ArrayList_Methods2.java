package day30_ArrayList;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;

public class ArrayList_Methods2 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();

        list.add("A"); //0
        list.add("B"); //1
        list.add("C"); //2

        list.remove(1);

        boolean r1=list.remove("F");//FALSE
        boolean r2=list.remove("A");//TRUE

        System.out.println(list);
        System.out.println(r1);
        System.out.println(r2);

        list.clear(); // []
        System.out.println(list);
        System.out.println(list.size());

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(1);//0
        list2.add(1);
        list2.add(3);
        list2.add(4);// 3

        int num=list2.indexOf(1); //0
        // Integer =int // Autoboxing

        System.out.println(num);

        int num2=list2.indexOf(100); // it give us -1 when there is no other thing
        System.out.println(num2);

        int num3=list2.indexOf(3);//2
        System.out.println(num3);










    }


}
