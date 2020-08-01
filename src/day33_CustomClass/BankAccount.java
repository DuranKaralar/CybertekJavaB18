package day33_CustomClass;

public class BankAccount {

    String accountHolder;
    long accountnumber;
    double balance;

    public void checkingbalance(){
        System.out.println("Available Balance: "+balance);
    }

    public void withDraw(double amount){
        System.out.println("Withdrawing $"+amount);
        balance -=amount;
    }

    public void deposit(double amount){
        System.out.println("Depositing $"+amount);
        balance +=amount;
    }

    public String toString(){
        String result = "Account Holder: "+accountHolder+"\nAccount Number: "+accountnumber+"\nAvailable Balance: "+balance;
        return result;
    }


}
