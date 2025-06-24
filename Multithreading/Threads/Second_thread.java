package Threads;
public class Second_thread extends Thread
{
    @Override
    public void run(){
        for(int i=1;i<=10;i++)
        {
            System.out.print(i + "$ ");
        }
        System.out.println();
        System.out.println("$COMPLETED"+" AND UR THREAD IS:- "+ Thread.currentThread().getName());
    }
}
