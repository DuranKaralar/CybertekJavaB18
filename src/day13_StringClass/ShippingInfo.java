package day13_StringClass;
/*
2. write a program for the shipping info that, the program should ask:
					building number
					Street address (Assume it has more than one word)
					city name
					state name
					zip code
					full name of the person:
			and prints the ship to info in the following format:
			ex output:
					Ship To:  Jimmy joe
							  7925 Jones Branch Dr
							  MCLean, VA 22102

 */

import java.util.Scanner;

public class ShippingInfo {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter nuilding number");
        String buildingnumber=input.next();// if we decide to use nexetline after next or other nextint vs we need to use
        //input.nextLine in order to take out the enter that left in the scanner method
        input.nextLine();
        System.out.println("Enter Street adress"); //Between two nextline method there is no need to use input.nextLine();
        String streetAdress=input.nextLine();
        System.out.println("Enter City Name");
        String cityname=input.nextLine();
        System.out.println("Enter State Name");
        String stateName=input.nextLine();
        System.out.println("Enter zip code");
        int zipcode=input.nextInt();
        input.nextLine();
        System.out.println("Enter full name");
        String fullname=input.nextLine();

        String result="Ship to:    " +fullname +"\n \t\t"+buildingnumber+" "+
                streetAdress+"\n\t\t"+cityname+", "+stateName+" "+zipcode;

        System.out.println(result);


    }
}
