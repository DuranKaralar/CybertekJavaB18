package day17_WhileLoops;
/*
        1. write a program that can ask the user "enter a number" five times and return the maximum number
        hint: you will nedd for loop and if statement
        2. write a program that can ask the user "enter a number" five times and return the minimum number
        hint: you will nedd for loop and if statement */
import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int MaxNumber= -2147483647;// any number the user provided will be greater than this number
        //first user entered variable will be initialized to MacNumber
        int Minnumber=2147483647;

        for(int i=1;i<=5;i++){
            System.out.println("Enter a number");
            int num=scan.nextInt();
            if(num>MaxNumber){// to compare each user input, and assign the maximum number to MaxNumber
                MaxNumber =num;
              if(num<Minnumber){
                  Minnumber =num;
              }
            }
        }

        System.out.println(MaxNumber);
        System.out.println(Minnumber);




    }
}
