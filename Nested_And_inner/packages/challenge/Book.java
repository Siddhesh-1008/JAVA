package  packages.challenge;
public class Book extends  Libraryitem
{

    private String titlename;
    private int itemID;
    public String ISBN;
    public Book()
    {
        this.titlename=gettitle();
        this.itemID=getItemId();

    }

    public void display(){
        System.out.printf("UR BOOK TITLE IS %S AND ITS ITEM_ID IS %d",titlename,itemID);
    }
    
}
