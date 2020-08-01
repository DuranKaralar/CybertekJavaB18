package day48_Abstraction;

public class IPhone extends Phone {

    static {
        brand="Iphone";
    }

    public IPhone(String model,double price,String size){

        this.model=model;
        this.size=size;
        this.price=price;
    }

    public  void faceTiming(long phoneNumber){
        System.out.println("Iphone is having facetime with "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Iphone is having call with"+phoneNumber);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Iphone is texting with"+phoneNumber);
    }
}
