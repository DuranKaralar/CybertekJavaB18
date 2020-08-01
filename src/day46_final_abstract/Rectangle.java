package day46_final_abstract;

public class Rectangle extends Shape {

    public int a;
    public int b;

    public Rectangle(int a,int b){
        this.b=b;
        this.a=a;
    }


    public void area(){
        double area=a*b;
        System.out.println("Area of the Rectangle is: "+area);
    }
}
