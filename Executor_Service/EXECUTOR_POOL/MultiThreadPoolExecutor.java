package EXECUTOR_POOL;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiThreadPoolExecutor
{
    public static void main(String[] args) throws InterruptedException
    {
        //MULTITHREAD POOL EXECUTOR
        //NOW EACH TASKS WILL RUN PARALLELY
        ExecutorService service=Executors.newFixedThreadPool(15);

        for (int i = 0; i < 15; i++)
        {   
            //EXPLICIT TYPE CASING NUMBER TO CHAR
            Runnable task=new PrintTasks((char) i );
            service.submit(task); 
        }
        
        //BASICALLY HERE SERVICE.SHUTDOWN() DOESNOT SHUTDOWN INSTANT IT DEPENDES UPN SCHEDULER TO SHUTDOWN
        // service.shutdown();


        //BUT IF WE WANT TO FORCEFULLY SHUTDOWN THE SERVICE WE CAN MAKE USE OF THIS
        //service.awaitTermination(miiliseconds) RETURNS TRUE OR FALSE TRUE WHEN ALL TASKS GETS COMPLETED FALSE IF NOT ALL TASK GETS COMLLETED
        //service.awaitTermination(miiliseconds) basically these shutdowns the service after a particular second without seeing whether tsk has been completed or not
        if(!service.awaitTermination(10,TimeUnit.SECONDS))
        {
            service.shutdownNow();
            System.out.println("TASKS TERMINATED ");
        }
        else
        {
            System.out.println("UR TASK GETS COMPLETED IN GIVEN MILLISECOND");
        }

    }
    
}
