package day40_Encapsulation;

public class Test {
    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();
 //       System.out.println(obj.SSN);
        System.out.println(obj.getSSN()  );//0

       // obj.SSN=1234;

        obj.setSSN(12345);
        //System.out.println(obj.SSN);

        System.out.println(obj.getSSN());//12345







    }

}
