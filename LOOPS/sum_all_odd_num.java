import java.util.Scanner;

public class sum_all_odd_num {
    /**
     * ALL CALLING FUNCTIONS COMES HERE
     * @param args
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER THE N NUMBER TILL U WANT THE SUM OF ALL ODD NUMBERS...");
        int n=input.nextInt();
        int sum_odd=oddsum(n);
        int so=oddsumlogic2(n);
        System.out.println("SUM OF ALL ODD NUMBERS.." + sum_odd);
        System.out.println("ANOTHER LOGIC");
        System.out.println("SUM OF ALL ODD NUMBERS.." +  so);
        
    }

    /**
     * LOGIC FOR SUM OF ALL ODD NUMBERS
     * @param n
     * @return
     */
    public static int oddsum(int n){
        int i=0;
        int sum=0;
        while (i<=n)
        { 
            if(i%2!=0)
            {
                //ADD PREVIOUS SUM AND AS WELL AS THE ODD NUMBER
                sum=sum+i;   
            }
            i++;
        }
        return sum;
    }

    /**
     * ANOTHER LOGIC FOR SUM OF ALL ODD NUMBERS
     * @param n
     * @return
     */
    public static int oddsumlogic2(int n)
    {
        int sum=0;
        int i=1;
        // i WILL GET INCREEMNT BY 2 
        //MEANS IF i=1 THEN i=3,5,7,9....i
        //IT MUST RUN UNTIL n
        while(i<=n){
            sum=sum+i;
            i+=2;
        }
        return sum;


    }

}
