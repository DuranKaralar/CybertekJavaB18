package day34_CustomClass;

public class Dog {

    String breed;
    String size;
    String name;
    String color;
    int age;

    public void eating(String food){
        System.out.println(name+" is eating "+food);
    }
    public void drinking(String drink){
        System.out.println(name+ " is drinking "+drink);
    }
    public void sleeping(){
        System.out.println(name+ " is sleeping.");
    }
    public void playing(String toy){
        System.out.println(name +" is playing with "+toy);
    }

    public  void setDogInfo(String breed, String size,String color,String Dogname,int age){
        this.breed =breed;
        this.size=size;
        this.color=color;
        name=Dogname;
        this.age=age;

    }
    public String toString(){
        return "Dog Name: "+name+" Dog size: "+size+" Dog color: "+color+" Breed is: "+breed+ "Dog age is: "+age;
    }


}
