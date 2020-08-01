package day36_StaticBlock;

public class StaticBlock {
    public static void method1(){
        System.out.println("Method");
    }

    public static void main(String[] args) {
        System.out.println("Main Method is executed");
    }

    static {
        System.out.println("Static Block is executed"); // sttaic executed first and just one
    }

}
