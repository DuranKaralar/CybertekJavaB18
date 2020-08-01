package day42_Inheritance;

import org.jcp.xml.dsig.internal.dom.DOMUtils;

class A{
    int a=100;
    public A(double b){
        System.out.println(this.a);//100
    }
}

public class SuperKeyWord extends A {

    int a=200;
    public SuperKeyWord(){
        super(3.0);//100
        System.out.println(super.a); //100
    }

    public static void main(String[] args) {
       // SuperKeyWord obj=new SuperKeyWord(); 100 AND 100

        A obj2=new A(12); // Just One 100
    }

}
