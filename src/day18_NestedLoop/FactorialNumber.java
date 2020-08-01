package day18_NestedLoop;

import java.util.Scanner;

/*
2. write a program that can retunr the factorial number of any given number
			Ex:
				input: 5
				output: 120
 */
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a number");
        int num=scan.nextInt();
        int sum=1;

        while(num>=1){
            sum *=num;

            num--;
    }
        System.out.println(sum);







    }
}
