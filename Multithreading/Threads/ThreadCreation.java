package Threads;
public class ThreadCreation
 {
    /*
     * THREAD IS A NORMAL CLASS THAT CAN EXTEND BY ANY OTHER CLASS
     * FIRST CREATE THREE CLASSES EACH CLASS MUST EXTEND THREAD CLASS
     * IN EACH CLASS WE NEED TO OVERRIDE RUN METHOD OF THREAD CLASS
     * AND IN MAIN THREAD WE start() EACH THREAD
     */
   public static void main(String[] args) 
   {
      long startTime=System.currentTimeMillis();

      //MAKING OBJECT OF EACH CLASS
      First_thread t1=new First_thread();
      Second_thread t2=new Second_thread();
      Third_thread t3=new Third_thread();

      //TO START THE THREAD
      t1.start();
      t2.start();
      t3.start();

      long endTime=System.currentTimeMillis();
      long val=endTime-startTime;
      System.out.println("TOTAL TIME TAKEN TO COMPLETE THE CODE IS:- " + val +" AND UR THREAD IS:- "+ Thread.currentThread().getName());
      
   }


    
    
}
