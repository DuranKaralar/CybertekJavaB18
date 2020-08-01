package day46_final_abstract;

public class final_Practices {

    final int a=10;
    final static int b=20;


    {
        System.out.println(a);
      //  a=20;cannot be reassigned
    }

    static {
        System.out.println(b);
       // b=30; we cannot reassign
    }

    public  final_Practices(){
        // we cannot give final to Constructor
    }

    public final   void method1(){
        // we can use final keyword instance method can be final
    }

   final public static void method2(){
        // this method cannot be override
    }

    // while we are overloading we cannot give less access modifier becase it must be more reacable and
    // parameters must be different
    // return type can be different if it is int, it can be void or String
    // while we are overloading we can overload final keyword
   private final int method1(int a){
        return 100;
        // I dont know why but it is less reachable in here
   }

   public final static void method2(int a){

   }

}

class test extends final_Practices{
    // we cannot override method1 because it is final
    // but if it was not final, we can override it


    //protected void method1(){
        //
    //}
}
       /*
       access modifiers and keyword can be swith before the return type
       they cannot be after the return type
       it doesnt mean while a class that one not final one can be superclass to the  final 
       */