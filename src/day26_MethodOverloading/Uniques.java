package day26_MethodOverloading;

public class Uniques {
    public static void main(String[] args) {
        String str = "ABABACDABCE";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int num = frequency(str, str.charAt(i));
            if (num == 1) {
                result += str.charAt(i);
            }
        }
        System.out.println(result);


    }

    public static String uniques(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int num = frequency(str, str.charAt(i));
            if (num == 1) {
                result += str.charAt(i);
            }
        }
        return  result;
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

