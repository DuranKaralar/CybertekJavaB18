package day33_CustomClass;

import java.util.ArrayList;

public class ExtractChars {
    public static void main(String[] args) {

        String str="ABCDS23J12@'^1+3]>055121";
        ArrayList<Character> letters=new ArrayList<>();// is letter
        ArrayList<Character> digits=new ArrayList<>();
        ArrayList<Character> specialChars=new ArrayList<>();

      char[] arr= str.toCharArray();

      for(int i=0;i<arr.length;i++){
          if(arr[i]>=48 &&arr[i]<=57){
              digits.add(arr[i]);
          }
      }

      for(char each :arr){
          if(Character.isLetter(each)){
              letters.add(each);
          }
      }

      for (char each2:arr){
          if(!Character.isDigit(each2)&&!Character.isLetter(each2)){
              specialChars.add(each2);
          }
      }
        System.out.println(specialChars);

    }
}
