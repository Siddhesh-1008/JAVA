public class Driver{
    public static void main(String[] args) {
        //CREATE OBJECT FOR CLASS Car
        Car mycar=new Car();

        //ACCESS PROPERTIES BY MAKING USE OF objectname.method
        mycar.addFuel(6);
        mycar.drive();
        //decrement by 1 THEN FUELINLITERS IS 5 liters
        mycar.drive();
        //decrement by 1 THEN FUELINLITERS IS 4 liters
        mycar.drive();
        //decrement by 1 THEN FUELINLITERS IS 3 liters
        mycar.drive();
        //AS LITER ARE 3 LITERS THUS IT SI LESS THAN 3 THEN IT WILL SHOW CAR IS IN RESERVE
        mycar.drive();
        System.out.println("UR CURRENT FLUEL LEVEL"+mycar.getFuelLevel());


    }
}
