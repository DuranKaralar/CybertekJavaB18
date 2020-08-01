package day48_Abstraction;

public class PhoneObjects {

    public static void main(String[] args) {

        IPhone phone1=new IPhone("11",1100,"large");
        IPhone phone2=new IPhone("X",800,"Medium");

        phone1.calling(660528);

        System.out.println(phone1);
        System.out.println(phone2);

        phone1.faceTiming(66611);
        phone1.calling(1212);
        phone1.texting(1231);

        Samsung phone3=new Samsung("Galaxy",300,"Large");

        System.out.println(phone1);
         phone1.calling(313);

        System.out.println(phone2);
    }

}
