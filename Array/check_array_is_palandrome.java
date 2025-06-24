public class check_array_is_palandrome {
    public static void main(String[] args) {
        //PALANDROME WHEN U REVERSE THE INPUT ARRAY IT MUST BE EQUAL TO ORGINAL ARRAY
        //ORGNL ARRAY=[1,2,1] REVERSED_ARRAY=[1,2,1] THUS PALANDROME
        //CHECK STARITNG ELEMENT IS EQUAL TO LAST ELEMENT 
        //IF IT IS NOT EQUAL THEN RETURN FLASE SAYING THAT IT IS NOT A PALANDROME
        System.out.print("ENTER THE SIZE OF AN ARRAY:- ");
        int[] arr1 =ArrayUtility.inputArray();
        boolean isPalandrome=palandrome(arr1);
        if(isPalandrome){
            System.out.println("UR ARRAY IS PALANDROME");
        }
        else
        {
            System.out.println("UR ARRAY IS NOT A PALANDROME");
        }
    }

    /**
     * PALANDROME LOGIC
     * HERE WE HAVE TRAVERSE HALF OF THE ARRAY
     * @param arr1
     * @return
     */
    public static boolean palandrome(int[] arr1)
    {
        int i=0;
        while(i<(arr1.length/2))
        {
            /*
                ARRAY=[1,2,3]   i=0  arr1[i]!=arr1[(arr1.length-1)-i   return
                ARRAY=[1,2,3]   i=0  arr1[0]!=arr1[2-0]                false
                                        1!=3   

                
                ARRAY=[1,2,1]   i=0  arr1[i]!=arr1[(arr1.length-1)-i   return
                ARRAY=[1,2,1]   i=0  arr1[0]==arr1[2] 
                                            1==1
                                            i=1
                ARRAY=[1,2,1]   i=1  arr1[1]!=arr1[1]   return
                                            2==2
                                            i=2
                THUS RETURN TRUE
             */

            if(arr1[i]!=arr1[(arr1.length-1)-i])
            {
                return false;
            }
            i++;
        }
        return true;
    }

    
    
}
