package day18_NestedLoop;

public class String_Reverse {
    public static void main(String[] args) {
        String word="Java";
        int length=word.length()-1;
        String result="";
        do{
           result += word.charAt(length);

            length--;
        }while(0<=length);
        System.out.println(result);








    }
}
