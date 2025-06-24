
import java.util.Scanner;

public  class Mul_table{
    /**
     * CODE FOR CALL
     * @param args
     */
    public static void main(String[] args) {
        //BASICALLY readNumber() GET THE VALUE THAT HAS BEEN RETURNED BY THESE FUNCTION readNumber()
        int val=readNumber();
        //THEN PASS VAL AS AN ARGUMENT TO multab() Function
        multab(val);
    }

    /**
     * THIS METHOD IS UED FOR READING NUMBER AND THEN RETURN VALUE TO CALLED FUNCTION
     * @return
     */
    public  static int readNumber()
    {
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER FOR WHICH U WANT TABLE...");
        int num=input.nextInt();
        return num;

    }

    /**
     * THIS METHOD IS FOR MULTIPLICATION OPERATIONS
     * @param val
     */
    public static void multab(int val)
    {
        int i=1;
        while(i<11){
            int result=val*i;
            System.out.println(val +"*"+i+"="+result);
            i++;
        }
    }
}