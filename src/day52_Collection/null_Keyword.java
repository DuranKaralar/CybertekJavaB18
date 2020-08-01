package day52_Collection;

import java.util.ArrayList;

public class null_Keyword {

    static String str="Cybertek";

    public static void main(String[] args) {
        System.out.println(str.charAt(0));
      //  System.out.println(list1.get(i));

        String str2=null;
        Integer i1=null;
       // int num=null;

        ArrayList<String> list1=new ArrayList<>();
        list1.add(null);

        System.out.println(list1);

        System.out.println("=======================");
      //  String number=null; NumberFormatException
        String number="123";
        int num1=Integer.parseInt(number);
        System.out.println(num1);

        System.out.println("==============");
     String[] arr={null,"Cybertek","ABC"};
     arr[2].toUpperCase();  // NullPointerException becayse null is not refer to any object [null]

        String name1="cybertek".toUpperCase();
        name1=null;
      //  name1=name1.toUpperCase();  //NullPointerException it doesnt referce to any object
        System.out.println(name1);

        //we have utility class called Collections



    }

}
