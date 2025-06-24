package THREAD_PRIORITY;
public class Test 
{
    public static void main(String[] args)
    {
        //CREATE REFERENCE OF  RUNNABLE INTERFACE AND CREATE A OBJECT OF CLASS THAT IS BEEN IMPLEMETNING RUNNABLE
        //STARTING THREAD HAS NUMBER 0 
        Runnable obj1=new Printtask1("*");
        Runnable obj2=new Printtask1("#");

        //THREAD OBJECT CREATION
        Thread t1=new Thread(obj1);

        //SETTING THREAD PRIORITY
        t1.setPriority(Thread.MIN_PRIORITY);
        Thread t2=new Thread(obj2);

        //SETTING THREAD PRIORITY
        t2.setPriority(Thread.MAX_PRIORITY);


        //STARTING THE THREAD
        t1.start();
        t2.start();
    }
    
}