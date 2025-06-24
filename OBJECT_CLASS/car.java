public class car
{

    public static void main(String[] args) 
    {
        /*
         * HERE CAR IS INHERRETING PROPERTIES FROM OBJECT CLASS
         * 
         */
        car objectclass=new car();
        //BASICALLY CONCAT CLASS NAME AND HASHED CODE
        System.out.println(objectclass.toString());
        //GET UNIQUE ADRESS OF OBJECT
        System.out.println(objectclass.hashCode());
        //IT IS USED FOR GETTING CLASS NAME
        System.out.println(objectclass.getClass().getName());


    }   
}