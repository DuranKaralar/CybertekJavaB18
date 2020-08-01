package day48_Abstraction;

abstract class T{

    //public default void method3(){

    //}
}

public interface DefaultMethod {

    default void method(){
        System.out.println("Default Method");
    }

    public static void main(String[] args)  {

    }

}
class N implements DefaultMethod{
    public static void main(String[] args) {
        N obj= new N();
        obj.method();
    }
}
