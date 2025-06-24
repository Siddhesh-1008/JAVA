package RETURN_FUTURES;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Server
{
    //FOR FETCHING FULLL NAME BY GIVING THE STARTNG NAME
    public String get_full_name(String name)
    {
        if(name.equals("Siddhesh"))
        {
            return name + " Prakash Sawant";
        }
        else if(name.equals("Rahul"))
        {
            return name + "Pote";
        }
        else
        {
            return "NOT FOUND";
        }
        
       
    }
}

//CALLABLE METHOD USED WHEN WE NEED TO RETURN VALUE FROM THREAD
class PrintingName extends Server implements Callable<String>
{
    //DECALRE STRING ATTTRIBUTE
    String starting_name;

    //CONSTRUCTOR FOR SETTING STARTING NAME
    public PrintingName(String starting_name)
    {
        this.starting_name=starting_name;
    }


    //CALL METHOD TO RUN THE THREAD
    @Override
    public String call() throws InterruptedException
    {
        System.out.println("THREAD STARTED AND FETCHING ALSO GET STARTED");
            Thread.sleep(2000);

            //GETTING FULL NAME FROM SERVER 
            //AS WE HAD EXTEND PARENT CLASS SERVER SO WE CAN EXTEND IT AND ACCESS IT USING super.parent_Class_method_name()
            String fullname=super.get_full_name(this.starting_name);

            //RETURN STRING
            return fullname;

    }

}


public class TestingFuture 
{
    public static void main(String[] args) throws InterruptedException, ExecutionException 
    {
        //CREAT THREAD POOL OF MULTIPLE THREADS
        ExecutorService service=Executors.newFixedThreadPool(2);
        
        //CREATE REFERNCE OF CALLABLE INTERFACE AND STORE CLASS OBJECT IN TI
        //HERE WE ARE PASSING STARTING NAME TO PRINTINGNAME CONSTRUCTOR
        Callable task1=new PrintingName("Siddhesh");
        Callable task2=new PrintingName("");

        /*
         * service.submit() RETRUNS FUTURE OF SAME DATAYPE THAT HAS BEEN DEFINED IN CALLABLE INTERFACE CALLABLE<RETURN _DATATYPE>
         * HERE SERVICE.SUBMIT() WILL RETURN VALUE AFTER SOME TIME (IN FUTURE) TILL THT STOREE IT AS A PROMISE IN future
         */
        Future<String> future1=service.submit(task1);
        //.get() METHOD TO GET THE PROMISE VALUE(FURTURE VALUE)
        System.out.println("UR FULL NAME FROM SERVER:- " + future1.get());
        
        Future<String> future2=service.submit(task2);
        System.out.println("UR FULL NAME FROM SERVER:- " + future2.get());

        service.shutdown();



    }
}
