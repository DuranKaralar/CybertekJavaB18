package day39_AccessModifiers;

import javax.jws.soap.SOAPBinding;

public class CarObjects {

    public static void main(String[] args) {
        //new Constructor

    Car car1=new Car("Toyota");

        System.out.println(car1);

        Car car2=new Car("BMW","X6");
        System.out.println(car2);

    Car car3=new Car("Lexus","RX",2020);
        System.out.println(car3);

        Car car4=new Car("Doğan","SLX",1990,1200);
        System.out.println(car4);

    }

}
