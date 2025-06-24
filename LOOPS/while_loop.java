import java.util.Scanner;

public class while_loop{
    /**
     * METHOD HOW TO USE WHILE LOOP
     * @param args
     */
    public static void main(String[] args) {
        int num=1; //INITIALIZATION
        while(num<10){
            System.out.println("UR NUMBER IS=>"+num);//LOGIC
            num=num+1;//UPDATION
            //num=num-1; FOR DECREMENT
        }

        //TAKE THREE NUMBERS FROM USER CONTINUOUSLY
        int i=0; 
        Scanner input=new Scanner(System.in);
        while(i<3)
        {
           System.out.println("ENTER THE NUMBER");
           int value=input.nextInt();
           System.out.println("NUMBER IS:-"+value);
           i=i+1;
        }
    }
}