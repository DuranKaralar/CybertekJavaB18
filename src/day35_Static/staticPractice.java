package day35_Static;

import java.util.Scanner;

public class staticPractice {

    //when to use static variable instead of instance

    static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {

        //Scanner scan= new Scanner(System.in);


        /*
        we declared the Scanner class outside the main class so that we dont need it main class because we have it
         */


        System.out.println("Enter num1");
        int num1=scan.nextInt();
        System.out.println("Enter num2");
        int num2=scan.nextInt();

        System.out.println("Sum is:"+(num1+num2));

    }

    public void method1(){
       // Scanner scan=new Scanner(System.in);
        System.out.println("Enter num1");
        int num1=scan.nextInt();
        System.out.println("Enter num2");
        int num2=scan.nextInt();

        System.out.println("Multiplication is:"+(num1*num2));

    }



}
