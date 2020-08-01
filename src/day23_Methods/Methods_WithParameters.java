package day23_Methods;

import java.util.Scanner;

public class Methods_WithParameters {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a age");
        int age=scan.nextInt();
        ElgibletoBuyAlcohol(age);
    }
    public static void ElgibletoBuyAlcohol(int age){
        if(age>=21){
            System.out.println("Eligible to buy alcohol");
        }else {
            System.out.println("Eligible to buy milk");
        }

        //create a function that can reverse any string

    }
}
