public class random_methods
{
    public static void main(String[] args) 
    {
        //RANDOM BASICALLY USED TO GIVE RANDOM VALUES BETWEEN 0.0 AND 1.0
        for (int i = 0; i < 10; i++) 
        {
            System.out.println("RANDOM VALUES AT INDEX " + i + " IS=> " + Math.random());
        }
        System.out.println();
        for (int val = 0; val < 10; val++) 
        {
            //MULTIPLYING 100 WILL HELP TO GIVE DECIMAL AFTER TWO DIGITS MEANS 0.92258 GIVE 92.2258
            System.out.println("RANDOM VALUES AT INDEX " + val + " IS=> " + Math.random()*100);
        }

        System.out.println();
        for (int count = 0; count < 10; count++) 
        {
            //MULTIPLYING 100 WILL HELP TO GIVE DECIMAL AFTER TWO DIGITS MEANS 0.92258 GIVE 92.2258
            System.out.println("RANDOM VALUES AT INDEX " + count + " IS=> " + Math.round(Math.random()*100));
        }
        System.out.println("PIE VALUE=> "+ Math.PI);
        System.out.println("EXPO VALUE=> "+ Math.E);
    }   
}
