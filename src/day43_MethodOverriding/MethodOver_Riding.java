package day43_MethodOverriding;

class Test{
    public void method(){
        System.out.println("Onur");
    }
}

public class MethodOver_Riding extends Test{
    @Override //if this is applicaple it is overridin
    public void method(){
        System.out.println("Zarina");
    }

    public static void main(String[] args) {
        Test obj1=new Test();
        obj1.method();//Onur

        MethodOver_Riding obj2=new MethodOver_Riding();
        obj2.method(); //Zarina
       // obj2.super();
    }





}
