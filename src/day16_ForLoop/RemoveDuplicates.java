package day16_ForLoop;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);



        String str =scan.next();
                  // 0123


        String result="";//ab

        for(int i=0;i<=3;i++){//0,1,2,3
            /*
            if(result.contains(""+str.charAt(i))){
                result += str.charAt(i);
            }
            */
            if(result.contains(""+str.charAt(i))){
                // if the string result doesnt contains str.charAt(i
                //then we concate it to the result
                continue;
            }
            result += str.charAt(i);// only gets executed if str.charAt(i) is not contained in the result
        }
        System.out.println(result);







    }
}
