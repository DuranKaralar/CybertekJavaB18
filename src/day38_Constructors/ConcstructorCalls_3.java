package day38_Constructors;

public class ConcstructorCalls_3 {

    public ConcstructorCalls_3() {
        //  this(9);// int argument
        System.out.println("default");
        // this(9); it must be at the first step
    }

    public ConcstructorCalls_3(int a) {
        System.out.println("int argument");
    }

    public ConcstructorCalls_3(String str) {

    }

    public static void main(String[] args) {
        new ConcstructorCalls_3();
    }


    public void method1(){
    //   this(); only constructor can call constrocter
    }


}
