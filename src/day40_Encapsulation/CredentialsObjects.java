package day40_Encapsulation;

public class CredentialsObjects {

    public static void main(String[] args) {

        Credentials facebook=new Credentials();

        System.out.println(facebook.getUserName());//null
        System.out.println(facebook.getPassWord());//null

        facebook.setUserName("BekirD");
        facebook.setPassWord("Fener-1907");

        System.out.println(facebook.getUserName());
        System.out.println(facebook.getPassWord());//

        // we can not use void in print method




    }


}
