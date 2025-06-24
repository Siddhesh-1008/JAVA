import java.util.Scanner;

public class Tern_min{

    //NON STATIC METHOD
    public int minimumnumber(int num1,int num2){
        int minnum=num1<num2?num1:num2;
        return minnum;
    }



    public static void main(String[] args) {
        //ALWAYS REMEMBER WE CAN ONLY USE STATIC VARIABLE IN STATIC MEHTOD
        //BUT TO USE INSTANCE METHOD OR VARIABLE U NEED TO CREATE OBJECT AND THEN USE IT

        Scanner input=new Scanner(System.in);
        System.out.print("ENTER FIRST NUMBER:-");
        int num1=input.nextInt();
        System.out.print("ENTER SECOND NUMBER:-");
        int num2=input.nextInt();
        //CREATE OBJECT TO ACCESS INSTANCE(NON STATIC)METHODS IN STATIC METHOD
        Tern_min min=new Tern_min();
        int result=min.minimumnumber(num1,num2);
        System.out.println("UR MINIMUM NUMBER IS:- "+ result);


    }
}
