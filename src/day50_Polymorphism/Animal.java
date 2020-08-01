package day50_Polymorphism;

public abstract class Animal {

    public int age;
    public String gender;

    public void eat(){
        System.out.println("Animal is eating");
    }

    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    public static void methodA(){
        System.out.println("Animal");
    }//this is inherited to subclasses but we cannot override, so it will be called through reference class

}
