 public class diagonal_sum_elements{
    public static void main(String[] args) 
    {
    //FIRST INSERT ROWS AND COLUMNS FOR BUILDING 2D ARRAY SUCH THAT ROWS AND COLUMN BOTH ARE EQUAL(HOMOGENOSU 2D ARRAY)I.E 3X3;2X2
    
    //FIRST OF ALL GET LEFT AND RIGTH DIAGONALS
    //IN LEFT DIAGONAL ELEMENTS UR ROWS AND COLUMS ARE EQUAL THAT IS 0,0;1,1;2,2;3,3 
    //IN RIGHT DIAGLONAL IF U SEE UR ROW AND COLUMN GETS CHANGE SUCH AS ROW GET INCREASE AND COLUMN GETS DECREASED BY 1 
    //MEANS FOR EVERY INCREASE IN ROW UR COLUMN GET DECREASE BY 1 FROM LAST
    
    //THEN ADD ALL THE ELEMENTS OF LEFT AND RIGTH DIAGONALS SUCH THAT
    //IF UR 2D ARRAY IS HAVE ODD ROWS AND COLUMNS THEN U NEED TO MINUS MIDDLE ELEMENT FROM BOTH THE DIAGONAL AND CONSIDER IT ONLY ONE TIME
    //THAT MEANS UR LEFT DIAGONAL HAS ELEMENTS  1 3 9 AND RIGHT DIAGONAL HAS ELEMENTS 3 5 7  THEN U MUST CONSIDER MIDDLE ELEMENT 5 ONLY ONE TIME THEN ADD ALL ELEMENTS
    //AFTERADDING ALL DIAGONAL ELEMENTS 1+3+9+3+5+7=28 THEN MINUS MIDDLE ELEMENT THAT IS 3 "28-3=25"
    //IF U 2D ARRAYS HAVE EVEN ROWS AND COLUMNS THEN U NEED NOT DO ANYTHING
    
    //FOR 5 ROWS AND 5 COLUMNS 
    //LD:-1 7 4 1 7   RD:-5 9 4 8 3   COMMON:-4 HAVING INDEX 2 2 
     
    System.out.println("CARRY OUT SUM OF DIAGONALS OF 2D ARRAY"); 
    int[][] Twodimarray=ArrayUtility.input2darray();
    System.out.println("DISPLAY THE ARRAY");
    ArrayUtility.display2dArray(Twodimarray);
    long sum=sum_of_left_right_diag(Twodimarray);
    System.out.println("SUM OF ALL DAIGONAL ELEMENTS IN AN ARRAY ARE:-"+ sum);
    
}

    public  static long sum_of_left_right_diag(int[][] Twodimarray)
    {
        //GET SUM OF THE LEFT DIAGONAL AND RIGHT DIAGONAL ELEMENTS HAVING DATA TYPE LONG
        long leftdiagonal=sum_of_left_diag(Twodimarray);
        long rightdiagonal=sum_of_right_diag(Twodimarray);

        //NOW ADD WHOLE LEFT DIAGONAL AND RIGHT DIAGONAL ELEMENTS WITH MIDDLE ELEMENT PRESENT IN IT FOR DOUBLE TIME
        long sum=leftdiagonal+rightdiagonal;

        //CHECK WHETHER UR 2D ARRAY HAS ODD ROWS AND COLUMNS
        //IF YES THEN SUBTRACT THE MIDDLE ELEMENT FROM THE SUM
            if(Twodimarray.length%2!=0)
            {
                //TO GET MIDDLE ELEMENT INDEX
                int index=Twodimarray.length/2;
                sum=sum-Twodimarray[index][index];
            }
        return sum;
    }



    public static long sum_of_left_diag(int[][] Twodimarray){
        long sum=0;
        int i=0;
        while(i<Twodimarray.length)
        {
            //LEFT DIAGONAL ELEMENTS ARE PRESENT AT ROWS AND COLUMNS HAVING SAME VALUES SUCH AS 0,0 1,1 2,2
            //TO GET 0,0 1,1 2,2
            //Twodimarray[i][i] WHERE I REPRESENT EACH ROWS  SUCH AS 0,1,2
            sum=sum+Twodimarray[i][i];
            i++;
        }
        return sum;
    }

    public static long sum_of_right_diag(int[][] Twodimarray)
    {
        int i=0;
        long sum=0;
        //IN RIGHT DIAGONAL ELEMENTS THEY ARE PRESENT AT ROWS WHERE EACH ROWS ARE INCREMENTATINF AND COLUMN VALUE ARE DECREASING BY 1 FOR EACH ROW INCREMENT

        while(i<Twodimarray.length)
        {
            //Twodimarray.length-1 GIVES LAST INDEX
            //(Twodimarray.length-1)-i DECREMENT COLUMN INDEX BY 1 FOR EACH ROW INCREEMENT
            
            int columnIndex=(Twodimarray.length-1)-i;
            sum=sum+Twodimarray[i][columnIndex];
            i++;
        }
        return sum;
    }
}
 