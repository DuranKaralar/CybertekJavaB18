package day50_Polymorphism;

import javafx.scene.AmbientLight;

public final class Cat extends Animal { //3 variables with catName
    //2 methods with eat and sleep and 3rd one is scratch
  public   String catName;

  public Cat(String catName,String gender, int age){
      this.catName=catName;
      this.age=age;
      this.gender=gender;
  }

    public void scratch(){
        System.out.println("Cat "+catName+" is scracting");
    }
    @Override
    public void eat(){
        System.out.println("Cat "+catName+" is eating");
    }
    @Override
    public void sleep(){
        System.out.println("Cat "+catName+" is eating");
    }

    /*
    if we dont want to override scracth class we can make  method static and
    also we can make final and also we can make class final
     */

}
