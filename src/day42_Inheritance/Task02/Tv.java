package day42_Inheritance.Task02;

public class Tv extends Device {

    public Tv(String brand,String model,double price,String type,String size){
       setDevice(brand, model, price, "TV", size);

    }

    public void watch(){
        System.out.println("watching "+brand+" TV");
    }



}
