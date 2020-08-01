package day46_final_abstract;

public abstract class Shape {

    abstract void area();

    // it is giving error when we use it like that
    // two ways of achieving abstraction
    /*
    1. abstract class : we need to add abstract we need to
     write abstract to class information, we also have to use abstract in method
    in other case it will give us compile error
    2.Interface
     */


}

       /*
         abstract class  that means to be inhereted, final can not be inherited
         so that final class can not be abstract
         final-abstract in method and class can not be together
         and also abstract cannot be static and private methods too,

       */

       /*
       we can use abstract in subclass but we cannot use it in shapeObjects class
        can we give other than void in abstraction method
        we cannot create objects from abstract class
        */
