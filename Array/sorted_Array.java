public class sorted_Array {
    //NOW WE HAVE TO CHECK WHETHER THE ARRAY IS SORTED IN INCREASING OR DECREASING ORDER 
    //ARRAY SORTED IN INCREASING ORDERER 1 2 5 7 8 9
    //IN THESE UR NEXT ELEMENT(2) IS GREATER THAN PREVIOUS ELEMENT(1) 
    //ARRAY SORTED IN DECREASING ORDER   53 47 23 5 1 -8
    //THIS MEANS UR NEXT ELEMENT(47) IS SMALLER THAN PREVIOUS ELEMENT(53) 
    
    public static void main(String[] args)
    {

        System.out.println("WELCOME TO ARRAY SORTING CHECK");
        System.out.print("PLEASE ENTER THE SIZE OF AN ARRAY");
        int[] array=ArrayUtility.inputArray();
        boolean inc=isIncreasing(array);
        boolean dec=isDecreasing(array);
        //NOW MAKE USE OF OR LOGICAL OPERATOR TO SEE OUT OF BOTH OF THEM WHICH IS TRUE
        //IF isIncreasing IS TRUE MEANS IT IS IN SORTED INCREASING ORDER ARRAY
        //IF isDecreasing IS TRUE MEANS IT IS IN SORTED DECREASING ORDER ARRAY
        //IN ANY ABOVE CASE ONE CONDITION MUST BE TRUE TO SAY WHTHWER THE ARRAY IS SORTED 
        if(inc || dec){
            System.out.println("SORTED ARRAY");
        }
        else{
            System.out.println("NOT A SORTED ARRAY");
        }
    }

    public static boolean isIncreasing(int[] array)
    {
        //ARRAY IS [1,2,3,4]
        /*
        length =4
         i=1     array[i]<array[i-1]    i++
         i=1     array[1]!<array[0]     i++
         i=2     array[2]!<array[1]     i++
         i=3     array[3]!<array[2]     i++
         i=4     TERMINATE              TERMINATE    THUS RETURN TRUE IT IS IN INCREASING ORDER
         
         IF   array[i]<array[i-1]  THEN AT THAT TIME IT IS NOT IN ONCREASING ORDER THIS MEANS IT CAN BE IN DECREASING ORDER
         THIS CAN OCCUR WHEN ARRAY IS[3,2,1]
         RETURN FALSE MEANS ARRAY IS NOT SORTED IN INCREASING ORDER THUS GET OUT FROM THE LOOP 
         IF ALL GOES WELL THEN IT RETURN TRUE
         */

        int i=1;
        while(i<array.length)
        {
            if(array[i]<array[i-1])
            {
                return  false;
            }
            i++;
        }
        return  true;
        
    }

    public static boolean isDecreasing(int[] array){

        //ARRAY IS [4 3 2 1]
        /*
        length =4
         i=1     array[i]>array[i-1]    i++
         i=1     array[1]!>array[0]     i++
         i=2     array[2]!>array[1]     i++
         i=3     array[3]!>array[2]     i++
         i=4     TERMINATE              TERMINATE    THUS RETURN TRUE IT IS IN DECREASING  ORDER
         IF array[i]>array[i-1] THAT MEANS ARRAY[1] IS GREATER THAN ARRAY[0] THUS ELEMENTS ARE NOT IN DECREASING ORDER
         THIS CAN OCCUR WHEN ARRAY IS [1,2,3,4]
         */
        int i=1;
        while(i<array.length)
        {
            if(array[i]>array[i-1])
            {
                return  false;
            }
            i++;
        }
        return true;
    }

}
