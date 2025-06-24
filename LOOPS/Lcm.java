public class Lcm
{
    public static void main(String[] args) 
    {
        //FIND NUMBER THAT GET DIVIDED BY TWO NUMBERS
        //LOGIC OF LCM
        //MULTIPLES OF FIRST NUMBER RESULT(result=number*i) MODULUS OF SECOND NUMBER(number2) 
        //THAT IS (result%second==0)
        //(result%second==0) MUST BE EQUAL TO ZERO THEN THAT MUTILPLE VALUE IS LCM FACTOR
        //LCM OF 15 AND 20 IS 60
        //MEANS
        //15 MUTIPLE TILL 15*1,15*2,15*3...15*20
        //15,30,45,60...300
        //15%20!=0,30%20!=0,45%20!=0,60%20==0...
        //THUS WE CAN SAY THAT 60 IS A LEAST COMMON FACTOR OF 15 AND 20
        int num1=15;
        int num2=20;
        int result=least_common_factor(num1,num2);
        System.out.println("LEAST COMMON FACTOR:- "+result);
        int result1=least_common_fact(num1,num2);
        System.out.println("LEAST COMMON FACTOR:- "+result1);

    }

        public static int least_common_factor(int num1,int num2)
        {
            int i=1;
            while(i<=num2)
            {
                //MULTIPLE OF NUM1 TILL NUM2 MEANS num1*num2=value... TILL num2 GETS EQUAL TO SEOCND NUMBER
                int fact=num1*i;
                if (fact%num2==0)
                {
                    return fact;
                }
            i++;
            }
            //UNREACHABLE 
            //THIS RETURN fact IS FOR WHILE LOOP
            //BECAUSE AFTER COMPLETING WHILE LOOP COMPILER DOESNT UNDERSTAND WHAT TO RETURN THATS WHY WE RETUN 0 BUT THIS RETURN IS NOT REACHABLE  
            return 0;
        }

        public static int least_common_fact(int num1,int num2)
        {
            int i=1;
            //INFINITE LOOP
            //BUT WHEN IF CONDITION HAS MET THEN RETURN THE VALUE AND GET OUT OF LOOP
            while(true)
            {
                int fact=num1*i;
                if (fact%num2==0)
                {
                    return fact;
                }
                i++;
            }
        }
}
