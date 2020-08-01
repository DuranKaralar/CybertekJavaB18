package Practice_04_22_2020;

public class void_Merhod {
    public static void main(String[] args) {
        System.out.println("================================");
       print();
        System.out.println("=================================");
        boolean USCitizen=true;
        int age=21;
        EligibletoVote(age , USCitizen); // We can give parameters(VALUES) before the methods
        System.out.println("==================================");

        EligibleToBuCi(18);
    }
    public static void print(){
        //it doesnt matter where we put it, but it must be in the clas
        // it doesnt matter before main method or after it
        // method must be declared in the class,
        for(int i=0;i<5;i++) {
            System.out.println("Hello Batch 18");
        }

    }
    public static void EligibletoVote(int age,boolean USCitizen){
        boolean eligibletoVote = age>=18 &&USCitizen==true;
        if(eligibletoVote){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
    }
    //Write a program if a person is eligible to buy cigarrett
    //  must know: age
    public static void EligibleToBuCi(int age){
        if(age>18){
            System.out.println("Eligible to buy");
        }else{
            System.out.println("Not Eligible to buy");
        }
    }

}
