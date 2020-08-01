package day18_NestedLoop;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        /* Assignment

        write a program for the room reservation:

        King Bed ==>120$
        Queen Bed ==>100$
        Single Bed ==>80$
             should ask which bedroom do you wanna reverse
             if user provided invalid entry=> please re-enter

             calculate the total price

             do you want to reverse another room:
             if yes ==> repeat the previous steps
             if no ==> your total price is: $$$

             if answer either yes or no ==>

         */
        Scanner scan=new Scanner(System.in);
        for(int i=1;i<2;) {
            System.out.println("Enter your room type");
            String roomtype = scan.nextLine();
            if ((roomtype.equalsIgnoreCase("King bed") || roomtype.equalsIgnoreCase("Queen Bed") ||
                    roomtype.equalsIgnoreCase("Single Bed"))) {
            }
            System.out.println("Do you wanna reserve another room");
            String newroomtype = scan.nextLine();
            if (newroomtype.equalsIgnoreCase("no")) {
                if (roomtype.equalsIgnoreCase("King Bed")) {
                    System.out.println("Your total price is 120$");
                    break;
                } else if (roomtype.equalsIgnoreCase("Queen Bed")) {
                    System.out.println("Your total price is 100$");
                    break;
                } else if (roomtype.equalsIgnoreCase("Single Bed")) {
                    System.out.println("Your total price is 80$");
                    break;
                }


            } else if (newroomtype.equalsIgnoreCase("yes")) {
                    System.out.println("please re-enter");
                    roomtype = scan.nextLine();
                } else {
        System.out.println("Invalid entry- please re-enter");
        roomtype=scan.nextLine();

            }

        }














    }
}
