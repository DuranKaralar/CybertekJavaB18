package Practice_04_22_2020;

public class method_Overloading {
    public static void main(String[] args) {
        //method1();
       int a= method1(10);//Hello Cybertek and then returns 10 if we dont assign it to int a it will only print Hello Cybertek
        System.out.println(a);
       // method1(10.0);
        //method1(1,2);
    }
    public static void method1(){
        System.out.println("Hello World");
    }
    public static int method1(int a){
        System.out.println("Hello Cybertek");
        return 10;
    }
    public static void method1(double a){
        System.out.println("Hello Bekir");
    }
    public static void method1(int a, int b){
        System.out.println("Hello Karalar");
    }



}
