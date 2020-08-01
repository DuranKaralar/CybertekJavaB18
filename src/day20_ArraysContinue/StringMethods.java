package day20_ArraysContinue;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String name="Muhtar";
       char[] characters = name.toCharArray();

        System.out.println(Arrays.toString(characters));

        String str1="Cybertek School";
        String str2="School Cybertek";

        char[] array1=str1.toCharArray();
        char[] array2=str2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        
        boolean equalarray=Arrays.equals(array1,array2);
        System.out.println(equalarray);










    }
}
