public class Car1{

    //INSTANCE VARIBALES
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;
 
    //INSTANCE METHODS
    public Car1 start(){
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
    //HERE CAR1 REFERS TO CURRENT OBJECT OR RETURNS CLASS CAR1
    return this;
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
