package day46_final_abstract;

public class Triangle extends Shape {

    public int b;
    public  int h;

    public Triangle(int b,int h){
        this.b=b;
        this.h=h;
    }

  public   void area(){
        double area=(b*h)*1/2;
        System.out.println("Area of Triangle is: "+area);
    }
}
