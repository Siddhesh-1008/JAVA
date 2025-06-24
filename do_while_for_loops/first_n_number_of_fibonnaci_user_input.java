import java.util.Scanner;

public class first_n_number_of_fibonnaci_user_input{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("PLEASE STATE HOW MANY NUMBERS U WANT FROM FIBONNACI SERIES:- ");
        int num=input.nextInt();
        //POISTION OF UR PREVIOS AND PREVIOUS TO PREVIOUS VALUE
        for(int poisition=1;poisition<=num;poisition++)
        {
            System.out.print(fibo(poisition)+ " ");
        }
    }

    public static int fibo(int poisition)
    {
        if(poisition==1)
        {
            return 0;
        }
        if(poisition==2){
            return 1;
        }

        int prev=0;
        int next=1;
        int value = 0;
        //FOR FURTHER POISITIONS ABOVE THIRD WE CAN DO THIS LOGIC MEANS FOR POISITION 3 4 5 ...
        for(int i=3;i<=poisition;i++)
        {
        value = prev + next;  // calculate next value number
        prev = next;              // move to the next numbers
        next = next+prev;
        }

        return value;
    }
}
