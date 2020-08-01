package day38_Constructors;

public class ConcstructorCalls {

    public ConcstructorCalls(){
        method1();
        method2();
    }

    public ConcstructorCalls(int a){
      // ConcstructorCalls();

        this();
    }

    public  static  void method1(){
       // method2(); static only calls statics
        //ConcstructorCalls();
    }

    public void method2(){
        method1();
    }

}
