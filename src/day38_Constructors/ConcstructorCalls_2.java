package day38_Constructors;

public class ConcstructorCalls_2 {

    public ConcstructorCalls_2(){
        System.out.println("Default Constructor");
    }

    public ConcstructorCalls_2(int a){
        this();
        System.out.println("Constructor with int argument");
    }

    public ConcstructorCalls_2(String str){
        //System.out.println(); constructor call maust be at the first step;in other way, it give us compile error
        this(10);
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {
        ConcstructorCalls_2 obj=new ConcstructorCalls_2("Hello");// Default constructor will be executed

    }

    public void method1(){
     // ConcstructorCalls_2();

        /*
        Constrıoctor only called by other constructor, we cannnot call it through other constructors
         */
    }

    {

    }

}
