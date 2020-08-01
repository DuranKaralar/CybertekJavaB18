package day40_Encapsulation;

public class Encapsulation {

    private  long SSN;

    //GETTER: read only
    public final long getSSN(){
        return SSN;
    }

    /*
    this is working
     public long getSSN(){
        return SSN;
    }*/

    //SETTER: write only
    public void setSSN(long SSN){
        this.SSN=SSN;

    }

    /*
    this is working
   public  void setSSN(long SSN){
        this.SSN=SSN;

    }
     */
    public static void main(String[] args) {
        Encapsulation obj1=new Encapsulation();
        obj1.setSSN(1);
        System.out.println(obj1.getSSN());
    }


}
