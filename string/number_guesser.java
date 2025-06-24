
import java.util.Scanner;

public class number_guesser
{
    int randomguesser;

    //SET randomguesser INSTANCE ATTRIBUTE WITH RANDOM VALUE USING (int) Math.ceil(Math.random()*100);
    number_guesser()
    {
        this.randomguesser=(int) Math.ceil(Math.random()*100);
    };


    
    /**
     * 
     * @param guessnumber
     * @return 
     *IF guessnumber-randomguesser GIVES NEGATIVE NUMBER THEN UR GUESS IS SMALLER
     *IF guessnumber-randomguesser GIVES POISITVE NUMBER THEN UR GUESS IS LARGER
     *IF guessnumber-randomguesser GIVES ZERO THEN UR GUESS IS COORECT
     */
    public int guesser(int guessnumber)
    {
        return guessnumber-randomguesser;
    }


    public static void main(String[] args)
    {
        //DECLARE result AND guessnumber
        int result;
        int guessnumber;

        //GET SCANNER CLASS
        Scanner input=new Scanner(System.in);

        //OBJECT CREATION
        number_guesser ng=new number_guesser();
        //WITH THE HELP OF objectname.intanceattribute WE GET WHAT RANDOM VALUE HAS BEEN SET TO randomguesser
        System.out.println("UR RANDOM NUMBER:- " + ng.randomguesser);
        
        do{ 
            System.out.print("PELASE ENTER THE NUMBER THAT USER WANT TO GUESS:- ");
            guessnumber=input.nextInt();
            
            //GET THE RESULT TO SEE WHERE UR GUESS IS CLOSER TO RANDOM NUMBER
            result=ng.guesser(guessnumber);
            if(result<0)
            {
                System.out.println("UR GUESS IS SMALLER");
            }
            else if(result>0)
            {
                System.out.println("UR GUESS IS LARGER");
            }
            else
            {
                System.out.println("UR GUESS IS RIGHT");
            }
        }while( result!=0);
    }
}
