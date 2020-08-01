package day17_WhileLoops;

import java.util.Scanner;

public class While_Loop_Practice {
    public static void main(String[] args) {
        /*
        ask the user to enter yes or no.
        if the user enters other than yes or no,repeat the question
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Yes or No");
        String answer=scan.next();
        boolean valid=answer.equalsIgnoreCase("Yes")||answer.equalsIgnoreCase("No");

        while(!valid){// while the input is not  yes or no, it will enable user to re-enter
            System.out.println("Please Re-Enter");
            answer=scan.next();
            if(answer.equalsIgnoreCase("Yes")||answer.equalsIgnoreCase("No")){
                break;
            }
        }

        if(answer.equalsIgnoreCase("Yes")){
            System.out.println("Entered Yes");
        }
        if(answer.equalsIgnoreCase("No")){
            System.out.println("Entered No");
        }




    }
}
