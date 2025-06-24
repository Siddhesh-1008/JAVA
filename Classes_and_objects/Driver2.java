public class Driver2 {
    public static void main(String[] args) {
        //new Car2() WILL CALL CONSTRUCTOR Car2(){} AND WILL INTIATE  DEFUALT VALUES
        Car2 swift=new Car2();
        swift.start();
        swift.drive();
        //ACCESS CONSTRUTOR ATTRIBUTES(VARIABLES)
        System.out.println("NUMBER OF SEATS:- "+ swift.noOfSeats);
    }
}
