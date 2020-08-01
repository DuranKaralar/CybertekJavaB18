package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz {
    /*
    1.write a program that can remove all the special characters from a list of Character
    2.write a program that can remove all the numbers that can divisible by 3 or 5 in ArrayList
     */
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>(Arrays.asList("Robb","Bran","Rick","Bran"));

        if(names.remove("Bran")){ // robb rick bran
            names.remove("Ali"); // //robb  rick bran
        }
        System.out.println(names);// robb rick bran

        //BREAK STATEMENT EXIST THE LOOP(for loop)




    }
}
