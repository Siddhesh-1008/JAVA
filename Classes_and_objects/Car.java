public class Car{

   //INSTANCE VARIBALES
   int noOfWheels;
   String color;
   float maxSpeed;
   float currentFuelInLiters;
   int noOfSeats;

   //INSTANCE METHODS
   public void drive()
   {
      if(currentFuelInLiters==0)
      {
         System.out.println("CAR IS OUT OF FUEL");
      }
      else if(currentFuelInLiters<3)
      {
         System.out.println("CAR IS IN RESERVE");
      }
      else
      {
         currentFuelInLiters=currentFuelInLiters-1;
         System.out.println("CAR IS DRIVING");
      }
      
   }

   public void addFuel(float fuel)
   {
      currentFuelInLiters=currentFuelInLiters+fuel;
   }


   public float getFuelLevel()
   {
      return currentFuelInLiters;
   }

}