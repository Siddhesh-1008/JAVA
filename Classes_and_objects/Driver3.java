public class Driver3 
{
    public static void main(String[] args) 
    {
        //Default constructor
        Car3 swift0=new Car3();
        System.out.println(swift0.color+","+swift0.noOfSeats);
        
        //PARAMTERIZED CONSTRUCTOR
        Car3 swift=new Car3("Red",6);
        swift.start();
        System.out.println("CARS COLOR:-"+swift.color);
        //BUT IF U DONT PUT ANY PARAMETER Car3 swift=new Car3(); THEN  CALLED CONSTRUCTOR Car3() AND ADD DEFUALT VALUES
        
        //ACCESSING STATIC VARIABLE
        System.out.println("ACCESSING TYPE OF VECHCILES:-"+ Car3.type);
        //STATIC METHOD
        Car3.show();
    }
}
