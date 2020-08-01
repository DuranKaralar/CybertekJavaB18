package day26_MethodOverloading;

public class Frequecy {
    public static void main(String[] args) {

        String str="AAA";

        char ch='A';

     char[] arr = str.toCharArray();//['A', 'A', 'A']
        int count=0;
        for(char each : arr){
            if(each==ch){
                count++; // char doesnt have contains.
            }
        }
        System.out.println(count);

        String str2="ABCABBAAABASAB";
        char ch2='B';
        int num1=frequency(str2, ch2);


    }
    public static int frequency(String str, char ch){
            char[] arr = str.toCharArray();//['A', 'A', 'A']
            int count=0;
            for(char each : arr){
                if(each==ch){
                    count++; // char doesnt have contains.
                }
            }
        return 123;

    }

}
