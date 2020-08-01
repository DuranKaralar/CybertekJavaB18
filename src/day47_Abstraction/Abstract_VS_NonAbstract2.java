package day47_Abstraction;

abstract class A{
    public abstract void method1();
    public void method2(){
    }
}



public class Abstract_VS_NonAbstract2 extends A {
    // if subclass is not abstract it is mandotory to override it
    //if subclass is abstract it is not mandotory to override it
    @Override
    public void method1(){

    }
    // we have two class in here because we got method 2 two

}

abstract class B extends A{
    //one abstract and one instance method we have in here
    // because it has super class that inherit the methods
    // we cannot create object classs in here
}

class C extends B{
    //0verride
    public void method1(){

    }
    /*
    we have also regular one 
     */

}
