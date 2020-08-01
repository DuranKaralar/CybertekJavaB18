package day18_NestedLoop;

public class do_While_Loop_Practice {
    //print the all the even number in the same line seperated by a space 0-100
    public static void main(String[] args) {
        int even=0;

        do{
            // if we put iterator in front of the statement it make difference
            if(even %2 ==0){// it helped us to give less conditon on while condition body and let us to
                System.out.print(even+" ");
            }


            even ++;
        }while (100>=even);

        // the difference is the first statement that is printed when it is false condition in do-while loop

        //

        int i=1;
        do{
            //if we put iterator here it starts with 2  because we will be increased it the answer is 23456 it will executes five times

            i++;
            System.out.println(i);
            // if we put here  it will be 12345 because at first we printed than increased value
            // we should give at the end, it is more common
        }while (i<=5);

        int z=1;
        do{
            System.out.println(z);
            if(z==3){
                break;
            }
            z++;
        }while(z<=5);

        System.out.println("==============");
        int y=1;
        do{
            if(y==3){
                y++;// need to make sure that the iterator is not skipping, so that the condtion will eventually be false
                continue;
            }
            System.out.println(y);
            y++;
        }while(y<=5);

        int t=1;
        do{
            if(t%2!=0) {
                t++; // it lets us to not skip the iteration because if we do not give it, it will not work
                continue;
            }

            System.out.print(t+" ");
            t++;// we need to make sure that this iterator is not missing
        }while(t<=100);











    }
}
