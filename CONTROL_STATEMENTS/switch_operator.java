
import java.util.Scanner;



public class switch_operator{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER DAY IN NUMBER :- ");
        int day=input.nextInt();
        oldSwitch(day);
        newSwitch(day);

        
    }

    public static void oldSwitch(int day)
    {
        //FOR EACH CASE IT WILL CHECK user input day==1,day==2,day==3.....
        //and only equality is getting checked and not more than that
        //consition datatype must be same with case value datatype
        //if break is not written then it will execute further case seen in case 6 and 7
        switch(day){
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6://fall through
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                    System.out.println("SOMETHING WRONG IN UR DAY");
        }

    }

    public static void newSwitch(int day)
    {
        //FOR EACH CASE IT WILL CHECK user input day==1,day==2,day==3.....
        //and only equality is getting checked and not more than that
        //IF IT GETS TRUE THEN RETURN THE VALUE
        //IF WE SEE BELOW IF day==1 THEN IT RETURNS "MONDAY" WHICH GETS STORED IN VAR strDay

        String strday=switch(day)
        {
            case 1 -> "NEW MONDAY";
                
            case 2 -> "NEW TUESDAY";
                
            case 3 ->  "NEW WEDNESDAY";
                
            case 4 -> "NEW THURSDAY";
                
            case 5 -> "NEW FRIDAY";

            //FALLTHROUGH FOR CASE 6
            case 6,7 -> "HOLIDAY";
                
            default -> "SOMETHING WRONG IN UR DAY";
        };

        System.out.println("UR DAY CORREPONDING WITH UR NUMBER IS:- " + strday);
    }
    
    


}
