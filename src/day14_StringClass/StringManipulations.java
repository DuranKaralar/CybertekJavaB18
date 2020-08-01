package day14_StringClass;

public class StringManipulations {
    public static void main(String[] args) {


        String str="I like to learn Java. I like watching Juman movie";
        int a1 =str.indexOf("J"); // returns the index num of first matching one
        System.out.println(a1);

        int a=str.indexOf("Jum");
        System.out.println(a);

        int a3=str.indexOf(" I")+1; //it returns index number of spoace in
                    // order to find the index number we gave +1
        //LAST INDEX METHOD
        String s="I like Java, and I like reading";
        int s1=s.lastIndexOf("I");
        System.out.println(s1);

        int l=s.lastIndexOf("l");
        System.out.println(l);

        String z="I like C#, C# is cool";

        int c=z.lastIndexOf("C");// it will returns us the Last C

        String x="I like Java, Java is Fun, Java is good";
        int xx=x.indexOf("Java is"); // it returns of the first words index number
                      //(", Java") the first one is the one that we are looking for
        System.out.println(xx);

        int xx2=x.indexOf(", Java")+2;

        System.out.println(xx2);

        int xx3=x.lastIndexOf("J");
        System.out.println(xx3);

        int xx4=x.indexOf("Java is g");
        System.out.println(xx4);

        char ch2=x.charAt(26);
        System.out.println(ch2);




    }
}
