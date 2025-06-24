public class loop_pattern {
    public static void main(String[] args) {
        pattern();
    }

    public static void pattern()
    {
        int rows=0;
        //NUMBER OF ROWS 
        while(rows<5){
            //ONE STAR AT STARTING IS COMMON FOR EACH ROWS
            System.out.print("*");

            //AT EACH ROW AFTER PRINTING ONE STAR THERE ARE SAPCE STARS AND EHIC ARE GETIING INCREMENT BY 1 AT EACH ROW
            //THIS FOR REPETIVE STARS ON EACH ROW WITH A SPACE BETWEEN IT 
            int i=0;
            while(i<rows){
                System.out.print(" *");
                i++;
            }
            //TO GET INTO NEXT LINE AFTER COMPETIO OF EACH ROW
            System.out.println();
            rows=rows+1;
        }
    }
    
}
