package packages.challenge;
public class Libraryitem {
    /*
     * define itemid title author AS PRIVATE methods like checkout() returnitem() as public
     * THEN CREATE SUBCLASSES SUCH AS BOOK MAGAZINE DVD EACH INHERETING FROM LIBRARYITEM HIREARCHIAL INHERITANCE
     * IN BOOK CREATE ISBN AS PRIVATE IN MAGAZINE CREATE ISSUENUMBER AS PRIVATE IN DVD CREATE DURATION SECONDS AS PRIVATE
     */

     private int itemID=001;
     private String title="DEVEN JOES";
     private String author;

    
     public int getItemId(){
        return this.itemID;
     }

     public String gettitle(){
        return this.title;
     }


     public void checkout(){
        System.out.println("CHECKOUT FUNCTION");
     }

     public void returnitem(){
        System.out.println("RETURN ITEM TRACKER");
     }
}
