public class Dice 
{
    public void roll()
    {
        //IT GIVES VALUE BETWEEN 0 to 6 EXCLUSING 1 
        double random=Math.random()*6;
        //THEN WE DO CEIL WE ARE BASICALLY ROUNDING UP THE VALUE FROM  0.5 TO 1 OR 3.5 TO 4
        //THEN WE DO EXPLICIT TYPE CASTING FOR CONVERTING DOUBLE TO INTEGER  AS AFTER  CEILING WE ARE GETTING VALUE IN DOUBLE THAT IS 0.5 OR 2.5 OR 3.5 THEN TO CONVERT IT INTO INTEGER WE MAKE USE OF EXPLICT INTEGER TYPE CASTING (int)
        int randomroll=(int)Math.ceil(random);
        System.out.println("UR  CURRENT ROLL IS:- "+randomroll);
    }

    public static void main(String[] args) 
    {
        Dice dice=new Dice();
        dice.roll();
    }
}
