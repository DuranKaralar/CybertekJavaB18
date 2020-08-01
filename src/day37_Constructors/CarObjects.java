package day37_Constructors;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CarObjects {

    public static void main(String[] args) {

        Car car1=new Car("Toyota","Corolla",2020,32999);

        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.price);

        Car car2=new Car("Mercedes","C300",2018,4500);
        System.out.println(car2);


    }

}
