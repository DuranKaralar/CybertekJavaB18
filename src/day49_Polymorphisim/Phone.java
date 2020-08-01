package day49_Polymorphisim;
/*
    1. create an interface named Edible
            abstract method: eat();
    2. create an interface named Drinkable that can inherit from Edible
            abstract method: drink();
    3. create an class named Burger that can inherit from Edible
            variables: name, size
            method: toString();
            create a constructor that can initialize instance variables
    4. create another class called IceCoffee  that can inherit from Drinkable
                variable: size
                method: toString()
            create constructor that can set the size

 */
interface dowloadable{
    //boolean dowloadable; //it is final so that we need to initialize it
    boolean downloadable=true; //public final static
    void download();
}
interface  AndroidApps extends dowloadable{// 2 variable, 1 abstract clas
    String AppStoreName="Android";
}
interface AppleApps extends dowloadable{// 2 variable and 1 abstract method
    String AppstoreName="Apple Store";
}
//public abstract class Phone{

//}
public abstract class Phone {
  public static String brand;
  String model;
  double price;
  String size;



  public abstract void texting(long phoneNumber);
  public abstract void calling(long PhoneNumber);

  public String toString(){
      return "brand='"+brand+" model'"+model+" price="+price+" size="+size;
  }


}
