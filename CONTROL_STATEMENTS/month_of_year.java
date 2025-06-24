
import java.util.Scanner;

public class month_of_year{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("PLEAS ENTER THE NUMBER");
        int num=input.nextInt();
        String monthname=monthy(num);
        System.out.println("UR MONTH:- "+ monthname);


    }

    public static String monthy(int num){
        String month=switch(num)
        {
            case 1 -> "JAN";
            case 2 -> "FEB";
            case 3 -> "MARCH";
            case 4 -> "APRIL";
            case 5 -> "MAY";
            case 6 -> "JUNE";
            case 7 -> "JULY";
            case 8 -> "AUGUST";
            case 9 -> "SEPT";
            case 10 -> "OCT";
            case 11 -> "NOV";
            case 12 -> "DEC";
            default -> "SOMETHING WENT WRONG";
        };
        return month;
    
    }
}