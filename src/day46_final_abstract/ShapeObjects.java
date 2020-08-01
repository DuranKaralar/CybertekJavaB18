package day46_final_abstract;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle obj=new Circle(3.4);// we are getting compile error
        // object must be created with existing class so that
        // we need to add radius

        obj.area();

        System.out.println("=========");
        Square obj2=new Square(4);
        obj2.area();

        System.out.println("==========");
        Rectangle obj3=new Rectangle(2,4);
        obj3.area();

        System.out.println("==========");
        Triangle obj4=new Triangle(2,4);
        obj4.area();




    }

}
