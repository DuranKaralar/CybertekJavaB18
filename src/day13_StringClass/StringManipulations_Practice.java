package day13_StringClass;

import java.util.Scanner;
/*
inout Xybertek sChooL
OUTPUT:Cybertek
       School
 */
public class StringManipulations_Practice {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your fullname");
        String fullname=scan.nextLine();// cybertek school

        String firstname=fullname.substring(0,fullname.indexOf(" "));
        String lastname=fullname.substring(fullname.indexOf(" ")+1);
        // if we do not give the ending index number. it will execute all of them

        firstname=firstname.substring(0,1).toUpperCase()+firstname.substring(1).toLowerCase();
        //
        lastname=lastname.substring(0,1).toUpperCase()+lastname.substring(1).toLowerCase();

        System.out.println("Your first name is "+firstname);
        System.out.println("Your last name is "+lastname);

        /*
        Assignment
        write me a proram that ask user first and last names then  prints the initiable
        input: cybertek
               school
        output:
               CS

         */



    }
}
