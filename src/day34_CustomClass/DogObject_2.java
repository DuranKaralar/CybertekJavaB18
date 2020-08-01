package day34_CustomClass;

public class DogObject_2 {
    public static void main(String[] args) {
       Dog dog1=new Dog();
        dog1.setDogInfo("Husky","Small","White","Ghost",4);

        // if we give same name such as NOT DOGBREED , if we give breed, breed will asign to itself so that it will not assign to attribute breed so that it give us null

        Dog dog2=new Dog();
        dog2.setDogInfo("Alabay","Extra Big","Black","Ajdar",7);

        Dog dog3=new Dog();
        dog3.setDogInfo("Poodle","Medium","Brown","Karabaş",2);

        dog1.eating("chicken");

        String drink1="milk";
        String drink2="coffee";

        String food1="Chicken";
        String food2="Fish";

        String toy1="PS";
        String toy2="Piano";

        dog3.drinking(drink1);
        dog1.eating(food2);

        Dog dog4=new Dog();
        dog4.setDogInfo("Kurt","large","Kahverengi","Saldır",8);

        System.out.println("=======================");

        Dog[] arr={dog1,dog2,dog3,dog4};

        for(Dog each :arr ){
            each.eating(food1);
        }

        for(int i=0;i<arr.length;i++){
            arr[i].eating(food2);
        }

        for(Dog each2:arr){
            each2.drinking("water");
        }
        for(Dog each3:arr){
            each3.eating("döner");
        }


    }
}
