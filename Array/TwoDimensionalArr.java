public class TwoDimensionalArr
{
    public static void main(String[] args) 
    {
        //DECALRING TWO ARRAY SPACE IN RAM
        int[][] array=new int[2][3];
        array[0][1]=9;

        //ADDING VALUES
        //INSIDE ARRAYS REPRESENT NUMBER OF ARRAYS
        //NO OF VALUES PRESENT INSIDE THE ARRAYS REPRESNT NUMBER OF COLUMNS
        //{{1,2,3},{4,5,6},{7,8,9}} THREE ROWS AND THREE COLUMNS
        //{{1,2},{4,5},{7,8}} THREE ROWS AND TWO COLUMNS
        //CAN BE ACEESED ACCORDINGLY arr[0][1] 0TH ROW  1ST COLUMN THAT IS 2
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("ACCESS VALUES-> " + arr[0][1]);
        System.out.println("DEFINING LENGHT OF EACH ARRAY-> " + arr[0].length);

        //TO GET TWO DIMENSIONAL ARRYA FORMAT
        int i=0;
        System.out.println("TWO DIMENSIONAL ARRAY");
        //WHILE LOOP WILL TRAVERSE(show)EACH ROW
        //arr.length DETERMINES NUMBER OF ROWS
        while(i<arr.length)
        {
            int j=0;
            //THIS LOOP FOR GETING VALUES FROM EACH ROW
            while(j<arr[i].length)
            {
                System.out.print(arr[i][j] + " ");
                j++;
            }
            System.out.println();
            //
            i++;
        }
    }
}
