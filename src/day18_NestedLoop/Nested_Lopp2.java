package day18_NestedLoop;

public class Nested_Lopp2 {
    public static void main(String[] args) {
        // this help us to make triangle



        for(int i=9;i>=1 ;i--) {// we used this one in order to reverse it

            for( int z=1;z<=i;z++) {
                System.out.print("* ");
            }
            System.out.println();

        }


        for(int i=1;i<=9 ;i++) {// we used this one in order to reverse it

            for( int z=1;z<=i;z++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println("============================");
        for(char ch='z';ch<='a';ch--){
            System.out.print(ch+" ");
        }
        System.out.println();
        System.out.println("Hello");
        for(char z='e';z>='a';z--){  // changing the first for initation to second loop it allow us to // get a

            for(char ch='a';ch<=z;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }










    }
}
