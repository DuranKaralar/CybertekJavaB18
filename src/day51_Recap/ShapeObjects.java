package day51_Recap;

import java.util.ArrayList;
import java.util.Arrays;

/*
 6. create a class named ShapeObjects
                1. create two circle and two Cylinder' objects
                2. create an ArrayList that can contain  all those objects

 */
public class ShapeObjects {

    public static void main(String[] args) {

    Circle circle1=new Circle(2,"Circle"); // if we use constrocture we need to initalize the variables in constructor class
    Circle circle2=new Circle(5,"Circle");

    Cylinder cylinder1=new Cylinder(3,5,"Cylinder");
    Cylinder cylinder2=new Cylinder(3,5,"Cylinder");

  // it works but we will use ArrayList  Shape[] objects={circle1,circle2,cylinder1,cylinder2};

    //Arraylist is created for objects

        ArrayList<Shape> list=new ArrayList<>(Arrays.asList(circle1,circle2,cylinder1,cylinder2));

        Shape shape1=circle1; // this is upcasting implicitly outomatically

        Shape shape2=new Cylinder(3,6,"Cylinder");
        // it gives us to compile error because shape doesnt have radius variable shape2.radius;

        (    (Cylinder)shape2).caculateVolume(); // we did downcastig


        for(Shape eachShape : list ){
            System.out.println("Name of : "+eachShape.calculateArea() );
        }

        System.out.println("===============");
        double d=((Cylinder)list.get(3)).caculateVolume();
        System.out.println(d);


        ((Cylinder)list.get(1)).caculateVolume(); // circle cannot be referenced by cylinder and it give us exception

        Shape s1=new Circle(3,"kar");
        Circle s2=(Circle)s1;
        double cc=s2.radius;
      double da=  ( (Circle)s1).radius;

    }

}
