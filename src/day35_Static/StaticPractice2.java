package day35_Static;

public class StaticPractice2 {

    String brand;
    String Model;//

    static boolean hasWheels=true;

    public void printBrand(){
       // this.brand=brand;
        System.out.println();//null
    }

    public void printModel(){
        System.out.println(Model);//null
    }

    public static void main(String[] args) {
        System.out.println(hasWheels);
    }

    //the result must be just true;


}
