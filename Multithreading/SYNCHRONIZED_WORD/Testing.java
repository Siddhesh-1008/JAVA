package SYNCHRONIZED_WORD;
public class Testing 
{
    public static void main(String[] args) throws InterruptedException
     {
        //CREATING COUNTER CLASS OBJECT
        Counter counter=new Counter();

        //PASSING COUNTER CLASS OBJECT TO CONSTRUCTOR OF UpdateCounter(counter) CLASS
        Runnable UpdateCounter=new UpdateCounter(counter);

        //CREATING THREAD AND PASSED RUNNABLE OBJECTS TO IT
        Thread t1=new Thread(UpdateCounter);
        Thread t2=new Thread(UpdateCounter);

        //START THE THREAD NOW SIMUNTANEOUSLY THIS THREAD IT WILL RUNFOR A WHILE
        //AS WE HAD USED SYNCHRONIZED KEY WORD ON RUN METHOD IN COUNTER CLASS ONLY ONE THREAD WILL ACCESS RUN METHOD AT A TIME
        //AND COMPLETE THE INCREMENT THEN NEW THREAD WILL ACCESS RUN METHOD
        t1.start();
        t2.start();

        //Waiting for Threads to Complete: Without join(), the main thread might reach the System.out.println("UR FINAL COUNT VALUE IS:- "+counter.getCountValue()); line before t1 and t2 have finished updating the counter. 
        //This could lead to printing an incorrect or incomplete final count value.
        t1.join();
        t2.join();

        System.out.println("UR FINAL COUNT VALUE IS:- "+counter.getCountValue());

    }
    
}
