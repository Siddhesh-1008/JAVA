
import java.util.Scanner;

public class marks_classifier 
{
    public static void main(String[] args) 
    {
        //marks>80 HIGH marks between 50 to 80 ARE MODERATE marks lower than 50
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER VALUE-");
        int marks=input.nextInt();
        //NESTED TERNARY
        String grades=marks>80?"HIGH":(marks>50?"MODERATE":"LOW");
        System.out.print("UR GRADES ARE:- "+grades);
    }
   
}

