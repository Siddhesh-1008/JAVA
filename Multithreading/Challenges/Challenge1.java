package Challenges;

//THREAD 1 CREATION
class Thread1 extends  Thread
{
    //DECALRE THREADNUMBER
    private final int threadnumber;

    //CONSTRUCTOR TO SET THREADNUMBER
    public Thread1(int threadnumber)
    {
            this.threadnumber=threadnumber;
    }

    //BASICALLY IT IS OVERRIDING RUN METHOD
    public void run()
    {  
        int i=0;
        //System.out.println(Thread.currentThread().getName() + " started");
        System.out.println("THREAD "+threadnumber + " STARTED");
        while(i<=10)
        {
            System.out.println("(" +(i+1)+ ")" + " HELLO FROM THREAD " + threadnumber);
            i++;
        }
        System.out.println("THREAD "+threadnumber + " ENDED");
    }
}

//THREAD 2 CREATION
class Thread2 extends  Thread
{
    //DECALRE THREADNUMBER
    private final int threadnumber;

    //CONSTRUCTOR TO SET THREADNUMBER
    public Thread2(int threadnumber)
    {
            this.threadnumber=threadnumber;
    }

    //BASICALLY IT IS OVERRIDING RUN METHOD
    public void run()
    {
        int i=0;
        //System.out.println(Thread.currentThread().getName() + " started");
        System.out.println("THREAD "+threadnumber + " STARTED");
        while(i<=10)
        {
            System.out.println("(" +(i+1)+ ")" + " HELLO FROM THREAD " + threadnumber );
            i++;
        }
        System.out.println("THREAD "+threadnumber + " ENDED");
    }
}


public class Challenge1
{
    public static void main(String[] args) throws InterruptedException 
    {
        /*
         * Write a program that creates two threads. 
         * Each thread should print "Hello from Thread X", 
         * where X is the number of the thread (1 or 2), ten times, then terminate.
         */
        
        Thread1 t1=new Thread1(1);
        Thread2 t2=new Thread2(2);

        //IT CRATES NEW THREAD AND START IT
        t1.start();
        t2.start();
        
    }
    
}