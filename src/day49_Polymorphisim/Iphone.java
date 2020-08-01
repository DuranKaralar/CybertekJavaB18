package day49_Polymorphisim;

public class Iphone extends Phone implements AppleApps{

    static{
        brand="Apple";
    }

    public Iphone(String model,double price,String size) {
    this.model=model;
    this.price=price;
    this.size=size;
    }

    @Override
    public void download() {
        System.out.println("Iphone is dowloading apps from "+ AppstoreName);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Iphone is texting to "+phoneNumber);
    }

    @Override
    public void calling(long PhoneNumber) {
        System.out.println("Iphone is calling to "+PhoneNumber);
    }

    public void  faceTiming(long phoneNumber){
        System.out.println("Iphone is having faceTiming "+phoneNumber);
    }

}
