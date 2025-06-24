public class GCD {
    public static void main(String[] args) 
    {
        //FIND THE GREATEST NUMBER THAT DIVIDES BOTH NUMBERS
        //GCD OF TWO PRIME NUMBERS ARE 1  MEANS 1 CAN BE DIVIDED BY BOTH NUMBERS
        //GCD OF 15 AND 20 IS 5
        //THIS MEANS DIVIDING 15 BY 5 IS ZERO AND DIVIDING 20 BY 5 IS ZERO
        int num1=15;
        int num2=20;
        int result=greatest_common_factor(num1,num2);
        System.out.println("GREATEST COMMON FACTOR:- "+result);
    }

    public static int greatest_common_factor(int num1,int num2)
    {
        int gcd=1;
        //IF BELOW LOOP DOESNOT RETURN ANSWER THEN RETURN 1 AS NUMBERS WILL BE PRIME NUMBERS
        //START FROM SECOND NUMBER
        int i=2;
        //FIND THE SMALLEST NUMBER AMONG 2
        int least=least(num1,num2);
        //NOW SEE THAT BOTH NUMBERS(5,20) MUST BE DIVIDED BY N NUMBER THAT COMES IN RANGE BETWWEN i<=least
        // AFTER DIVIDING WE FIND THAT THERE IS 1 AND 5 NOW FIND HIGHEST AMONG THME THAT IS 5
        //5 AND 20 
        //5%1==0,5%2!=0,5%3!=0,5%4!=0,5%5==0
        //20%1==0,20%2==0,20%3!=0,20%4==0,20%5==0
        //THUS WE CAN SAY THAT WE HAVE TWO NUMBERS THAT IS 1 AND 5 WHICH DIVIDE BOTH NUMBERS THUS MAX FROM IT IS 5
        while(i<=least)
        {
            if((num1%i==0)&&(num2%i==0))
            {
                return i;
            }
            i++;
        }
        return gcd;
    }

    /**
     * FINDING LEAST NUMBER AMONG TWO NUMBERS
     * @param num1
     * @param num2
     * @return
     */
    public static int least(int num1,int num2)
    {
        if(num1<num2)
        {
            return  num1;
        }
        else
        {
            return num2;
        }
        
    }
}
