package Threads;
public class Need_of_multithreading
{
   
    public static void main(String[] args) 
    {
        long starttime=System.currentTimeMillis();
        for(int i=1;i<=100;i++)
        {
            System.out.print(i + "# ");
        }
        System.out.println();
        System.out.println("# COMPLETED");

        for(int i=1;i<=100;i++)
        {
            System.out.print(i + "$ ");
        }
        System.out.println();
        System.out.println("$ COMPLETED");

        for(int i=1;i<=100;i++)
        {
            System.out.print(i + "* ");
        }
        System.out.println();
        System.out.println("* COMPLETED");

        long endtime=System.currentTimeMillis();
        long val=endtime-starttime;
        System.out.println("TOTAL TIME TAKEN TO COMPLETE THE CODE IS:- " + val);

    }
    
}
