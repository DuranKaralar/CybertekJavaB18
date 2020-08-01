package day14_StringClass;
/*
        userName:cybertek
        PassWord:cybertekschool
         */
import java.util.Scanner;
public class credential {
    public static void main(String[] args) {
        String ValidUsername="cybertek";
        String validPassWord="cybertekschool";

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter username");
        String username=scan.next();

        System.out.println("Enter password");
        String password=scan.next();

        String result="";

        if(password.equals(validPassWord)&&username.equals(ValidUsername)){
            result="it is logged";
        }else{
            result=(password.equals(validPassWord)==false &&username.equals(ValidUsername)==true)?"Password is wrong":(username.equals(ValidUsername)==false&&validPassWord.equals(password)==true)?"Username is wrong":"Both of them are wrong";
            //result="wrong information";

        }
        System.out.println(result);



    }
}
