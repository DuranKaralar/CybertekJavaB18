package day46_final_abstract;

public  class Circle extends Shape {
    // we have to add abstract keyword in subclass because
    /*
    we cannot use abstract class in regular class so that if we
    cannot form a abstract method . it can not be exist in
    regular class. we need to provide
     */

    // whenever regular class is subclass of abstract class
    /*
    we have to override it abstract.
    how we override we shouldnt give absrract while overriding needs
    to be same or more seenable

   but we shouldt use abstract in class method place
   we need to give out abstract keyword in subclass
   whike we are overriding, we need to use more seenable ones

     */
    public Circle(double radius){
        this.radius=radius;
    }
    public double radius;
    public final static double PI= 3.14;

      @Override
     void area() {
          double area=radius*radius*PI;
          System.out.println("Area is: "+area);

      }

}
