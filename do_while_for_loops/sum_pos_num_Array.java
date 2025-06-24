public class sum_pos_num_Array{
    public static void main(String[] args) {
        System.out.println("WELCOME TO ADDING POSITIVE NUMBERS IN AN ARRAY:- ");
        int[] array=ArrayUtility.inputArray();
        int result=sum_all_pos(array);
        System.out.println("ADDITION OF ALL POSITIVE NUMBERS IN AN ARRAY:- " + result);
    }
    
    /**
     * SKIPS NEGATIVE NUMBERS IN AN ARRAY
     * @param array
     * @return
     */
    public static int sum_all_pos(int[] array)
    {
        int pos_sum=0;
        for(int i=0;i<array.length;i++)
        {
            //SKIPS NEGATIVE NUMBERS IN AN ARRAY
            //BASICALLY SKIPS FURTHER OPERATION WHEN IT FINDS THE NEGATIVE NUMBER IN AN ARRAY
            //AFTER CONTINUE IT WILL DIRECTLY GO TO i++ AND INCREMENT THE VALUE AND THEN AGAIN CHECK THE CONDITON THEN ENTER THE LOOP
            if(array[i]<0)
            {
                continue;
            }
            pos_sum=pos_sum+array[i];
        }
        return pos_sum;
    }
}