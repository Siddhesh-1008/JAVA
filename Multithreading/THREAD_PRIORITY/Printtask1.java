package THREAD_PRIORITY;
public class Printtask1 implements Runnable
{

    /*
     * FIRST OF ALL CURRENT CLASS IMPLEMENT RUNNABLE
     * OVERRIDE RUN METHOD
     * CREATE A CONSTRUCTOR OF CLASS AND SET THE STRING CHARACTER TO IT
     * THEN IN MAIN THREAD CREATE A  REFERENCE OF RUNNABLE INTERFACE AND CREATE A OBJECT OF CLASS THAT IMPLEMENTS RUNNABLE
     * THEN CREATE A THREAD OBJECT FOR IT AND PASSED RUNNABLE OBJECT TO IT
     * THEN START THE THREAD
     */
    @Override
    public void run()
    {
        //STARITNG TOME OF THREAD
        long starttime=System.currentTimeMillis();

        for(int i=1;i<=10;i++)
        {
            System.out.print(i + this.character + " ");
        }

        //END TIM OF THREAD
        long endtime=System.currentTimeMillis();
        //TOTAL TIME TAKEN FOR A THREAD TO COMPLETE
        long val=endtime-starttime;

        System.out.println();
        System.out.println(this.character + "COMPLETED" +"AND TIME TAKEN TO COMPLETED IS:- "+ val +" AND UR THREAD IS:- "+ Thread.currentThread().getName());

    }

    //INSTANCE ATTRIBUTE
    String character;

    //CONSTRUCTOR
    public Printtask1(String character)
    {
        this.character=character;
    }


}
