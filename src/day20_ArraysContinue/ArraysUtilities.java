package day20_ArraysContinue;
import java.util.Arrays;
public class ArraysUtilities {
    public static void main(String[] args) {

        int[] arr={1,2,3};
        String r=Arrays.toString(arr);
        System.out.println(r); //[1, 2, 3] // array must be converted to string befpre we ğrint

        // if we print arr it give us [a61bbe9ba  something like that it is h code

        String names[] ={"Madina","Fatih","Osman"};

        System.out.println(Arrays.toString(names));

        double[] nums={10,20,30,40};
        System.out.println(Arrays.toString(nums)); // it is 10.0 , 20.0 , 30. 0

        int[] num1={1,2,3};
        int[] num2={4,5,6,7};

        System.out.println(Arrays.toString(num1)+Arrays.toString(num2));










    }
}
