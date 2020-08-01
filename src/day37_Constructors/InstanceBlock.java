package day37_Constructors;

public class InstanceBlock {
    {
        System.out.println("Instance Block1");
        System.out.println(9);
    }

    public static void main(String[] args) {

       InstanceBlock obj=new InstanceBlock();
        // InstanceBlock obj2=new InstanceBlock();

    }

    static {
        System.out.println("Static Block");
    }

}
