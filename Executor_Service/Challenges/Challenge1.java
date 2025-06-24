package Challenges;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//IMPLEMENTS RUNNABLE INTERFACE  FOR CREATING THREAD
class Task1 implements Runnable
{

    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getName() + " HAS BEEN STARTED");
        int i=1;
        while(i<=10)
        {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        System.out.println(Thread.currentThread().getName() + " HAS BEEN ENDED");

    }
}

public class Challenge1
{
    public static void main(String[] args)
    {
     /*
     * Write a program that creates a single-threaded executor service. 
     * Define and submit a simple Runnable task that prints numbers from 1 to 10. 
     * After submission, shut down the executor.
     */

    //WE HAD try(){BLOCK CODE}catch(Exception e){}
    //WE HAD USED TRY WITH RESOURCES SO THAT WE CAN AUTOMATICALLY SHUTDOWN THE EXECUTORSERVICE service OBJECT
    //CREATE A SINGLE THREAD EXECUTOR FOR SINGLE THREAD 
    try(ExecutorService service=Executors.newSingleThreadExecutor()) 
    {
        //CREATE A TASK1 REFERENCE FOR RUNNABLE INTERFACE AND STORE TASK1 CLASS OBJECT IN IT
        Runnable task1=new Task1();
        
        //SUBMIT THE TASKS TO EXECUTOR SERVICE
        service.submit(task1);
    } 
    catch (Exception e)
    {
        System.out.println("ERROR MESSAGE :-" + e.getMessage());
    }

    }




}