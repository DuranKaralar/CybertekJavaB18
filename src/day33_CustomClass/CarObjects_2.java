package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects_2 {
    public static void main(String[] args) {


        Car car1 = new Car();
        car1.setCarInfo("BMW","X6",2020,"Blue");

        car1.getCarInfo();
        System.out.println("==========");
        Car car2=new Car();
        car2.setCarInfo("Murat","Hacı",1990,"Yellow");

        car2.getCarInfo();

        Car car3=new Car();
        car3.setCarInfo("Doğan","SLX",2000,"Green");
        car3.getCarInfo();

        System.out.println("===============================");
        Car[] arr={car1,car2,car3};

        for(int i=0;i<arr.length;i++){
            arr[i].getCarInfo();
        }

        for(Car each:arr){
            each.getCarInfo();
        }

        //System.out.println(car1);// it give us day33_CustomClass.Car@6e0be858
        ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println(list1); // toString methods gets executed automatically

        System.out.println(car1); //when we made to String method, it affects the here so that it let us to print info not hcode


    }

}
