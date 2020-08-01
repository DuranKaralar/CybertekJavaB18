package day23_Methods;

public class UniqueValues {
    public static void main(String[] args) {
        String[] arr={"A","B","A"}; //B

        for(String i:arr){
            //for(int j=0;j<arr.lenght;j++


            int count2=0;

            for(int x=0;x<arr.length;x++){
                if(arr[x].equals(i)){// arr[x].equals(arr[j])
                    count2++;
                }
            }
            if(count2==1){
                System.out.println(i);
            }
        }



        System.out.println("====================================================");



            for(String each2 :arr) {


                int count = 0;

                for (String each : arr) {
                    if (each.equals(each2)) {
                        count++;
                    }
                }
                if (count == 2) {//if the character is unique
                    System.out.println(each2);
                }

            }

            /*
            String str=AAABBCC  A3B2C2

             */










    }
}
