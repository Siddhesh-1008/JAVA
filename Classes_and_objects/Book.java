public class Book{
    //CREATE A BOOK CLASS
    //INSTANCE VAR TITLE AUTHOR ISBN
    //STATIC VARIABLES totalbooks
    //INSTANCE METHODS borrowBook(),returnBook()
    //STATIC MEHTOD    getTotalBooks()

    //STATIC VARIABLES
    static int totalbooks;

    //INSTANCE VARIABLES
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    //STATIC BLOCKS
    //IT WILL RUN WHEN CLASS GETS LOADED WHENEVER WE SEE FIRST CLASS WHILE MAKING  OBJECT THIS IS CALLED
    //THIS IS EXECUTED BEFORE OTHER METHODS PROPERTIES 
    static {

        totalbooks=0; 
    }

    //NORMAL BLOCKS
    //WHENEVER new Book() WILL CALLED THEN THIS BLOCK WILL GET EXECUTED
    //AND IT WILL INCREMENT totalbooks BY 1
    {
        System.out.println("WELCOME TO BOOK STORE");
        totalbooks++;
    }


    //CONSTRUCTOR
    //PARAMETERIZED CONSTRUCTOR
    //USER NEED TO GIVE ISBN TITLE AUTHOR WHICH SETS 
    Book(String isbn,String title,String author)
    {
        //BASICALLY this.isbnIS USED FOR STTING VALUE IN INSTANCE ATTRIBUTE String isbn
        this.isbn=isbn;
        this.title=title;
        this.author=author;
    }

    //DEFAULT CONSTRUCTOR
    //WHEN U PASS ONLY ISBN VALUE AND KEEP OTHER FIELDS AS DEFAULT
    //when user pass only isbn and then it later pass title and author
    Book(String isbn){
        this(isbn,"unknown","unknown");
    }


    //STATIC MEHTODS
    //IN STATIC METHOD U CAN ONLY USE STATIC VARAIBLES AND NOT INSTANCE VARIABLES
    //WHILE IN NON STATIC METHOD U CAN ACCES STAIC VARIABLES 
    public static int getTotalBooks()
    {
        return totalbooks;
    }

    //NON STATIC METHODS
    //BASICALLY WHEN object.borrowBook() IS CALLED THEN IT HAS ITS OWN isbn,title,author
    //FOR THE FIRST TIME ITS SETS TRUE TO isBorrowed AND NEXT TIME IT WILL SHOW IF LOOP
    public void borrowBook()
    {
        if(this.isBorrowed)
        {
            System.out.println("THIS BOOK HAS BEEN BORROWD");
        }
        else{
            //SETTING CURRENT OBJECT isBorrowed TO TRUE
            //IF WE HAVE Book b1=new Book()
            //THEN this.isBorrowd=True BASICALLY SETTING b1.isBorrowed=True THAT IS SETTING INSTANCE VARIABLE isBoolean TO True
            this.isBorrowed=true;
            System.out.println("ENJOYED PURCAHSING BOOK "+this.title);
        }
        
    }

    public void returnBook(){
        //this.isBorrowed REFES TO CURRENT OBJECT 
        //MEANS AS WE SEEN UPPER Book b1=new Book() 
        //WE HAD SET  b1.isBorrowed=True THIS MEANS IF b1.returnBook() WILL GET CALLED
        //THEN this.isBorrowed WILL REFER TO b1.isBorrowed AS IT IS TRUE IT WILL MAKE IT FALSE WHILE RETURNNING BOOK
        if(this.isBorrowed)
        {
            this.isBorrowed=false;
            System.out.println("HOPE U ENJOYED THE BOOK");
        }
        else{
            System.out.println("THIS BOOK IS ALREADY IN LIBRARY ");
        }
        
    }

    
   public static void main(String[] args) {
    //PARAMTTERS PASSED TO PARAMATERIZED CONSTRUCTOR
    Book b1=new Book("1","KMS","RAJIV SRIVASTAV");
    //STATIC METHOD ACCSING
    System.out.println("NUMBER OF BOOKS AT STRITING:- "+Book.getTotalBooks());
    //SETTING THE this.isBorrowed TO true
    b1.borrowBook();
    //WHEN WE CALLED b1.borrowBook() AGAIN FOR THE FIRST TIME IT SET TO this.isBorrowed TO TRUE
    //NOW IT WILL EXECUTE ELSE BLOCK SHWOING THAT BOOK HAS BEEN BORROWWS
    b1.borrowBook();
    //RETURNING THE BOOKS
    //SETTING this.isBorrowed TO false
    b1.returnBook();

    //SECOND BUYER
    System.out.println();
    //DEFAULT CONSTRUCTOR
    Book b2=new Book("1");
    //WITHOUT BORROWONG BOOK IF U CALLED RETURN BOOK THEN IT WILL EXECUTE ELSE LOOP OF RETURN BOOK
    b2.returnBook();

   }

    
}
