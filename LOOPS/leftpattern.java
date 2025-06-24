public class leftpattern {
    public static void main(String[] args) {
        int rows=5;
        pattern(rows);
    }


    public static void pattern(int rows){
        //BELOW LOOP FOR ROWS STARTIGN FROM 5 TO 0
        while(rows>0)
        {
            int i=0;
            // FOR STARS PRINTING ON EACH ROW
            while(i<rows)
            {
                System.out.print("* ");
                i++;
            }
            
            //TO GET INTO NEW LINE
            System.out.println();
            rows--;
        }
    }
}
