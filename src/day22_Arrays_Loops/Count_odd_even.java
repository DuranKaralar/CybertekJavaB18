package day22_Arrays_Loops;

public class Count_odd_even {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int countOddNum=0;
        int countEvenNum=0;

        for(int each :arr){
            /*
            if(each%2!=0){
                countOddNum++;
            }else{
                countEvenNum++;
            }
             */

            if(each%2==0){
                countEvenNum++;
                continue;
            }
            countOddNum++;
        }
        System.out.println("Even Number " + countEvenNum);
        System.out.println("Odd Number "+countOddNum);







    }
}
