package SolutionArea;

public class Book {

    String title;
    String author;
    String tableOfContents="";

    int nextPage=1;
    public Book(String title,String author){
        this.title=title;
        this.author=author;
    }
    public void addChapter(String Chaptertitle,int numofpages){
        tableOfContents+="\n"+Chaptertitle+"..."+numofpages;
        nextPage +=numofpages;
    }
    public int getPages(){
        return nextPage-1;
    }

    public String getTableOfContents(){
        return tableOfContents;
    }
    public String toString(){
        return title+ "\n"+author;
    }



}
