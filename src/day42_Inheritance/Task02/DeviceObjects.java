package day42_Inheritance.Task02;

import javax.jws.soap.SOAPBinding;

public class DeviceObjects {

    public static void main(String[] args) {

        Tv tv1=new Tv("samsung","E250",500,"TV","40");

        System.out.println(tv1);

        Phone phone1=new Phone("Iphone","11",1000,"large");

        System.out.println(phone1);

    }

}
