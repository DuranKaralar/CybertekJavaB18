package day19_Arrays;

import java.util.Scanner;

public class Arrays_Practice2 {
    public static void main(String[] args) {

        int[] arr={10,20,30};
        System.out.println(arr.length);//3 (give us the total element of array

        String[]students1=new String[10];
        //Write a program that asks"enter a name " 10 times and store each of the names in the array students
/*
        students[0]="Bekir";
        students[1] ="Duran";
        students[2] ="Karalar";
        students[3] ="Alparaslan";
        students[4] ="Karalar";
        students[5] ="Enes";
        students[6] ="Karalar";
        students[7] ="Ayşe";
        students[8] ="Nur";
        students[9] ="Karalar";

        System.out.println(students[1]); */
        Scanner scan=new Scanner(System.in);

        for(int k=0;k<=9;k++){
            System.out.println("Enter a name");
            String [] students=new String[k];
            String students2=scan.nextLine();

            System.out.println(students[k]);
        }









    }
}
