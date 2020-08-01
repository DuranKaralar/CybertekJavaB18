package day15_ForLoop;

public class ReverseString {

    public static void main(String[] args) {

        String str="aya lal olo";
        String reverse="";
        int lastindexnum=str.length()-1;
        for (int i=lastindexnum;i>=0; i--){
            System.out.print( str.charAt(i));
            reverse += str.charAt(i);
        }

        System.out.println(reverse);

        /*
        write a program to identify if a sting is palindrome
        level ==> level ==> palindrome
        if yes =true
        otherwise =false
         */











    }
}
