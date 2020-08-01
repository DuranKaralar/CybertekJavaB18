package day52_Collection;

import java.util.*;

public class Collections_Utility {

    public static void main(String[] args) {

        List<Integer> list1=new ArrayList<>();
        list1.addAll(Arrays.asList(10,9,7,6,5,4,3,2,1));

        System.out.println(list1);

        Collections.sort(list1);

        System.out.println(list1);


        System.out.println("======================");
        /*
        1.Write a program that can remove the duplicates and print out ascending order
         */
        ArrayList<Integer> nums1=new ArrayList<>();
        nums1.addAll(Arrays.asList(5,5,5,1,2,1,3,4,6,6));

        nums1=new ArrayList<>(new TreeSet<>(nums1));
       /* // this is also working TreeSet<Integer> nums2=new TreeSet<>(nums1);
       // nums2.addAll(nums1);

        //nums1=new ArrayList<>(nums2);           THIS WORKS WITH EVERYTHING
       // System.out.println(nums2);
*/
        System.out.println(nums1);

        System.out.println("==================");
        //write  aprogram that can removed the duplicates from an arraylist.Do not change the order

     ArrayList<Integer> nums2=new ArrayList<>(Arrays.asList(5,5,6,6,1,1,2,2,2,4));
     nums2 = new ArrayList<>(new LinkedHashSet<>(nums2));
        System.out.println(nums2);

        System.out.println("==============");
        ArrayList<String> letters=new ArrayList<>();
        letters.addAll(Arrays.asList("A","A","B","C","B","D"));

      boolean result =  Collections.frequency(letters,"A")==1;
        System.out.println(result); //false
        boolean result2 =  Collections.frequency(letters,"C")==1;
        System.out.println(result2);

  /*
  1. Write a program that can remove the duplicated characters from String
  2.write  a program that contains if two Strings are build of the same letters
   */

        String str="ABABABCDEEFF"; //"A","B","C","D","E","F"
        String[] array= str.split("");
        str="";
       String str2=new LinkedHashSet<>(Arrays.asList(array)).toString().replace(", ","");
       for( String each :new LinkedHashSet<>(Arrays.asList(array))){
           str +=each;
        }

        System.out.println(str);
        System.out.println(str2);

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




    }

}
