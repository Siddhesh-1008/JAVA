
import java.util.Scanner;



public class occurence_elem_array {
    public static void main(String[] args) 
    {   
        //GET THE NUMBER FROM USER
        //DECLARE ARRAY 
        //CALL OCCURENCE FUNCTION BY PASSING ARRAY AND THE NUMBER
        //THEN INTIALIZE COUNTER TO ZERO
        //THEN USING FOR EACH LOOP COMPARE EACH ELEMENT FROM ARRAY WITH USER INPUT NUMBER
        //IF FOUND THEN INCEREMENT THE COUNTER BY 1
        //RETURN THE COUNTS
        Scanner input=new Scanner(System.in);
        System.out.print("PLEASE ENTER THE NUMBER:- ");
        int number=input.nextInt();
        
        int[] array=new int[]{
            1,2,3,4,12,3,4
        };
        int count_number=occurence(array,number);
        System.out.println("UR NUMBER OCCURED " + count_number + " TIMES IN AN ARRAY ");
    }

    /**
     * FINDING NUMBER OF TIMES ELEMENT OCCURS IN AN ARRAY USING FOR EACH LOOP
     * @param array
     * @param number
     * @return
     */
    public static int occurence(int[] array,int number){
        int count=0;
        for(int num:array)
        {
            if(number==num)
            {
                count=count+1;
            }
        }
        return count;
    }
    
}
