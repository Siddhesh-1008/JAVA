
import java.util.Scanner;

public class fibonaaci_Series_rescurrsion{
    public static void main(String[] args) {
        //FIBONNACI
        //FIRST OF ALL GET HOW MANY NUMBER U WANT FROM FIBONNACI SERIES
        //IF USER INPUT IS 3 THEN WE NEED TO FIND 3 ELMENTS  FIBONACCI SERIES(NUMBER) 
        //THEN GET THE POSITIONS OF EACH NUMBER MEANS
        //MEANS UR PREVIOUS TWO NUMBER ARE VERY IMPORTANT
        //TO PRINT TILL 3 LOOP WILL RUN TILL 3
        //THUS POSITION INDICATES         1 2 3 
        //THUS THIS POISITONS WILL PASSED TO FIBONNACI FUNCTION fibonnaci(poisition)
        //if POSITION IS 1 THEN RETRUN 0 IF POSITION IS 2 RETURN 1 AS DEFAULT STARTING VALUES OF FIBONNACI SERIES IS 0 AND 1 AT FIRST AND SECOND POITIONS
        //IF POISITION IS NOT 1 OR 2 THEN  GET THE PREVIOUS TWO VALUES BY RECURSIVE CALLING fiboonaci(position -1) FOR PREVIOUS VALUE AND fiboonaci(position -2) FOR PREVIOUS TO PREVIOUS VALUE
        //EG:- 0 1 2            0->PREVIOUS TO PREVIOUS VALUE FOR 2 & 1-> PREVIOUS VALUE FOR 2
        //THUS WITH THE HELP OF THESE WE CN ABLE TO GET FIRST THREE NUMBERS
        //FIBONNACI SERIES  0 1 1 2
        //PISITION          1 2 3 4
        Scanner input=new Scanner(System.in);
        System.out.print("PLEASE STATE HOW MANY NUMBERS U WANT FROM FIBONNACI SERIES:- ");
        int num=input.nextInt();
        //POISTION OF UR PREVIOS AND PREVIOUS TO PREVIOUS VALUE
        for(int poisition=1;poisition<=num;poisition++)
        {
            System.out.print(fibo(poisition)+ " ");
        }

        
    }

    public static int fibo(int poisition){

        /* PELASE GIVE STARTING FOUR NUMBERS OF THE FIBONNACI SERIES
         fibo(poisition) return fibo(1)    print 0
         fibo(poisition) return fibo(2)    print 1
         fibo(poisition) return fibo(3) fibo((poisition-1))+fibo((poisition-2))  fibo(2)+fibo(1)         
                                                                                      0   +    1=1 
          fibo(poisition) return fibo(4) fibo((poisition-1))+fibo((poisition-2))  fibo(3)+fibo(2)         
                                                                                      0   +    1=1 
          
                                                       fibo(3)+fibo(2) LOGIC                                                                     
            fibo(3) WILL GO AGAIN ANd called fibo(2) THEN fibo(2) WILL BE AGAIIN CALLED AND fibo(2) will return 1 WHIC WILL GO TO fibo(3)
            fibo(3)=1
            fibo(2) WILL CALLED AND RETURN 1
            fibo(2)=1
            WHICH TOGETHER RETURNS 2
            THUS STARTING 4 NUMBERS WOULD BE 0 1 1 2

                                                                        


         */
        
         if (poisition==1){
            return 0;
        }
        if(poisition==2){
            return 1;
        }
        //poisition-1 FOR PREVIOUS VALUE poisition-2 FOR PREVIOUS TO PREVIOUS VALUE
        return fibo((poisition-1)) + fibo((poisition-2));
    }
}
