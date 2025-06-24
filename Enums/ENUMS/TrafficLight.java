package ENUMS;
public enum TrafficLight
{
    //HERE RED,GREEN,YELLOW; ARE BASICALLY CONSTANTS DEFINE BY USER AND WE CAN ACCESS IT ENUM_NAME.CONSTANT
    RED("DONT GO"),GREEN("GO HAVE STEP"),YELLOW("TAKE CAUTION MOVE");

    //VARAIBLES
    String instructions;

    //DEFAULT CONSTRUCTOR
    TrafficLight()
    {
        instructions="LISTEN ALL THE CONSTRUCTIONS CAREFULLY FOR ALL PARTICUALR COLOR";
    };

    //PARAMETERIZED CONSTRUCTOR
    //WE CAN WRITE RED("DONT GO") IT IS SIMILAR TO TrafficLight RED=new TrafficLight("DONT GO")
    //PARAMETERIZED CONSTRUCTIOR FOR RED("DONT GO")
    //HERE THIS REFERS TO RED OBJECT NAME 
    TrafficLight(String instructions)
    {
        this.instructions=instructions;
    };

    

    //METHODS
    public String getInstructions()
    {
        return this.instructions;
    }
}