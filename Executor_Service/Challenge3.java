
import java.util.*;
import java.util.concurrent.*;


//FIRST OF ALL IMPLEMENT CALLABLE INTERFACE AND DEFINE RETURN DATATYPE CALLABLE<> IN IT 
//ALWAYS REMEMBER IT RETURNS INTEGER WHICH IS OBJECT(WRAPPER CLASS)
class PrintFactorialResullt implements Callable<Integer>
{
    //DECALRE NUMBER
    public int number;

    //CONSTRUCTOR TO SET NUMBER
    public PrintFactorialResullt(int number)
    {
        this.number=number;
    }

    //MAKE CALL METHOD AND OVERRIDE IT
    @Override
    public Integer call() throws InterruptedException
    {
        //HERE THREAD.SLEEP() THROWS CHECKED EXCEPTITION 
        Thread.sleep(2000);

        //FACTORIAL CALCULATION LOGIC
        //HERE IT RETURNS RESULT WHICH IS IN OBJECT FORM
        if(number<=1)
        {
            return 1;
        }
        int result=1;
        for (int i = 2; i<=number; i++) 
        {
            result=result*i;
        }
        return result;
    }
}

public class Challenge3 
{
    /*
     * .Write a program that uses an executor service to execute multiple Callable tasks. 
     * Each task should calculate and return the factorial of a number provided to it. 
     * Use Future objects to receive the results of the calculations. 
     * After all tasks are submitted, retrieve the results from the futures, 
     * print them, and ensure the executor service is shut down correctly.
     */

     public static void main(String[] args)
     {
        //CREATE A EXECUTOR SERVICE FOR MULTIPLE THREADS
        //AND KEEP IT IN TRY WITH RESOURCES METHOD
        try(ExecutorService service=Executors.newFixedThreadPool(2))
        {
            //MADE A LIST TO STORE FUTURE OBJECTS
            //AS service.submit(task) GETS FUTURE OBJECTS  AS RETURN
            //THEN THAT FUTURE OBJECTS ARE STORED IN LIST
            //AND IN LIST WE NEED TO DEFINE THE CLASS_DATATYPE OF STORED OBJECTS "Future<Integer>" AS LIST IS A COLLECTION
            //LIST<DATAYPE_OF_OBJECTS_STORED> AS Future<Integer> IS A CLASS OF RETURN FUTURE_OBJECTS
            List<Future<Integer>> list=new LinkedList<Future<Integer>>();

            //CREATE A TASK AND SUBMIT THIS TASK TO SERVICE
            //ADD RETURN OBJECTS IN LIST
            for (int i = 0; i < 10; i++) 
            {
                Callable task=new PrintFactorialResullt(i);
                list.add(service.submit(task));
                
            }
    
            //NOW TRAVERSE EACH OBJECT IN A LIST
            //AND CALL.GET() METHOD TO GET THE VALUE
            for(Future<Integer> task:list)
            {
                System.out.println("RESULT IS:- " + task.get());
            }

            service.shutdown();
            if(!service.awaitTermination(5,TimeUnit.SECONDS))
            {
                service.shutdownNow();
                System.out.println("Forcefully terminated");
            }
            else
            {
                System.out.println("Ur services gets completed within given seconds");
            }

        }
        catch(InterruptedException|ExecutionException e)
        {
            System.out.println("UR ERROR IS:- " + e.getMessage());
        }
     }
}
