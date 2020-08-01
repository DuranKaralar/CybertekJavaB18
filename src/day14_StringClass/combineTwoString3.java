package day14_StringClass;
/*	3. Write a Java method to display the middle character
 of a string
		a) If the length of the string is even there will
		 be two middle characters.
		b) If the length of the string is odd there will
		be one middle character.
				Input :
					elephant
				Output:
					The middle character in the string: ph

 */

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class combineTwoString3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String");
        String word = scan.next();//Cyber

        String middleCharacter = " ";
        // to store the middle characters at the end

        int totalChars = word.length(); // 5 middle character is b
        //  5/2
        int middleNumber = totalChars / 2; // 5/2 => 2 // we can assume that
        if (totalChars % 2 != 0) { // odd number
            //middleCharacter += word.charAt(middleNumber);
            middleCharacter=middleCharacter+word.charAt(middleNumber);
        }else{// even number 8/2=4 but
            middleCharacter=middleCharacter+word.charAt(middleNumber-1)+word.charAt(middleNumber);

            //middleCharacter+= word.charAt(middleNumber-1)+""+word.charAt(middleNumber);

        }
        System.out.println("Middle Character is: "+middleCharacter);





    }
}