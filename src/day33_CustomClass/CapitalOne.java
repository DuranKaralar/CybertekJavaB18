package day33_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount Bekir=new BankAccount();

        Bekir.accountHolder="Bekir";
        Bekir.accountnumber=10761434194l;

        Bekir.checkingbalance();

        Bekir.deposit(33);
        Bekir.checkingbalance();

        Bekir.withDraw(13);
        Bekir.checkingbalance();

        System.out.println(Bekir);




    }
}
