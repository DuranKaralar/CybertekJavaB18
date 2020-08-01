package day50_Polymorphism;

public class Inheritance {
   //build super & sub class
   /*
   Supper Class:it is only giving, it cannot inherit anything from child. it doesnt mean that it is useless

   Sup Class : can inherit the variables and visible methods from super class(except constructor) from super class

   //for method overriding and polymorphisim inheritance is the pre condition
   we use extends key word

   method overriding must happen in subclass

   advantage of inheritance: less codes, reusable easy to maintain

   public and protected is visible in the package but when we use it in subclass we can use it always
   if our subclass is outside the package we cannot inherit default from super class because we need to
   use public or protected


      */

    public  int publicInt=100;
    protected  int protectedInt=200;
    int defaultInt=300;
    private int privateInt=400;

}

class Data extends Inheritance{
    public static void main(String[] args) {
        Data obj=new Data();//it means that it is inherited to data class
        System.out.println(obj.publicInt);
     //   System.out.println(obj.privateInt);  private is not inherited because

        System.out.println(obj.protectedInt);/*
        protected and public can be inherited from everywhere
        */
        System.out.println(obj.defaultInt);

    }
}


