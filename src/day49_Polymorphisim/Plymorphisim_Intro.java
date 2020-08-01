package day49_Polymorphisim;

import day41_Inheritance.Animal;

class Animals extends Robot{

}
class  Dog extends Animals {

}
class Cat extends Animals{

}
class Robot{

}

public class Plymorphisim_Intro {
    public static void main(String[] args) {
       // Animal obj=new Animal();
        Animals obj2=new Dog();
        Animals Obj3=new Cat();

        Dog obj4=new Dog();
        Cat obj5=new Cat();

        Robot obj7=new Robot();

      Animals[] animalShow={obj2,Obj3,obj4,obj5,};

      Robot obj8=new Animals();
      Robot obj9=new Dog();
      Robot obj10=new Cat();

      Robot[] ROBTS={obj8,obj9,obj10};

    }
}
