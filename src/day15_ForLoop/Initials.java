package day15_ForLoop;
/*
1. write a program that asks user's first and last name, then prints out the initials of the user
			Ex:
				input:
					cybertek
					batch12
				output:your initial is: CB

 */
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstname=scan.next();

        System.out.println("Enter your last name");
        String lastName =scan.next();

        String initials=firstname.substring(0,1)+lastName.substring(0,1);

        initials=initials.toUpperCase();

        System.out.println(initials);

        String initials2=""+firstname.charAt(0)+lastName.charAt(0);
        // if we use empty space while caring with two charat it returns us string

        initials2=initials2.toUpperCase();

        System.out.println(initials2);





    }
}
