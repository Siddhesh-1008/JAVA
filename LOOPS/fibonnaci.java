
import java.util.Scanner;

public class fibonnaci {
    public static void main(String[] args) {
        //HERE WE HAD TO FIND FIBONNAIC SERIES TILL A PARTICULAR NUMBER MEANS
        //IF USER INPUT IS 15 THEN WE NEED TO FIND ALL FIBONACCI SERIES(NUMBER) BEFORE 15
        //THAT CAN BE 0,1,1,2,3,5,8,13
        //fibonaci series  0,1,1,2,3,5,8,13
        //NEXT VALUE MUST BE SMALLER THAN INPUT NUMBER GIVEN BY USER
        //AGAR PREV=0 NEXT=1 VAL=PREV+NEXT=0+1=1,1+1=2,1+2=3
        //prev=next  1,1,2
        //next=val   1,2,3
        //BASICALLY IT STATES ADD LAST PREVIOUS TWO NUMBERS AND STOP WHEN  UR NEXT NUMBER IS SMALLER THAN GIVEN INPUT NUMBER
        //0,1 HERE PREV=0,NEXT=1
        //0,1,1  HERE PREV=0 NEXT=1 THEN PREV=1 NEXT=1 AND SO ON
        Scanner input=new Scanner(System.in);
        System.out.print("PLEASE ENTER THE NUM TILL U WANT FIBONNAIC SERIES:-");
        int num=input.nextInt();
        fibonaci(num);
    }
    /**
     * LOGIC FOR FIBONNACI SERIES
     * @param num
     */
    public static void fibonaci(int num){
            if(num<0){
                //NOT RETURN ANY VALUE
                return;
            }
            System.out.print("0 ");
            if(num==0){
                return;
            }
            int val;
            int prev=0;
            int next=1;
            //OR int prev=0,next=1;
            while(next<num){
                System.out.print(next+" ");
                val=prev+next;
                prev=next;
                next=val;
            }
    }
}
