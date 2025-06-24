package  Challenges;
class Start_ending_of_threads extends Thread
{
    public  void run()
    {
        System.out.println("YOUR " + Thread.currentThread().getName() + " HAS STARTED");
        
        try 
        {
            //LET THE THREAD TO SLEEP FOR 2 SECONDS
            Thread.sleep(2000);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }

        System.out.println("YOUR " + Thread.currentThread().getName() + " HAS ENDED");
        System.out.println();
    }
}

public class Challenge3 {
    /*
     * Create three threads. 
     * Ensure that the second thread starts only after the first thread ends and the third thread starts only after the second thread ends using the join method. 
     * Each thread should print its start and end along with its name.
     * CREATE THREE OBJECTS OF THREAD
     * THEN START THE THREAD
     * IN RUN METHOD FIRST PRINT THREAD HAS BEEN STARTED WITH ITS NAME
     * THEN MAKE THREAD TO SLEEP FOR SOME SECONDS
     * THEN AGAIN PRINT THREAD HAS BEEN ENDED WITH ITS NAME
     */

     public static void main(String[] args) throws InterruptedException
     {
        Start_ending_of_threads t1=new Start_ending_of_threads();
        Start_ending_of_threads t2=new Start_ending_of_threads();
        Start_ending_of_threads t3=new Start_ending_of_threads();

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        
     }

}
