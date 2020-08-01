package day46_final_abstract;

public class Square extends Shape {

   public double side;

    public Square(double side){
        this.side=side;
    }
    @Override
    public void area(){
        double area=side*side;
        System.out.println("Area of Square is: "+area);
    }

    /*
    if we dont give extends and subclass when we call area from
    square we will get same result
    but we use because this  2 independent method
    we use 1 method different implementation
    we can use  overriding
    overriden is related with inheritance =extebds superclass
    1 just created 1 area method
    we have two implementation. if we call area from circlle ther will be
    just get the area of square
    we used to ignore implementation details
    shape is abstracrt,

    regardless

    we need to oveeride the regular subclass in other case it give us compile error


     */

}
