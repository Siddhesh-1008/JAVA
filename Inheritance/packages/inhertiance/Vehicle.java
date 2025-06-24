package packages.inhertiance;

public class Vehicle{
    /*
     * make noofwheels instance properties
     * make commute method
     * THEN MAKE TWO WHEELER CLASS AND EXTEND ALL PROPERTIES OF VEHICLE CLASS
     * THEN MAKE MOTORCYCLE CLASS AND EXTEND ALL PROPERTIES OF VEHICLES CLASS AND TWO WHEELER CLASS
     * NOW MAKE INHERITANCE TEST CLASS ANS MAKE OBJECTS FOR VEHCILES AND TWO WHEELER
     */
    public int noOfWheels;
    private int numberoftiers;
    //PROTECTED ACCESS MODIFIER CAN BE ACCESS INSIDE PACKAGE AS WELL AS OUTSIDE THE PAKCAGE ONLY APPLICABLE FOR CHILD CLASS
    protected String Modelno="AFGH23242";

    public void setTiers(int numberoftiers)
    {                                      
        this.numberoftiers=numberoftiers;  
    }                                         
                                           

    public void commute()
    {
        System.out.printf("I AM GOING FROM A TO B WITH %d WHEELS",noOfWheels);
        
    }
}