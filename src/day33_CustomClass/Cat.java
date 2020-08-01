package day33_CustomClass;

public class Cat {

    String breed;
    String color;
    int age;
    String name;

    public void sleep(){
        System.out.println(name+" is sleepy");
    }

    public void eat(String catfood){
        System.out.println(name +" is eating "+catfood);
    }
    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }
    public void setCatInfo(String catBreed,String catColor,String catName,int catage){
        breed =catBreed;
        color=catColor;
        age=catage;
        name=catName;
        
    }

    public String toString(){
        return name+", breed is  "+ breed+", color is "+color+" age is "+age;
    }




}
