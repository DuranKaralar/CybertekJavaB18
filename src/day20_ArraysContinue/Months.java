package day20_ArraysContinue;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        String[] months={"Jan", "Feb", "Mar", "Apr","May","Jun","July","Aug","Sep","Oct","Nov","Dec"};
        //String[] months2=new String[12];
        //months2[0]="Jan";

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=scan.nextInt();

        int attempts=0;
        while(number>12||number<0){
            System.out.println("Invalid Entry");
           // System.exit(0);
            System.out.println("Please re-enter the number");
            number=scan.nextInt();
            attempts++;
            if(attempts==2&&(number>12||number<0)){//THREE ATTEMPS İT STARTS WİTH ONE
                System.out.println("Invalid Entry");
                System.exit(0);
            }
        }

        String result ="";

            result=months[number - 1];
        System.out.println(result);






    }
}
