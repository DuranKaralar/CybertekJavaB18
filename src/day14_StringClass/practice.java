package day14_StringClass;

public class practice {
    public static void main(String[] args) {
        String gmail="cybertekschool@gmail.com";
        String userGmail="CyBERtekSchool@gmail.com";

        System.out.println(gmail.equalsIgnoreCase(userGmail));// true

        boolean result=gmail.equalsIgnoreCase(userGmail); // false

        if(result){
            System.out.println("Logged in");
        }

        System.out.println("================================");
        /*
        valid password MUST contain a special characters such as (,'_$)
        valid pasword should not containspaces
         */
        // second requirement
        String password="masssd123";
       if( password.contains(" ")){
           System.out.println("Pasword cancot have space in it");
        }else{
           System.out.println("Valid password");
       }

        System.out.println("============================");

       /*
       every website has www at the beginn,ng of the web adress
        */
       String h1="www.fotomaç.cos";
       String h2="www.habertürk.com";
       String h3="http.sözcü.com";
       if (h1.contains("www.")){
           System.out.println("valid");
       }// it returns us true but it doesnt because
        // it must starts with

        if(h1.startsWith("www.")){
            System.out.println("Valid");
        }

        if(h1.endsWith(".com")){
            System.out.println("End with is true");
        }
        System.out.println(h1.endsWith("m"));

        /*
        write a program that can valiadete if a web adress is valid

        valid web adress:
                 must starts with www.
                 must end with .com or edu or .net or
         */









    }
}
