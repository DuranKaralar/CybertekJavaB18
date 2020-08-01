package day33_CustomClass;

public class CarObjects {


    public static void main(String[] args) {


        Car car1=new Car();
        car1.Brand ="BMW";
        car1.model="i8";
        car1.year =2020;
        car1.color="BLACK";



        System.out.println(car1.Brand); // if we dont assign value, it will give us null as a result
        //instrance variable are object variables, we can call them through the object name

        System.out.println(car1.model);
        System.out.println(car1.color);
        System.out.println(car1.year);

        car1.start();
        car1.drive();

        System.out.println("=============================");

        Car car2=new Car(); // they are different because we didnt assign anything

        car2.year=2000;
        car2.model="Corolla";
        car2.color="grey";
        car2.Brand="Toyota";

        System.out.println(car2.model);
        System.out.println(car2.color);
        System.out.println(car2.year);
        System.out.println(car2.Brand);

        car2.start();

        System.out.println("=======================");
        car1.getCarInfo();
        System.out.println("========================");
        car2.getCarInfo();

        System.out.println("=========================");
        Car car3=new Car();

        car3.model="C Class";
        car3.year=1980;
        car3.color="White";
        car3.Brand="Mercedes";

        car3.getCarInfo();

        String str="A";
        String str2="B";

        String[] arr={str,str2};

        Car[] cars={car1,car2,car3};

        cars[0].getCarInfo();
        cars[1].getCarInfo();
        cars[2].getCarInfo();

    }

}
