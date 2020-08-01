package day43_MethodOverriding;

import javax.jws.soap.SOAPBinding;

public class CarShop {
    public static void main(String[] args) {

        Tesla car1 = new Tesla();
        car1.start();

        System.out.println("==============");
        Honda car2=new Honda();
        car2.start();

        System.out.println("==============");
        Jeep car3=new Jeep();
        car3.start();

        System.out.println("============");
        BMW bmw=new BMW();
        bmw.start();

    }
}