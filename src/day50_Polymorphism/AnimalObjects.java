package day50_Polymorphism;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Lucy","Female",5);
        System.out.println(dog1.dogName);
        dog1.bark();
        dog1.methodA();

        Animal dog2 = new Dog("Kito","Female",6);
        //System.out.println(dog2.dogName); we cannot call dogname
        //dog2.bark we cannot call them, it give us compile error
        //reason of giving error is because of reference name (Animal)

        //dogname and bark is not placing in animal class
        // we can call the objecrs and methods which are in Animal class

        dog2.eat(); //it was overriden so that it will call the eat method that is overriden in dog class
        //if it was not overriden, eat method would be come from Animal class


        Cat animal10=new Cat("A","F",3);
        if(animal10 instanceof Animal){
            System.out.println("A");
        }else{
            System.out.println("B");
        }

        /*
        in order to use instanceof, there should be ISA relation
        and we can call      animal instanceof Dog //it will compile but false
        but if we call animal like that Cat animal=new Cat();
        it will not let us use because ther is false

        Animal animal2=new Cat();
        animal2 instanceof Animal == true because we say, animal is animal
         */


    }

}
