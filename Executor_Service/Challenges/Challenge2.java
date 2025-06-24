package Challenges;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/*
 * FIRST OF ALL CREATE RUN METHOD()
 * TO PRINT CURRENT THREAD NAME 
 * AND ALLOW THE THREAD TO SLEEP FOR RANDOM MILLISECONDS BETWEEN 1 TO 5 
 * FOR GENRATING RANDOM MILLISECONDS THIS WE HAD CREATED GETRANDOM METHOD 
 * IN THIS RANDOM METHOD WE USED MATH.RANDOM()*5 TO GET VALUES BETWEEN 0 TO 5 WHERE 0 IS INCLUSIVE AND 5 IS EXCLUSIVE
 * THEN WE DONE MATH.CEIL TO ROUND UP THE POINTS
 * THEN WE EXPLICIT TYPE CAST IT IN INT BECAUSEMath.ceil() RETRUNS VALUES IN DOUBLE 5.0 AFTER EXPLICIT TYPECASTING IT WILL GET CONVERTED INTO 5
 * THEN IN MAIN METHOD WE CREATE MULTIHTREAD EXECUTOR AND CREATE SERVICE REFERENCE OF IT
 * AND THEN WITH THE HELP OF SUBMIT WE SUBMIT THE TASKS TO SERVEICE EXECUTOR
 * WE HAD USE TRY WITH RESOURCES TO SHUTDOWN THE SERVICE AUTOMATICALLY
 * IF THREAD ARE LESS AND TASKS ARE MORE AND IF ALL THESE SERVICES DOESNOT GET EXECUTED WITH IN THE TIME service.awaitTermination(10,TimeUnit.SECONDS)
 * IT WILL FORCEFULLY SHUTDOWN THE SERVICE 
 * CREATIN ERROR UR ERROR IS:- sleep interrupted 
 * 
 */
class Printtasks implements Runnable
{
    @Override
    public void run()
    {
        try 
        {

            System.out.println("STARTING WITH THREAD" + Thread.currentThread().getName());
            Thread.sleep(getRandom()*1000);
        } 
        catch(InterruptedException e)
        {
            System.out.println("UR ERROR IS:- " +e.getMessage());
        }
        System.out.println("ENDING WITH THREAD" + Thread.currentThread().getName());
    }

    public int getRandom()
    {
        int random_Value=(int) Math.ceil(Math.random()*5);
        return random_Value;
    }
}

public class Challenge2
{
    public static void main(String[] args) 
    {
        /*
        * Create a fixed thread pool with a specified number of threads using Executors.newFixedThreadPool(int).
        * Submit multiple tasks to this executor, where each task should print the current thread's name and sleep for a random time between 1 and 5 seconds.
        *Finally, shut down the executor and handle proper termination using awaitTermination.
        */
        try(ExecutorService service=Executors.newFixedThreadPool(2))
        {
            for (int i = 0; i < 10; i++)
            {
                Runnable tasks=new Printtasks();
                service.submit(tasks);    
            }
            if(!service.awaitTermination(10,TimeUnit.SECONDS))
            {
                service.shutdownNow();
                System.out.println("Forcefully terminated");
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        } 

        


    }


}
