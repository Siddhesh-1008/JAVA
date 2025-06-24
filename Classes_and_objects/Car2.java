public class Car2{

    //INSTANCE VARIBALES
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;
 
    //CONSTRUCTOR
    //WHENEVER new Car2() WILL BE WRITE IT WILL CALL THIS CONSTRUCTOR Car2()
    //MEANS NOW WHNEVER CAR STARTS ITS currentFuelInLiters=2; MEANS IT WILL BE IN RESERVE MODE AS new Car2() WILL CALL CONSTRUCTOR Car2() NAD SET VALUES 
    Car2()
    {
        noOfWheels=4;
        color="BLACK";
        maxSpeed=150;
        currentFuelInLiters=2;
        noOfSeats=4;

    }

    //INSTANCE METHODS
    public void start()
    {
       if(currentFuelInLiters==0)
       {
          System.out.println("CAR IS OUT OF FUEL CANNOT START");
       }
       else if(currentFuelInLiters<3)
       {
          System.out.println("CAR IS IN RESERVE");
       }
       else
       {
          System.out.println("CAR IS STARTED");
       }
    }

    public void drive()
    {
          currentFuelInLiters=currentFuelInLiters-1;
          System.out.println("CAR IS DRIVING");
       
    }
 
    public void addFuel(float fuel)
    {
        //HERE CURRENT FUELLITERS HAS 0.0 VALUE IN IT
        System.out.println("cfl"+currentFuelInLiters);
        //this refers to current object CAR1 OR REFERENCE OF CLASS CAR1
       this.currentFuelInLiters=this.currentFuelInLiters+fuel;
    }
 
 
    public float getFuelLevel()
    {
       return currentFuelInLiters;
    }
 
 }
