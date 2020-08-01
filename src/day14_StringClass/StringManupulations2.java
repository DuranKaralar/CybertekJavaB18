package day14_StringClass;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class StringManupulations2 {
    public static void main(String[] args) {

        String str=""; // if there is at least space it is not empty

        boolean bool1=str.isEmpty();// true
        System.out.println(bool1);

        String username="";
        if(username.isEmpty()){
            System.out.println("Please provide the username first");
        }

        String s1="Cat";
        String s2=new String("Cat");
        // visible text are equel so that if we use equels();

        System.out.println(s1==s2);// false

        System.out.println(s1.equals(s2)); //true

        String z1="Tiger";
        String z2=new String("Tiger");
        String z3="Tiger";

        System.out.println(z1==z2);//false
        System.out.println(z2==z3);//false
        System.out.println(z1==z3);//true

        //EQUELS // java is case sensitive
        System.out.println(z1.equals(z2)); // true
        System.out.println(z2.equals(z3));//true
        System.out.println(z1.equals(z3));//true













    }
}
