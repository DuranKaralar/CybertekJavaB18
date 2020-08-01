package day16_ForLoop;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

      /*
        /*
        write a program to identify if a sting is palindrome
        level ==> level ==> palindrome
        if yes =true
        otherwise =false
         */

        String input=scan.nextLine();
        int a=input.length()-1;
        String result="";

        for (int b=input.length()-1;b>=0;b--){
            result +=""+input.charAt(b);


        }




        if(input.equals(result)){
            System.out.println("polindrime");
        }else{
            System.out.println("not polindrime");
        }
        System.out.println("");

        boolean palindrome=input.equalsIgnoreCase(result);
        result=result.toUpperCase();
        System.out.println(result);
        System.out.println(palindrome);




    }
}
