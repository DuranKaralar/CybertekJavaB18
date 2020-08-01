package day51_Recap;
/*
 5. create a final class named Cylinder that can inherit from Shape, Volume, and PI
                variables: radius, Height
                set a static block that initialize the name to "Circle"
                set a constructor that can initialize the radius and height
 */
public class Cylinder extends Shape implements Volume,PI{
 //so far we have 5 variables
   public String name="Cylinder";
    double radius;
    double Height;

    public Cylinder(double radius,double Height,String name){
        this.Height=Height;
        this.radius=radius;
        this.name=name;
    }

   /* static {
        name="Cylinder";
    }*/


    @Override
    public double calculateArea() {
        return (PI*2*radius*radius)+(Height*PI*radius*2);
    }

    @Override
    public double calculatePerimeter() {
        return 2*(PI*2*radius*Height);
    }

    @Override
    public double caculateVolume() {
        return PI*radius*radius*Height;
    }
}
