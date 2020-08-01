package day40_Encapsulation;

public class PersonObjects {

    public static void main(String[] args) {

        Person Zarina =new Person("Zarina");
        System.out.println(Zarina.name);
      //  System.out.println(Zarina.SSN);

        Zarina.setSSN(12345);
        System.out.println("Zarina' SSN: "+Zarina.getSSN());

        //System.out.println(Zarina.ID);
        Zarina.setID(654);
        System.out.println(Zarina.getID());







    }



}
