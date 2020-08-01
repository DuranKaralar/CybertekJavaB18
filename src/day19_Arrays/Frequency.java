package day19_Arrays;

public class Frequency {
    public static void main(String[] args) {
        /*
        write a program that can return the frequenct of tge characters in a strinh
        ex: "AAABSSAAD"
         */
        String str="AABCC";
        String result=""; //A2B1C2 LETTERS ARE ABC

        String nonDuplicates =""; //ABC

        for (int i=0;i<=str.length()-1;i++){
            if(!nonDuplicates.contains(""+str.charAt(i))){//if the character at the index is i is noot contained in NonDup,
                // then it wll
                nonDuplicates +=str.charAt(i);
            }
        }
        System.out.println(nonDuplicates);
       ;//count the total number of occurence of each character from str
        // if we have repeated action we can use loop

        for(int j=0;j<=nonDuplicates.length()-1;j++){
            char ch=nonDuplicates.charAt(j);
            int count=0; //count the total number of occurence of the each character from str
            for(int i=0;i<=str.length()-1;i++){
                if(str.charAt(i)==ch){
                    count++;
                }
            }
            result +=""+ch+count;
        }

        System.out.println(result);













    }
}
