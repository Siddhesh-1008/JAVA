package packages.inhertiance;

public class Two_wheeler extends Vehicle
{
    //CONSTRUCTOR
    //TWO WHEELER EXTENDING ALL PROPERTIES  AND METHODS OF VEHICLE CLASS
    public Two_wheeler() 
    {
        //AS WE HAD INHERIT int noofwheels PROPERTIES FROM VEHICLE CLASS 
        //THUS WE HAVE INSTANCE PROPERTIES(VARAIBLES) public int noofwheels IN IT THUS WE CAN CHANGE IT WITH THE HELP OF this.noofwheels=value
        this.noOfWheels=2;
        setTiers(2);
    };

    public void balance(){
        System.out.printf("\nI AM BALANCING ON %d WHEELS",noOfWheels);
        System.out.println();
    }
    
}
