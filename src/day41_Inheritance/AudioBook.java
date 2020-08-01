package day41_Inheritance;

public class AudioBook extends Ebook {

    /*
   title (Iherited)
   author (Iherited)
   price (Iherited)
   length (declared)
   listen() (declared)
   toString() (Iherited)
    */
public String length;
public String narrator;

public void listen(){
    System.out.println("Listening to "+title);
}


}
