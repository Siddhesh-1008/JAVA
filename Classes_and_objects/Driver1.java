public class Driver1{
    public static void main(String[] args)
     {
        //CREATE OBJECT FOR CLASS Car
        // Car mycar=new Car();

        // //ACCESS PROPERTIES BY MAKING USE OF objectname.method
        // mycar.addFuel(6);
        // mycar.drive();
        // //decrement by 1 THEN FUELINLITERS IS 5 liters
        // mycar.drive();
        // //decrement by 1 THEN FUELINLITERS IS 4 liters
        // mycar.drive();
        // //decrement by 1 THEN FUELINLITERS IS 3 liters
        // mycar.drive();
        // //AS LITER ARE 3 LITERS THUS IT SI LESS THAN 3 THEN IT WILL SHOW CAR IS IN RESERVE
        // mycar.drive();
        // System.out.println("UR CURRENT FLUEL LEVEL"+mycar.getFuelLevel());

        Car1 Swift=new Car1();
        Swift.addFuel(6);
        //.start() GETS CURRENT OBJECT 
        //Thus startedCar CONTAIN CAR1 OBJECT 
        //THUS WE CAN MAKE USE OF startedCar.drive()
        Car1 startedCar=Swift.start();
        startedCar.drive();
        System.out.println();
        
        //CHAINING OF METHODS
        //THUS Swift.start() CONTAIN car1
        //THUS WE CAN DIRECTLY CHAIN IT
        Swift.start().drive();
    }
}
