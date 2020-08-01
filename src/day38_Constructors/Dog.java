package day38_Constructors;

public class Dog {

    String name;
    String breed;
    int age;

    public  Dog(){

        name="Unknown";
        breed="Unknown";
        age=0;

    }

    public Dog(String breed){
        this.breed=breed;
        name="Unknown";
        age=0;
    }

    public Dog(String breed,int age){
        this.breed=breed;
        name="Unknown";
        this.age=age;
    }

    public String toString(){
        return "Name: "+name+" Breed: "+breed+" Ages: "+age;
    }



    public void method1(){

    }
    public void method1(int a){

    }

}
