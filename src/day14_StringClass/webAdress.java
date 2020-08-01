package day14_StringClass;
/*
 /*
        write a program that can valiadete if a web adress is valid

        valid web adress:
                 must starts with www.
                 must end with .com or edu or .net or
         */

public class webAdress {
    public static void main(String[] args) {

        String website="WWw.cybertek.Gov";
        website=website.toLowerCase(); // we assigned to small caharacter

        boolean validEnding=website.endsWith(".com")||website.endsWith(".edu")||website.endsWith(".gov");

        if  (website.startsWith("www.")&&validEnding){
           System.out.println("Valid: adress");
       }else{
            System.out.println("Invalid adress");
        }

        // we first convert it to the lowercases after that we used boolean in order to











    }
}
