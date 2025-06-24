

public class sum_and_Average{
    /**
     * FIRST ACQUIRE UTILTY CLASS AND THEN CALL AVERAGE AND SUM FUNCTION
     * @Test
    public void test() {
        
    } */
    public static void main(String[] args) {
        //ENTER THE SZIE OF ARRAY
        System.out.print("ENTER THE SIZE OF AN ARRAY:-");

        //MAKE USE OF UTILTYCLASS  TO GET THE ELEMENT THAT ARE IINSERTED IN THE ARRAY
        //WE HAD DEFINE DATATYPE int[] inputArr AS UTILITY CLASS IS RETURNING ARRAY WITH DATA TYPE INT
        int[] inputArr=ArrayUtility.inputArray();
        //System.out.println(inputArr[0]+","+inputArr[1]);

        //call sum function
        long sum_Of_All_Num=sum_Of_All_Num(inputArr);
        System.out.println("SUM OF ALL ELEMENTS IN AN ARRAY:- " + sum_Of_All_Num);

        //call average function
        double average_of_all_num=average_of_all_num(inputArr);
        System.out.println("AVERAGE OF ALL ELEMENTS IN AN ARRAY:-"+average_of_all_num);
    }

    /**
     * 
     * LOGIC FOR CALCUALTING SUM OF ALL ELEMENTS IN AN ARRAY
     * HERE RETURN TYPE IS LONG MEANS sum WILL HAVE ARRAY HAVING DATATYPE LONG 
     * @param inputArr
     * @return
     */
    public static long sum_Of_All_Num(int[] inputArr){
        int i=0;
        int sum=0;
        while(i<inputArr.length){
            sum=sum+inputArr[i];
            i++;
        }
        return sum;
    }

    /**
     * CALCAULTE AVERAGE OF ALL ELEMENTS IN AN ARRAY
     * HERE sum_Of_All_Num(inputArr)WILL RECEIVE ARRAY(sum) WITH DATATYPE LONG NOW WE STORE THAT long value IN DATATYPE double
     * double average=(sum/inputArr.length); HERE WE ARE STORING AVERAGE IN DOUBLE AND THEN PASSING TO average_of_all_num()CALL FUNCTION
     * @Test
    public void test() {
        
    } */
    public static double average_of_all_num(int[] inputArr){
        double sum=sum_Of_All_Num(inputArr);
        double average=(sum/inputArr.length);
        return  average;
    }
}