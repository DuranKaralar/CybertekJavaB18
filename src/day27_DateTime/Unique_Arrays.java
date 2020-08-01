package day27_DateTime;

public class Unique_Arrays {
    /*
    3. write a method that can return the minimum number from an int array
	4. write a method that can return the minimum number from a double array
			NOTE: MUST apply method overloading

     */

    public static void main(String[] args) {
        int[] arr={1,1,1,1,1,2,3,3};//2
                // 0 1 2 3 4
        //arr[0] ==>1

        for(int i=0; i<arr.length;i++){ //for (int i=0; i<arr.length;i++) (for (int each2 : arr)
            int count=0;
            for( int each: arr) {
                if (each == arr[i]) {
                    count++;
                }
            }
            if(count==1){
                System.out.println(arr[i]);
        }


        }
        System.out.println("======================");
        int[] arr2={1,2,2,3,4,4,6,6};
        uniqueElements(arr2);

        System.out.println("=======================");
        double[] arr3={1.2,1.2,1.1,2.2};
        uniqueElements(arr3);

    }

    public static void uniqueElements(int[] arr){
        for(int i=0; i<arr.length;i++){ //for (int i=0; i<arr.length;i++) (for (int each2 : arr)
            int count=0;
            for( int each: arr) {
                if (each == arr[i]) {
                    count++;
                }
            }
            if(count==1){
                System.out.println(arr[i]);
            }


        }
    }

      public static void uniqueElements(double[] arr){
          for(double each2:arr){ //for (int i=0; i<arr.length;i++) (for (int each2 : arr)
              double count=0;
              for( double each: arr) {
                  if (each == each2) {
                      count++;
                  }
              }
              if(count==1){
                  System.out.println(each2);
              }


          }

      }

}
