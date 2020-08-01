package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ExtractChars3 {
    public static void main(String[] args) {

        String str ="ALDKS'^!24XDA!'4e532R%+'342";
        char[] arr=str.toCharArray();

        Character[] ch=new Character[arr.length];

        for(int i=0;i<arr.length;i++){
            ch[i]=arr[i];
        }
        System.out.println(Arrays.toString(ch));

        ArrayList<Character> letters=new ArrayList<>(Arrays.asList(ch));// is letter
        letters.removeIf(p ->!Character.isLetter(p));
        System.out.println(letters);

        ArrayList<Character> digits=new ArrayList<>(Arrays.asList(ch));
        digits.removeIf(p->!Character.isDigit(p));

        ArrayList<Character> specialChars=new ArrayList<>(Arrays.asList(ch));
       specialChars.removeAll(digits);
       specialChars.removeAll(letters);
        // specialChars.removeIf(p->Character.isDigit(p) ||Character.isDigit(p));
        System.out.println(specialChars);



    }
}
