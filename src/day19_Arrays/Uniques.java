package day19_Arrays;

public class Uniques {
    public static void main(String[] args) {
        String str="AABCC";
        String result="";//B


        for(int j=0;j<=str.length()-1;j++){
            //char ch2=str.charAt(j);


            int count=0; //to the occurence of the character
            for(int i=0;i<=str.length()-1;i++){
                if(str.charAt(i)==str.charAt(j)) {
                    //char ch1=str.charAt(i)
                    //if(ch2==ch1) {//chechk how many times the character is occured in the string
                // count++;
                    // }
                    count++;
                }
                }
            if(count==1){ //İF UNİQUE willl be concated
                result +=str.charAt(j);
            }

        }
        System.out.println(result);








    }
}
