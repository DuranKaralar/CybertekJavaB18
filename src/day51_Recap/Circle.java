package day51_Recap;

/*
 4. create a final class named circle that can inherit from Shape and PI
                variable: radius
                set a static block that initialize the name to "Circle"
                set a constructor that can initialize the radius

 */
public final class Circle extends Shape implements PI {
    /*
    we can use final for method we cannot overload and override
    we can use for class and variables
     */
     public String name="Circle";
    public double radius;
    public Circle(double radius, String name){
        this.radius=radius;
        this.name=name;
    }



    // We didnt initialize PI becauuse it is automatically initialized
    //if we implements from volume we need to override calculatevolume so that we didnt inherit it

    @Override
    public double calculateArea(){
    return radius*radius*PI;
    }
    @Override
    public double calculatePerimeter(){
     return 2*radius*PI;
    }




}
