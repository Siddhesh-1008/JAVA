
package  EXECUTOR_POOL;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor
{
    public static void main(String[] args)
    {
        //CREATE REFERENCE OF  RUNNABLE INTERFACE AND CREATE A OBJECT OF CLASS THAT IS BEEN IMPLEMETNING RUNNABLE
        Runnable task1=new Printask("*");
        Runnable task2=new Printask("#");

        //Executors.newSingleThreadExecutor() retruns AN OBJECT OF ExecutorService CLASS
        //THIS THREAD POOL EXECUTOR THREAD POOL  HAS ONLY ONE THREAD IN IT
        ExecutorService service=Executors.newSingleThreadExecutor();

        //service.submit(task1)  BASICALLY ADDS TASK TO TASK QUEUE AND TEHN TASK QUEUE SUBMIT EACH TASK TO THREAD TO EXECUTE
        //AS ONLY ONE THREAD IS PRESENT TASK QUEUE SUBMITS FIRST TASK TO THREAD 1 
        //AND THEN THAT THREAD WILL EXECUTE THE TASK1 ONCE IT GETS COMPLETED 
        // THEN SECOND TASK WILL GO TO THREAD AND THEN IT WILL EXECUTE IT AND THE PROCESS GOES ON AND ON 
        service.submit(task1);
        service.submit(task2);

        //SHUTDOWN THE SERVICE
        service.shutdown();
    }
    
}
