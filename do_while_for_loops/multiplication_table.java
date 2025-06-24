import java.util.Scanner;
public class multiplication_table
{
    public static void main(String[] args) 
    {
        //GET NUMBER 
        //CREATE OBJECT "new multiplication_table();" TO ACCESS INSTANCE METHOD "public void table(int num)" IN STATIC METHOD "public static void main(String[] args)"
        //CALL THE INSTANCE METHOD
        //CREATE LOGIC FOR MULTIPLICATION 
        //PRINT THE TABLE
        Scanner input=new Scanner(System.in);
        System.out.print("PLEASE PRINT TABLE OF GIVEN NUMBER:- ");
        int num=input.nextInt();

        //ACCESISNG INSTANCE METHOD IN STATIC METHOD USING OBJECT
        multiplication_table mul=new multiplication_table();
        mul.table(num);
    }

    /**
     * INSTANCE METHOD FOR MULTIPLICATION LOGIC
     * @param num
     */
    public void table(int num){
        int val;
        for(int i=1;i<=10;i++)
        {
            val=num*i;
            System.out.println(num + "*" + i +"=" + val);
        }
        
    }

}
