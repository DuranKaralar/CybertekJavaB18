package day42_Inheritance;

import org.omg.CORBA.PUBLIC_MEMBER;

class B{
    public B (int a){
        System.out.println("int");
    }
    public B(double a){
        System.out.println("double");
    }
    public B(long a){
        this(12);// int 
        System.out.println("long");
    }
}
public class InheritanceReviews extends B {
    public InheritanceReviews(String a){
        super(19l);//int when I added it is long number
        System.out.println("String"); //string
    }

    public static void main(String[] args) {
        InheritanceReviews obj=new InheritanceReviews("Hello");

    }

}
