package day44_Exceptions;

public class Unchecked {

    public static void main(String[] args) {

        //System.out.println(9/0); // everything seems fine untill we learn it is not compiling when we runtime

        String str="Cybertek";
       // System.out.println(str.charAt(-1)); // chartat starts from 0 so that it give us index out of bounds exceptions

        System.out.println("Test completed");//it willl not give us to complete other steps if 9/0 is not commented

        int[] arr={1,2,3,4};
        System.out.println(arr[200]); // arratindexout of bounds exceotion is under the index out of bounds exception
        //runtime exception is parent of all uncheked exceptions

        // when we are unchecked ecpections, java will compile the before steps that are compiling till unchecked exception

    }

}
