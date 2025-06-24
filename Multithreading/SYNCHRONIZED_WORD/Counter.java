package SYNCHRONIZED_WORD;
public class Counter 
{
    //INITALIZE COUNT TO 0
    public int count=0;

    //INCREMENT THE COUNT BY 1
    //APPLY SYNCHRONIZED KEY WORD TO THIS METHOD SO THAT ONE THREAD CAN ACCES THIS METHOD ONE AT A TIME WHILE RUNNING PARALLEL
    public synchronized void increment_counter()
    {
        this.count=this.count+1;

    }

    //METHOD TO GET THE COUNT VALUE
    public int getCountValue()
    {
        return this.count;
    }

    
}
