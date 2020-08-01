package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Dog_Objects {
    public static void main(String[] args) {

        Dog dog1=new Dog();
        /*
        System.out.println(dog1.breed);// it give us null because we didnt assign value to breed
        /*
        dog1.breed="Husky";
        dog1.size="Small";
        dog1.color="White";
        dog1.name="Ghost";
        dog1.age=4;
        */
    /*    System.out.println(dog1.breed); //Husky
        System.out.println(dog1.size);
        System.out.println(dog1.color);
        System.out.println(dog1.name);
        System.out.println(dog1.age);
 */

        dog1.setDogInfo("Husky","Small","White","Ghost",4);

        // if we give same name such as NOT DOGBREED , if we give breed, breed will asign to itself so that it will not assign to attribute breed so that it give us null

       Dog dog2=new Dog();
       dog2.setDogInfo("Alabay","Extra Big","Black","Ajdar",7);

       Dog dog3=new Dog();
       dog3.setDogInfo("Poodle","Medium","Brown","Karabaş",2);

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        Dog dog4=new Dog();
        Dog dog5=new Dog();

        // if we dont have toString method it give us hashcode
        System.out.println("===================");
        ArrayList<Dog> puppies=new ArrayList<>();
        puppies.addAll(Arrays.asList(dog1,dog2,dog3));
        puppies.addAll(Arrays.asList(dog4,dog5));
    /*
     for(int i=0;i<puppies.size();i++){
        Dog eachdog= puppies.get(i);
         System.out.println(eachdog);
     }*/
        puppies.removeIf(p-> p.age>2);

        for(int i=0;i<puppies.size();i++){
            Dog eachdog= puppies.get(i);
            System.out.println(eachdog);

        }






    }

}
