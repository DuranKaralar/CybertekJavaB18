package day26_MethodOverloading;

public class Method_Overloading    {
    public static void main(String[] args) {
        method(10);//original method
        method(10.0);//Overloaded method
    }
    public static void method(int a){
        System.out.println("Original method");

    }
    public static void method(double a){//double a
        System.out.println("Overloaded method");
    }

}
