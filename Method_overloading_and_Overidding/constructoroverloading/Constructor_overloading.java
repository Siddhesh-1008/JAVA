package constructoroverloading;
public class Constructor_overloading {
    String name;
    /*
     * HERE ONE CONSTRUCTOR IS DEFAULT CONSTRUCTOR WHILE ANOTHER IS PARAMETERIZED CONSTRUCTOR
     * AS BOTH HAVE SAME NAME BIT ONE WILL RUN WHEN NO PARAMETER IS THERE WHILE OTHER WILL RUN IF PARAMTERS ARE PRESENT
     */
    Constructor_overloading(){
        this.name="Rahul";
    }

    Constructor_overloading(String name){
        this.name=name;
    }




    public static void main(String[] args)
     {
        Constructor_overloading  mo1=new Constructor_overloading ();
        Constructor_overloading  mo2=new Constructor_overloading ("Sid");
        
        
        
    }
}