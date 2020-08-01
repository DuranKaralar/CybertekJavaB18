package day13_StringClass;
/*
Assignment:
            write me a programk that asks the user fiurt and last names, then prints the initials.
            ex:
                input:
                    cybertek
                    school
                output:
                    CS
         */

import java.util.Scanner;

public class Assignmnet {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first name");
        String firstname=scan.next();

        System.out.println("Enter lastname");
        String lastname=scan.next();

        String firstinitial=firstname.substring(0,1);
        firstinitial=firstinitial.toUpperCase();

        String lastinitial=lastname.substring(0,1);
        lastinitial=lastinitial.toUpperCase();

        String initials=firstinitial+lastinitial;
        System.out.println(initials);






    }
}
