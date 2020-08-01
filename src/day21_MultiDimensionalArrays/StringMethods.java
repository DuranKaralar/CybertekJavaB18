package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String name = "Java";  // 'J', 'a', 'v', 'a'

        char[] chars = name.toCharArray();  // 4

        System.out.println(chars[0]);  //'J'
        System.out.println(chars[3]); //'a'

        //  System.out.println(chars[4]);
        String str = "I like Java";

        String[] arr = str.split(" ");

        System.out.println( Arrays.toString(arr) );

        /*
        reverse sentence: day great is today
         */
        String sentence="Today is great day";

        String[] sen=sentence.split(" ");

        System.out.println(Arrays.toString(sen)); // today is great day
        String result="";

        for(int z=sen.length-1;z>=0;z--){
            String eachword = sen[z];
            // System.out.print(eachWords+" ");
            result += eachword+" ";

        }
        System.out.println(result);


        String str2 = "ABCD";
        String arr2[] =   str2.split("")  ;      //["A", "B", "C", "D"]
        char[] ch2 = str2.toCharArray(); //['A', 'B', 'C', 'D']

        System.out.println( Arrays.toString(arr2) );
        System.out.println( Arrays.toString(ch2));














    }
}
