package day50_Polymorphism;

public class Encapsulation {

    private String username="MIT";

    //GETTER and setter are instance
    // in setter datatype must match
    public  String getUsername(){//read onlu
        return username;
    }

    public void setUsername(String username){//Write only
        this.username=username;
    }

}
class Test{
    public static void main(String[] args) {

        Encapsulation obj=new Encapsulation();
        //sout
        System.out.println(obj.getUsername());
        obj.setUsername("Cybertek");

        System.out.println(obj.getUsername());

     //We cannot use final for private because we cannot modify it
      //but we are allowed read to only getter method, we cannot generate setter

    }
}
