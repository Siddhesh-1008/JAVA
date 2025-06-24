package Runnable;
public class TestinRunnable
{
    public static void main(String[] args)
    {
        //CREATE REFERENCE OF  RUNNABLE INTERFACE AND CREATE A OBJECT OF CLASS THAT IS BEEN IMPLEMETNING RUNNABLE
        Runnable obj1=new Printtask("*");
        Runnable obj2=new Printtask("#");

        //THREAD OBJECT CREATION
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        //STARTING THE THREAD
        t1.start();
        t2.start();
    }
    
}
