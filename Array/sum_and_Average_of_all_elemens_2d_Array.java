public class sum_and_Average_of_all_elemens_2d_Array {
    public static void main(String[] args)
    {
        System.out.println("SUM AND AVERAGE ALL ELEMENTS IN 2D ARRAY");
        
        int[][] TwoDimarray=ArrayUtility.input2darray();

        System.out.println("UR ARRAY LOOK LIKE THIS:- ");
        //FOR DIPALYING THE 2D ARRAY
        ArrayUtility.display2dArray(TwoDimarray);

        //ADDITION LOGIC
        long add=sum(TwoDimarray);
        System.out.println("ADDITION OF ALL ELEMENTS IN 2D ARRAY=> " + add);
        
        //AVERAGE LOGIC
        double average=avg(TwoDimarray,add);
        System.out.println("AVERAGE OF ALL ELEMENTS IN 2D ARRAY=> " + average);

        

        
    }

    /**
     * RETURN ADDITION OF ALL ELEMETNS IN 2D ARRAY IN LONG DATATYPE
     * @param TwoDimarray
     * @return
     */
    public static long sum(int[][] TwoDimarray)
    {
        int i=0;
        int sum=0;
        while(i<TwoDimarray.length)
        {
            int j=0;
            while(j<TwoDimarray[i].length)
            {
                //ADD
                //WHEN ROW IS 0 AND COLUMN IS 0 ,WHEN ROW IS 0 AND COLUMN IS 1
                // 0+1,1+2,
                //3+3,6+4
                sum=sum+TwoDimarray[i][j];
                j++;
            }
            i++;
        }
        return sum;

    }

    /**
     * RETURN AVERAGE OF ALL ELEMENTS IN 2D ARRAY IN LONG DATATYPE
     * @param TwoDimarray
     * @param add
     * @return
     */
    public static double avg(int[][] TwoDimarray,long add){
        int i=0;
        double size=0;

        //IF USER HAS NOT ENTER ANY VALUE IN ROWS AND COLUMNS 
        if(TwoDimarray.length==0)
        {
            return 0;
        }

        //size=size+TwoDimarray[i].length;
        //DIMENSIONS ARE TWO ROWS AND TWO COLUMNS {{1,2},{3,4}}
        //IF THERE ARE TWO ROWS AND TWO COLUMNS
        //THIS MEANS IT ADDS 0 WITH (0TH)ROW LENGTH THEN WITH (1ST)ROW LENGTH
        //THUS WE CAN GET SIZE
        //OR WE CAN DO IS int rows=ARRAY.LENGTH THIS WILL GIVE U NUMBER OF ROWS THAT FOR THIS IS 2 ROWS
        //THEN int cols=ARRAY[0].LENGTH THIS WILL GIVE HOW MANY COLUMND PRESENT IN EACH ROW THAT IS 2 COLUMNS
        //THEN MULTIPLY ROWS AND COLUMNS TO GET SIZE
        while(i<TwoDimarray.length)
        {
            size=size+TwoDimarray[i].length;
            i++;
        }
        double average=add/size;
         return average;
    }
}
