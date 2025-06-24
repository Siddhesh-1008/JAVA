

import src.in.Access_modifier.Public_Private_Access_modifier;

public class Access_ur_public_private_Access_modifier
{
    public static void main(String[] args) {
    //WE DONT NEED TO IMPORT Public_Private_Access_modifier AS THIS .JAVA FILE IS ALSO IN SAME FOLDER
    Public_Private_Access_modifier ppam0 = new Public_Private_Access_modifier(4, 4, 4);
    //PUBLIC VARAIBLES CANT BE ACCESSED AND MODIFIED
    ppam0.no_of_wheels=10;
    ppam0.no_of_Seats=4;
    System.out.println(ppam0.toString());
    //PRIVATE VARAIBLES CANT BE ACCESSIBLE
    //ppam.fuel_purchase=5;
    Public_Private_Access_modifier ppam1 = new Public_Private_Access_modifier(4, 4, 4);
    System.out.println(ppam1.toString());

    }
    
}
