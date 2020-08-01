package day20_ArraysContinue;

public class Array_Size {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
                //  0 1 2
       // System.out.println(arr1[100]);// give compiler errorr array's size is fixed

        int []nums=new int[2];
        nums[0]=10;
        nums[1]=20;
       // nums[2]=30; it give us error, because array's size is fixed

        //nums=new int[3]; // we are initializing a new this var,able referring a new one, we are reseting the nums variable
        //only reinitialize array number it is

        System.out.println(nums[0]); // this is for the first one so that it is 10

        nums=new int [3];
        System.out.println(nums[0]);// this is for a new one so that it is 0, it is assigned by compiler









    }
}
