import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("PLEASE ENTER THE YEAR");
        //CONDTION
        //DIVIDE BY 4 OR DIVIDE BY 400 THEN IT IS A LEAP YEAR
        //IF NOT DIVIDE BY 100 THEN IT IS NOT A LEAP YEAR
        int year=input.nextInt();
        // if( (year%4==0)||(year%400==0)){
        //     System.out.println(year + "IS A LEAP YEAR");
        // }
        // else if(year%100!=0){
        //     System.out.println("NOT A LEAP YEAR");
        // }
        // else{
        //     System.out.println("SOMETHING WENT WRONG");
        // }

        // if(year%400==0){
        //     System.out.println(year + "IS A LEAP YEAR");
        // }
        // else if ((year%4==0) &&(year%100!=0) ){
        //     System.out.println(year + "IS A LEAP YEAR");
        // }
        // else{
        //     System.out.println("NOT A LEAP YEAR");
        // }

        if( (year%400==0) || ( (year%4==0)&&(year%100!=0) ) ){
            System.out.println(year + "IS A LEAP YEAR");
        }
        else{
            System.out.println("NOT A LEAP YEAR");
        }
   
    }
}
