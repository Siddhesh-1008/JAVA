package  VARIABLES_ARGUMENTS;
public class Add
{
    //HERE IN THTIS int...a a REFERS AS ARRAY={1,2,3}
    public static void sum1(int...a)
    {
        int sum=0;
        for(int i:a)
        {
            sum=sum+i;
        }

        System.out.println("UR ADDITINO IS:- "+ sum);
    }

    //METHOD WIT ATLEAST TWO PARAMETERS PASSED
    public static void sum2(int First,int Second,int...a)
    {
        int sum=First+Second;
        for(int i:a)
        {
            sum=sum+i;
        }

        System.out.println("UR ADDITINO IS:- "+ sum);
    }

    public static void main(String...args)
    {
        /*
         * BASICALLY HERE a.sum(...a:1,2,3) WE ARE PASSING PARAMETERS 
         * WHICH ARE CONVERTED INTO  ARRAY DURING  METHOD INITIALIZATION 
         * THAT IS public static void sum(int...a)WHEREint...a a REFERS AS ARRAY={1,2,3}
         * NOW HOW MANY NUMBERS(PARAMETERS) U PASSED IT WILL PERFORMED ADDITION OPERATION ON IT WITHOUT CREATING N MEHTODS FOR N PARAMETERS U ARE PASSING AS WE DO IN METHOD OVERLOADIN
         */
        Add a=new Add();
        a.sum1(1,2,3);
        
        //IF WE WANT FIRST PASSED ATLEAST TWO PARAMETERS THEN CONSIDER AS MANY PARAMTERES U WANT
        //AND ALWAYS REMEMBER PLACEMENT OF VAR_ARGS "a.sum2(First:1,Second:2,...a:3);" MUST BE AT LAST  
        a.sum2(1,2,3);

    }
}