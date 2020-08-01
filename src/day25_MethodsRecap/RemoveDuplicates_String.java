package day25_MethodsRecap;

public class RemoveDuplicates_String {

    public static void main(String[] args) {
        String str="ABABABABAAB";

        String result="";

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!result.contains(""+ch)){
                result +=ch;
            }
            String str2 = "ABCABCABC";

            String result2 = RemoveDuplicates(str2);  //ABC

            System.out.println(result2);

        }
        System.out.println(result);

    }

    public static String RemoveDuplicates(String str){
        String result="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!result.contains(""+ch)){
                result +=ch;
            }
        }
        return result;
    }

}
