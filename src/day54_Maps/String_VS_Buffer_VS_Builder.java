package day54_Maps;

public class String_VS_Buffer_VS_Builder {

    public static void main(String[] args) {

        String str1="cybertek";
                   str1.concat(" School");

        System.out.println(str1);//cybertek

      //  String is immutable version of char sequence

        System.out.println("===================================");
        //Stringbuilder is mutable of char sequences

        StringBuilder builder=new StringBuilder("Cybertek");
                   builder.append(" School"); // we can modify it so that we dont need to do like builder=builder.
        System.out.println(builder);


        System.out.println("===========================");
        StringBuffer buffer=new StringBuffer("Cybertek");
                     buffer.append(" School");

        System.out.println(buffer);

        System.out.println("=================================");

        String word="ABCD";

        StringBuilder sb=new StringBuilder(word);
        sb.reverse();
        word=sb.toString();
        System.out.println(sb);
        System.out.println(word);








    }

}
