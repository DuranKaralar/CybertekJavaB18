package day41_Inheritance.Task02;

public class AccountObjects {
    public static void main(String[] args) {

        CheckingAccount obj1 = new CheckingAccount();
        obj1.accountHolder="Saban";

        obj1.showBalance();
        System.out.println(obj1);

        obj1.deposit(25000);
        obj1.showBalance();

        obj1.withdraw(10000);
        obj1.showBalance();

        System.out.println(obj1);

        System.out.println("==============");

        SavingAccount saving=new SavingAccount();
        saving.accountHolder="Elif";

        System.out.println(SavingAccount.interestRate);
        System.out.println(saving);

        saving.deposit(3000);
        saving.showBalance();


    }
}
