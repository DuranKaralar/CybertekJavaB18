package day19_Arrays;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        // write a program that asks "enter a name" 10 times, and store each of the names in the array students


        Scanner scan=new Scanner(System.in);
        String []names=new String[10];
        int i=0;

        while (i <= 9) {

            System.out.println("Enter a name");
            String name = scan.nextLine();
            names[i] = name;


            i++;

        }

        System.out.println(names[1]);






    }
}
