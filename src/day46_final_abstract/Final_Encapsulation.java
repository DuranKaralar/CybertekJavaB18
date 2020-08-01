package day46_final_abstract;

public class Final_Encapsulation {

   private int data1=200;
   private int data2=300;


   public int getData1(){
       // int the getter return type must match with
       return data1;
   }

   public void setData1(int data1){
       this.data1=data1;
   }

    public int getData2() {
        return data2;
    }

    public void setData2(int data2) {
        this.data2 = data2;
    }

    //we cannot use setter with final it give us compile error
    // setter assign new value but final do not get it


    // we can have 5 getter but 2 of them are final but it doesnt matter for getter
    // but if 2 of them 5 is finall we can set only three of them


}
