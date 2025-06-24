import java.util.Scanner;

public class max_value_Array {
    public static void main(String[] args) 
    {
        //FIRST SET MAX TO MOST SMALLEST NUMBER
        //THEN COMPARE IT WITH EVERY NUMBER OF THE ARRAY USING FOR EACH LOOP
        //THEN COMPARED MAX WITH EVERY NUMBER IN AN ARRAY IF MAX IS SMALLER THEN UPDATE WITH THE RECENT ELEMENT OF THE ARRAY
        //RECENT ELEMENT OF THE ARRAY MEANS WHICH IS BIGGER THAN MAX
        Scanner input=new Scanner(System.in);
        System.out.println("WELCOME TO MAX VALUE FINDER IN AN ARRAY");
        int[] array=new int[]{
            11,2,45,4,5
        };
        int max_elem=max(array);
        System.out.println("MAXIMUM VALUE IN AN INTEGER ARRAY IS :- " + max_elem);
    }

    /**
     * MAX LOOGIC FOR FINDING LARGEST NUMBER IN ARRAY USING FOR EACH LOOP
     * @param array
     * @return
     */
    public static int max(int[] array){
        int max=Integer.MIN_VALUE;
        //MAKE USE OF FOR EACH LOOP TO COMPARE MAX WITH EACH ELEMENT OF AN ARRAY
        for(int num:array){
            if(max<num)
            {
                //STORE THE LARGEST NUMBER IN MAX
                max=num;
            }
        }
        return max;
        
    }
}
