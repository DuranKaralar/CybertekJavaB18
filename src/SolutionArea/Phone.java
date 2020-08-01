package SolutionArea;

import day37_Constructors.InstanceBlock;


import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.Arrays;


class A{
    protected void  b1A(){
        System.out.println(1);
    }
}

class B extends A{
    public void b1A(){
        System.out.println(2);
    }
}
public class Phone {
    public static void main(String[] args) {
        A n=new B();
        n.b1A();


    }


}
