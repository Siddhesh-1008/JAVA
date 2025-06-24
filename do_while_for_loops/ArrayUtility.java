
import java.util.Scanner;
public class ArrayUtility{
    //DECLARE THE METHOD WITH RETURN TYPE int[] ARRAY
    public static int[] inputArray()
    {
        //TAKE THE INPUT FROM USER
        Scanner input=new Scanner(System.in);
        //GET THE SIZE OF AN ARRAY THAT USER WANT
        System.out.print("PRLASE ENTER THE SIZE OF ARRAY:- ");
        int size=input.nextInt();

        //THEN DECLARE THE SIZE OF AN ARRAY
        //int[] array=new int[size] MEANS CREATE ARRAY WITH USERS INPUT SIZE
        //IF SIZE IS 2 THEN SIZE OF ARRAY IS 2 THUS IT ACCOMODATES TWO ELEMENTS IN AN ARRAY
        int[] array=new int[size];

        int i=0;
        //LOOP FOR INSERITNG VALUE IN AN ARRAY
        while(i<size){
            //GET THE VALUE FROM USER 
            System.out.print("ENTER THE VALUE THAT MUST BE INSERTED IN AN ARRAY:- ");
            int value=input.nextInt();
            //ADD THAT USER INPUT VALUE IN ARRAY
            array[i]=value;
            i++;

        }
        return array;
    }

    public static void new_array_of_del_element(int[] newarray)
    {
        int i =0;
        while(i<newarray.length)
        {
            System.out.print(newarray[i] +" ");
            i++;
        }
        System.out.println();
    }

    public static void display(int[] newarray)
    {
        int i =0;
        while(i<newarray.length)
        {
            System.out.print(newarray[i] +" ");
            i++;
        }
        System.out.println();
    }

    public static int[][] input2darray()
    {

        Scanner input=new Scanner(System.in);
        System.out.print("PLEASE GIVE ME THE NUMBER OF ROWS FOR 2 DIMENSIONAL ARRAY:-");
        int rows=input.nextInt();

        System.out.print("PLEASE GIVE ME THE NUMBER OF COLUMNS FOR 2 DIMENSIONAL ARRAY:-");
        int cols=input.nextInt();
        
        //DEFINE THE SIZE OF TWO DIMENISONAL ARRAY
        int[][] new2darray=new int[rows][cols];

        int i=0;
        while(i<rows)
        {
            int j=0;
            while(j<cols)
            {
                System.out.print("ENTER THE ELEMENT AT ROW "+ i + " , AND COLUMN "+j +"=> ");
               
                //ADD ELEMENTS IN ROWS AND COLS
                //new2darray[i][j]=2   HERE new2darray[0][0]=2  MEANS ADD VALUE 2 AT 0TH ROW AND 0TH COLUMN
                //WHERE i REFERS TO ROWS AND j REFERS TO COLUMNS 
                new2darray[i][j]=input.nextInt();
                j++;
            }
            i++;
        }
        return  new2darray;
    }

    public static void display2dArray(int[][] TwoDimArray)
    {
        int i=0;
        while(i<TwoDimArray.length)
        {
            int j=0;
            while(j<TwoDimArray[i].length)
            {
                System.err.print(TwoDimArray[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
        
    }
}
