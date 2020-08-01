package day17_WhileLoops;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str="Java is fun, Java is cool".toLowerCase();//ABCD

        int count=0;//2
        String word="Java".toLowerCase();
        while (str.contains("Java")) {

            count++;
            str=str.replaceFirst("Java","");
            //str=str.replaceFirst(word,""); this is the way of finding the number of the characters that are showed
            // on the (str) and we assigned toLowecase in prder to change them to lowercase and then we 
        }
        System.out.println(count);











    }
}
