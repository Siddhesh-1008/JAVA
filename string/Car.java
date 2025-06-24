public class Car{
       int noOfWheels;
        int doors;
        int seats;
        String carname;

        //constructor
        Car(int noOfWheels,int doors,int seats,String carname)
        {
            this.noOfWheels=noOfWheels;
            this.doors=doors;
            this.seats=seats;
            this.carname=carname;
        };

        @Override
        public String toString() {
            //+ IS USED TO CONCAT THE STRINGS 
            return 
            "MY CAR NAME IS "+ carname +"\n"
            +"NO OF WHEELS "+ noOfWheels +"\n"
            +"NO OF DOORS "+ doors +"\n"
            +"NO OF SEATS "+ seats;
        }

        


    public static void main(String[] args)
    {
        System.out.println("WELOCME TO STRING METHOD");
        //OBJECT CREATION
        Car c1=new Car(4,4,6,"ALTO");
        //TO STRING METHOD BASICALLY USED FOR GIVING DESCRIPTION ABOUT CLASS
        String desc=c1.toString();
        System.out.println(desc);
        //IF U DONT WRITE .toString() AFTER OBJECT NAME STILL IT WILL CALL TOSTRING METHOD
        //WHENEVER U ARE PRINITNG OBJECT NAME IT WILL AUTOMATICALLY CALL TO STRING METHOD
        //AS toString METHOD IS IMPLICIT 
        System.out.println();
        System.out.println(c1);
       
    }

}