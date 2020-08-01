package day47_Abstraction;

class Test1{
    public  Test1(){}
    public void  method1(){ }
    public static void method2(){}
   // public abstract void method3(); // we cannot have abstract method in abstract method
    // we can have everything else
    static int ali=1;// we can have static and instance variable and we can have instance block and
    // static block we can have all of them  ..... but we cannot have abstract in regular class
    {

    }
    static {

    }
    //regular class can be final
}


abstract class Test2{
    public Test2(){}
    public void method1(){ }
    public abstract void method2();
  //  abstract  class can have everyting like regular class plus abstract method
  {
   //   Test2 obj = new Test2() {}
  }
  static {

  }

  /*
  abstract class do not let you create object
  abstract class cannot be final
   */
}
public class Abstract_VS_NonAbstract {
}

/*
abstract class we can have all of them

 */
