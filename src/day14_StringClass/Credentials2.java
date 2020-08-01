package day14_StringClass;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class Credentials2 {
    public static void main(String[] args) {
        /*
       valid credentials are:
            username: cybertek
            password: cybertekschool
            precondition: username and password cannot be empty
            if they are empty==> please enter the credentials
        if user entered both valid username and password  ==> log in
        if valid password, invalid username ==> username is incorrect
        if valid user name, invalid password ==> password is incorrect
        if both password and username are invalied ==> invalid username and password

         */
        String ValidUsername="cybertek";
        String validPassWord="cybertekschool";

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter username");
        String username=scan.nextLine();

        System.out.println("Enter password");
        String password=scan.nextLine();

        boolean loggedin=(username.equals(ValidUsername)&&password.equals(validPassWord));
        // user enterred both valid
        boolean InvalidUsername=!username.equals("Cyberek")&&password.equals(validPassWord);
        boolean InvalidPassword=username.equals(ValidUsername) &&!password.equals(validPassWord);

        if(!username.isEmpty() &&!password.isEmpty()){// username and password are not empty
            if(loggedin){
                System.out.println("Logged in");
            }else if(InvalidUsername){
                System.out.println("Username is incorrect, password is correct");
            }else if (InvalidPassword){
                System.out.println("Username is correct, password is incorrect");
            }else{
                System.out.println("Both username and password is incorrect");
            }

        }else{
            System.out.println("Enter the credentials");
        }


    }
}