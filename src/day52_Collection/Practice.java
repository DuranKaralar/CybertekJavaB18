package day52_Collection;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Practice {
    public static void main(String[] args) {
         /*
      1. Write a program that can remove the duplicated characters from String
      2.write  a program that contains if two Strings are build of the same letters
          */

        String str="ABABABCDEEFF"; //"A","B","C","D","E","F"
        String[] array= str.split("");
        str="";
        String s=new LinkedHashSet<>(Arrays.asList(array)).toString().replace(", ","");
        for( String each :new LinkedHashSet<>(Arrays.asList(array))){
            str +=each;
        }

        System.out.println(str);
        System.out.println(s);

     /*  String[] array= str.split("");
        System.out.println(Arrays.toString(array));

        LinkedHashSet<String> ls=new LinkedHashSet<>(Arrays.asList(array));
        System.out.println(ls);
        String result4="";

        for(String each2 :ls){
            result4 += each2;
        }

        System.out.println(result4);
        */

        System.out.println("=====================================");
        String str1="ababababa";
        String str2="bababababa";
     /*  String[] arr1= str1.split("");
       String[] arr2=str2.split("");

     TreeSet<String>  t1= new TreeSet<String>(Arrays.asList(arr1));
       TreeSet<String> t2= new TreeSet<String>(Arrays.asList(arr2));

        System.out.println(t1);
        System.out.println(t2);

        str1=t1.toString();
        str2=t2.toString();

        System.out.println(str1.equals(str2)); //true
       */
        str1=new TreeSet<>(Arrays.asList(str1.split(""))).toString();
        str2=new TreeSet<>(Arrays.asList(str2.split(""))).toString();

        System.out.println(str1.equals(str1));





    }
}
