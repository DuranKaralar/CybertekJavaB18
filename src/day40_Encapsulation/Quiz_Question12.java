package day40_Encapsulation;

public class Quiz_Question12 {

    public static  String name="Osman";

    public Quiz_Question12(){
        name="Hilal";
    }

    {//instance block
        name="Marionela";
    }

    static {
        name="Madina";
    }

    public static void main(String[] args) {
        System.out.println(name);
    }

}
