package  Challenges;

//CREATE ENUM CLASS TO DECLARE DIFFERENET CONSTANTS
enum Trafficcolor{
    //CONSTANTS
    GREEN(7000),
    YELLOW(5000),
    RED(2000);

    //DECLARE MILLISECONDS
    public int millisecond;

    //CONSTRUCTOR
    Trafficcolor(int millisecond)
    {
        this.millisecond=millisecond;
    }

    //RETURN EACH OBJECT THAT IS COLOR MILLISECONDS
    public int gettime()
    {
        return this.millisecond;
    }
}

//CRATION OF THREAD
class TrafficLight extends Thread
{
  //DECLARE color REFERENCE FOR ENUMCLASS  Trafficcolor 
  //TO ACCEESS OBJECTS(THAT IS CONSTANTS) MEANS RED GEREEN YELLOW COLOR
  public Trafficcolor color;

  //CONSTRUCTOR TO SET THE COLOR
  public TrafficLight(Trafficcolor color)
  {
    this.color=color;

  }

    //RUN METHOD 
    @Override
    public void run()
    {
        //PRINTING COLOR NAME WITH THE HELP OF color AS Trafficcolor color=new RED();
        System.out.println("UR TRAFFIC LIGHT COLOR IS :-" + this.color + " AND IT IS ACTIVE");

        //ALLOING THE THREAD TO SLEEP FOR PARTICULAR SECONDS
        //THREAD WILL SLEEP BASED ON THE MILLISECONDS THAT HAS BEEN SET BY RED GREEN YELLOW OBJECT CONSTRUCTOR IN ENUMCLASS
        //AND WE GET THROUGH OBJECT_COLOR_NAME.gettime() METHOD
        try
        {
            Thread.sleep(color.gettime());
        } 
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("UR TRAFFIC LIGHT COLOR IS :-" + this.color + " AND IT IS INACTIVE");

    }
}

public  class Challenge4
{
    public static void main(String[] args) throws InterruptedException
    {
        /*
         * Simulate a traffic signal using threads. 
         * Create three threads representing three signals: RED, YELLOW, and GREEN. 
         * Each signal should be on for a certain time, then switch to the next signal in order.
         * Use sleep for timing and synchronize to make sure only one signal is active at a time.
         * FIRST OF ALL MAKE ENUM CLASS AND DECLARE RED YELLOW GREEN CONSTANTS(OBJECTS)
         * CREATE CONSTRUCTOR IN IT AND DEFINE CONSTRUCTOR FOR EACH RED YELLOW GREEN CONSTANTS(OBJECTS) 
         * CONSTRUCTOR WILL CONTAIN TIME OF ACTICATION AND DEACTIVATION OF EACH LIGHTS
         * CREATE A GETTER METHOD AND RETURN TO RETRUN THE EACH OBJECT TIMEIN MILLISECONDS
         * CREATE TrafficLight AND EXTENDS THREAD OF IT
         * SIMILARLY CREATE A CONSTRUCTOR FOR IT AND SETTING THE TRAFFICLIGHTCOLOR 
         * MAIN THREAD BASICALLY GIVE ENUM OBJECT AS AN ARGUMENT FOR TrafficLight CONSTRUCTOR
         * THEN CREATE A RUN METHOD TO RUN THE THREAD  AND PRINT TRAFFICLIGHTCOLOR NAME 
         * THEN CREATE A SLEEP METHOD FOR THREAD AND THAT THREAD WILL SLEEP FOR PARTICULAR MILLISECOND
         * THIS MILLISECOND WILL BERECEIVED FROM ENUM gettime() METHOD
         * BASED ON THAT THREA WILL SLEEP
         * IN MAIN THREAD WE CREATE OBJECT OF TrafficLight CLASS AND PASSED ENUM COLOR "Trafficcolor.GREEN" OBJCET TO IT
         * BECAUSE ENUM CAN BE ACCESSED AS ENUM_cLASS_NAME.CONSTANT_NAME.ANYMETHOD WHERE CONSTANT_NAME ALSO CALLED AS OBJECT
         * 
         */
        
        TrafficLight light1=new TrafficLight(Trafficcolor.GREEN);
        TrafficLight light2=new TrafficLight(Trafficcolor.YELLOW);
        TrafficLight light3=new TrafficLight(Trafficcolor.RED);

        light1.start();
        light1.join();
        light2.start();
        light2.join();
        light3.start();
        light3.join();
        
        //EASY METHOD TO GET ALL CONSTANTS FROM ENUM CLASS AND WITH THAT CONSTANTS WE CAN CALL DIFFERENT METHODS OF ENUM CLASS ACCES ITS PROPERTIES
        // for(Trafficcolor c:Trafficcolor.values())
        // {
        //     TrafficLight lights=new TrafficLight(c);
        //     lights.start();
        //     lights.join();
        // }
    }
}