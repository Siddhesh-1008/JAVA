package JOIN_METHOD;
public class Testing_join{
    public static void main(String[] args) throws InterruptedException
    {
        //CREATE REFERENCE OF  RUNNABLE INTERFACE AND CREATE A OBJECT OF CLASS THAT IS BEEN IMPLEMETNING RUNNABLE
        Runnable obj1=new PrintTask2("*");
        Runnable obj2=new PrintTask2("#");
        Runnable obj3=new PrintTask2("$");

        //THREAD OBJECT CREATION
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        Thread t3=new Thread(obj3);

        //STARTING THE THREAD
        t1.start();
        System.out.println("thread 1 started");
        //JOIN METHOD
        //MEANS WHEN .join() METHOD IS CALLED IT WILL PAUSE THE MAIN METHOD TO EXECUTE FURTHER THREADS
        //IT WILL COMPLETE FIRST THREAD 1 AND THEN EXECUTE FURTHER THREADS
        //ALWAYS REMEMBER join method
        t1.join();

        t2.start();
        t3.start();
    }
    
}
