package ENUMS;
public class Testing_enums
{
    public static void main(String[] args)
     {
        //ACCESSING ENUMS CONSTANTS SUING ENUM_NAME.CONSTANTS
        TrafficLight color=TrafficLight.RED;

        System.out.println();
        //TO ACESS METHODS ANDVARAIBLES
        System.out.println(TrafficLight.RED.instructions);
        System.out.println(TrafficLight.RED.getInstructions());
        System.out.println(TrafficLight.GREEN.getInstructions());
        System.out.println(TrafficLight.YELLOW.getInstructions());
        
        System.out.println();
        //ORDINAL TO ACCESS THE ORDER THAT IS SEQUENCE OF CONSTANTS
        System.out.println(TrafficLight.RED.ordinal());
        System.out.println(TrafficLight.YELLOW.ordinal());
        System.out.println(TrafficLight.GREEN.ordinal());

        System.out.println();
        //GET ALL CONSTANTS FROM ENUM
        TrafficLight lights[]=TrafficLight.values();
        for(TrafficLight i:lights)
        {
            System.out.println(i);
        }

        System.out.println();
        //USING SWITCH WITH ENUMS
        //REMEMBER IN THIS SWITCH STATEMENTS WE HAVE CASES HAVING VALUES SIMILAR TO CONSTANTS PRESENT IN ENUM OTHERWISE IT WILL GIVE ERROR
        switch(color){
            case RED:
                System.out.println("STOP");
                break;
            case GREEN:
                System.out.println("GO");
                break;
            case YELLOW:
                System.out.println("CAUTION");
                break;
            default:
            System.out.println("U HAVE ENTERED SOMETHING WRONG");
            break;

        }

    }
}