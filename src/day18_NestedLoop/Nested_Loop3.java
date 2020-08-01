package day18_NestedLoop;

import java.util.Scanner;

public class Nested_Loop3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while( true) {


            System.out.println("Enter two numbers");
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();

            System.out.println("Addition of two numbers: " + (num1 + num2));
            System.out.println("Do you want to continue");
            String answer=scan.next();

            while (!(answer.equalsIgnoreCase("Yes")||answer.equalsIgnoreCase("no"))){
                System.out.println("Invalid entry,please re-enter the two number");
                answer=scan.next();
            }

            if(answer.equalsIgnoreCase("NO")){
                System.out.println("Thank you for using the calculater");
                break;
            }

        }

        /*
        Assignment

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








    }
}
