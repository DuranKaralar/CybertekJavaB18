package day27_DateTime;

public class Find_Minumum {
    public static void main(String[] args) {

    int[] arr={5,4,7,5};
    int minimum=arr[0];

    for(int each : arr){
        if(each<minimum){
            minimum =each;
        }
    }
        System.out.println(minimum);
    int min=minimum;
        System.out.println(min);

        int[] arr3={100,2000,3000,500,1};
       int min2=minumum(arr3);
        System.out.println(min2);

        int[] arr2={5,4,7,5};
        int max=arr2[0];

        for(int each:arr2) {
            if (each > max) {
                max = each;
            }
        }

        System.out.println(max);
        double[] arr4={4,2,80,99,1};

        double max2=maximum(arr4);
        System.out.println(max2);


    }
      public static int minumum(int[] arr){
          int minimum=arr[0];

          for(int each : arr){
              if(each<minimum){
                  minimum =each;
              }
          }
        return minimum; // we assigned it to minumum
      }

      public static double maximum(double[] arr){
        double max=arr[0];

        for(double each : arr){
            if(each>max){
                max=each;
            }
        }
        return max;
      }

}
