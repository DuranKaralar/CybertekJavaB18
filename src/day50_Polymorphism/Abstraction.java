package day50_Polymorphism;

import day29_Wrapper_ArrayList.ValueOfMethods;

interface  I{
    void method2();
    public void method3();

    //public I(){ }

   // public void m(){}

    //   {

   // }

  //  static {

   // }

}

abstract class A{
    public  abstract void method1();
   protected abstract void method();

    {

    }
    static {

    }
}

public class Abstraction extends A implements I{

        /*
        hiding the implementation details
        concentrating on essentials importance without worrying the details


       ChromeDriver implements WebDriver:
       get(); opens from chrome
       quit();closes chrome only

       FireFoxDriver implements WebDriver:
       get();opens from firefox
       quit();closes firefox only

       OperaDriver implements WebDriver;
       get();opens from opera
       quit();closes Opera only

         WebDriver:get();  by declaring them abstract: abstract means without the body
                   quit(); it is  abstract methods are obligatory to hide we use inheritance and implements is keyword


                abstract method meant to be override
                to give a different implementation we cannot override final, static, private
                2 ways of achieving of abstraction
                1.abstract class: use abstract keyword
                is not concrete, cannot create object
                meant to be the super class meant to be inherited
                abstract class cannot be final

                2.interface
                we can implement multiple interfaces to a class, class cannot be final
                everything has public access modifier
                we can only have variables
                                          by default they are static and variable
                                          we can only have abstract method, static metpd and default method
                                          we cannot have constroctur and instance variables, instance methods
                                          we cannot use block


                                          there is two kinds of block
                                          instance block and static block they are used in order to initialize it
                                          but when  static and final variables dont need to use blocks

                                          we cannot create object because we cant call constructor

                why do we need abstract class?
                there is 2 things interface cannot
                abstract class we can everything plus the abstract class with abstract

         */


   //  public abstract void method1();
//in the method overriding return type name must be same but not in overloading

@Override
public void method1(){

}
@Override
protected void method(){

}

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }

    

}



