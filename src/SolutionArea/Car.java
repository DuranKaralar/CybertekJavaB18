package SolutionArea;

import java.util.Scanner;

public class Car {
    public static void main(String[] args) {

/*
hippopotamus     9 hippopotami
 */     Scanner inp=new Scanner (System.in);
        System.out.print("# in:");
        int amt = inp.nextInt();
        inp.nextLine(); //this line is necessary
        System.out.print("word:");
        String word = inp.nextLine();
        //leave the above unedited, write your code below:
        if (amt == 0 && amt > 1) {
            if (word.endsWith("fe")) {
                word.replaceFirst("fe", "ves");
                System.out.println(amt + " " + word);
            } else if (word.endsWith("y") && word.equalsIgnoreCase("family")) {
                word = word.replaceFirst("y", "ies");

                System.out.println(amt + " " + word);
            } else if(word.endsWith("y") ) {
                word = word.replaceFirst("y", "ys");

                System.out.println(amt + " " + word);
             }else if (word.endsWith("sh") || word.endsWith("ch")) {
                    word = word.replaceFirst("sh", "shes");
                    word = word.replaceFirst("ch", "ches");
                    System.out.println(amt + " " + word);
                } else if(word.endsWith("us")){
                word=word.replaceFirst("us","i");
                System.out.println(amt + " " + word);
            } else if (word.endsWith("ay") || word.endsWith("oy") || word.endsWith("ey") || word.endsWith("uy")) {
                    word = word + "s";
                    System.out.println(amt + " " + word);
                } else {
                    word = word + "s";
                    System.out.println(amt + " " + word);
                }

                }else if(amt==1){
            System.out.println(amt + " " + word);
        }
        else {
            if (word.endsWith("fe")) {
                word.replaceFirst("fe", "ves");
                System.out.println(amt + " " + word);
            } else if (word.endsWith("y")&&word.equalsIgnoreCase("family")) {
                word = word.replaceFirst("y", "ies");
                System.out.println(amt + " " + word);
            }else if((word.endsWith("y"))){
                word = word.replaceFirst("y", "ys");
                System.out.println(amt + " " + word);
            }else if (word.endsWith("sh") || word.endsWith("ch")) {
                word = word.replaceFirst("sh", "shes");
                word = word.replaceFirst("ch", "ches");
                System.out.println(amt + " " + word);
            }else if(word.endsWith("us")) {
                word = word.replaceFirst("us", "i");
                System.out.println(amt + " " + word);
            }else if (word.endsWith("ay") || word.endsWith("oy") || word.endsWith("ey") || word.endsWith("uy")) {
                word = word + "s";
                System.out.println(amt + " " + word);
            } else {
                word = word + "s";
                System.out.println(amt + " " + word);
            }

        }



    }
}


