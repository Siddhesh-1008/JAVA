package SYNCHRONIZED_WORD;
public class UpdateCounter implements Runnable
{
        
        /*
         * BASICALLY Counter counter S A REFERENCE OF COUNTER CLASS THAT HAS BEEN PASSED IN MAIN METHOD WHICH IS IN TESTING.JAVA
         * THAT IS  Counter counter=new Counter(); Runnable UpdateCounter=new UpdateCounter(counter);
         * MEANS WE HAVE PASSED counter OBJECT TO CONSTRUCTOR 
         * AND "public UpdateCounter(Counter counter)" BASICALLY SETS THE counter
         * MEANS this.counter IS EQUALS TO Counter counter=new Counter()
         * BASICALLY WE HAVE PASSED COUNTER CLASS OBJECT SO TAHT WE CAN CALL COUNTER CLASS METHOD "increment_counter()"
         * AND THAT CAN BE CALLED ONLY BYCREATING COUNTER CLASS OBJECT "counter.increment_counter(); " AS IT IS IN ANOTHER CLASS
         */
        public final Counter counter;

        //CONSTRUCTOR
        public UpdateCounter(Counter counter)
        {
            this.counter=counter;
        }
        
        //RUN THE THREAD
        //AND CALLED COUNTER CLASS METHOD increment_counter()
        public void run()
        {
            for (int i = 0; i < 1000; i++)
            {
              counter.increment_counter();  
            }
        }



}
