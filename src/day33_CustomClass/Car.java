package day33_CustomClass;

public class Car {

    String Brand;
    String model;
    int year;
    String color;

    public void start(){
        System.out.println(Brand+ " is started");
    }

    public void drive(){
        System.out.println("Driving "+Brand+" "+model);
    }

    public void getCarInfo(){
        System.out.println("Brand of the car is "+Brand);
        System.out.println("Model of the car is "+model);
        System.out.println("Year of the car is  "+year);
        System.out.println("Color of the car is "+color);
    }

    public void setCarInfo(String carBrand, String carModel, int carYear,String color2){
        Brand =carBrand;
        year=carYear;
        color=color2;
        model=carModel;
    }

    public String toString(){
        String result=year +" "+Brand+" "+model+" "+color;
        return result;
    }

    public static void main(String[] args) {
        int a=100;  //local variable


    }

}
