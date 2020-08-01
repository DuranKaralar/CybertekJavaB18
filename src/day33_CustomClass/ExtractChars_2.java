package day33_CustomClass;

import java.util.ArrayList;

public class ExtractChars_2 {
    public static void main(String[] args) {

        String str ="ALDKS'^!24XDA!'4e532R%+'342";
        ArrayList<Character> letters=new ArrayList<>();// is letter
        ArrayList<Character> digits=new ArrayList<>();
        ArrayList<Character> specialChars=new ArrayList<>();

        for(int i=0;i<str.length();i++){
            char each=str.charAt(i);

            if(Character.isLetter(each)){
                 letters.add(each);
            }else if(Character.isDigit(each)){
                digits.add(each);
            }else{
                specialChars.add(each);
            }


        }


    }
}
