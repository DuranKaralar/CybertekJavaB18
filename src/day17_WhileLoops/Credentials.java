package day17_WhileLoops;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class Credentials {
    /*
    username: cybertek
    pass:cybertek123
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter username");
        String username = scan.next();

        System.out.println("Enter Password");
        String password = scan.next();
        boolean valid = (username.equals("cybertek") && password.equals("cybertek123"));//false
        //validating the first username and password

        int count=1;

        while (!valid) {// we cann give in while main body only the thigs that we want them to enter
            System.out.println("Please re-enter your credentials");
            System.out.println("Enter user name");
            username = scan.next();

            System.out.println("Enter Password");
            password = scan.next();
            valid = (username.equals("cybertek") && password.equals("cybertek123"));
            // validatinf username and password

            // if(username.equals("cybertek")&&password.equals("cybertek123")){
            //
            //   break;
            count++;

            if(count==3&&!valid){//already have three attempts and credentials are still invalid
                System.out.println("Your account is blocked");
                break;
            }

        }
        System.out.println("Logged in");

        if(valid){
            System.out.println("Logged in");
        }











    }
}
