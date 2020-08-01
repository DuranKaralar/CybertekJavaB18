package day49_Polymorphisim;

public class PhoneObjects {
    public static void main(String[] args) {
        Iphone phone1=new Iphone("Iphone 11",1100," 9 inches");
        System.out.println(phone1);
        phone1.calling(123);
        phone1.faceTiming(12421);
        phone1.download();
    }
}
