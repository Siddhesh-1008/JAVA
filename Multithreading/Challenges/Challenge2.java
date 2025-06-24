package Challenges;

class TEST extends Thread
{
    @Override
    public void run()
    {
        try
        {
            Thread.sleep(2000);
            System.out.println("UR THREAD STATE IS:- "+ Thread.currentThread().getState());
        }
        catch(InterruptedException e)
        {
            System.out.println("ERROR IS:- "+ e.getMessage());
        }
    }
}

public class Challenge2 
{
    /*
     * Write a program that starts a thread and prints its state after each significant event (creation, starting, and termination).
     * Use Thread.sleep() to simulate long-running tasks and Thread.getState() to print the thread's state.
     * STATES:- NEW->RUNNABLE->RUNNING->TERMINATION
     * DEFINE Thread.sleep() AND Thread.currentThread().getState() IN RUN METHOD
     * FIRST OF ALL CREATE TEST CLASS THAT EXTENDS THREAD CLASS
     * IN THAT TEST CLASS CREATE RUN METHOD AND IN THAT TRY CATCH METHOD FOR HANDLING  InterruptedException THAT HAS BEEN GIVEN BY Thread.sleep()
     * THREAD.CURRENTTHREAD.STATE() USED TO DEFINE THE STATE OF THE THREAD IN RUN METHOD IT IS RUNNABLE STATE
     * THEN IN MAIN THREAD CREATE A OBJECT OF THREAD AND START THE THREAD 
     */

    public static void main(String[] args) throws InterruptedException
    {
        TEST t1=new TEST();
        System.out.println("UR THREAD STATES IS:- "+ t1.getState());
        t1.start();
        t1.join();
        System.out.println("UR THREAD STATES IS:- "+ t1.getState());

     }



}
