public class even_odd_bitwise {
   public static void main(String[] args) 
   {
        //WAP TO PRINT NUMBER IS EVEN OR ODD USING BITWISE OPERATOR
        //IF U USE BITWISE ADD AND ADD TWO VALUES AND IF ITS RIGHT MOST BIT IS 1 THEN IT IS ODD IF ITS RIGHT MOST BIT IS 0 THEN IT IS EVEN
        //BASICALLY BITWISE OPERATOR CONVERTS THE INTEGERS INTO BINARY VALUES AND THEN PERFORM BITWISE OPERATION ON IT
        int num=2;
        if((num&1)==1){
            System.out.println("ODD");
        }
        else if((num&1)==0)
        {
            System.out.println("EVEN");
        }
        //NUM IS 2 THAT MEANS IT IS 0010
        //AND 1    THAT MEANS IT IS 0001
        //AFTER DOING AND WE GET    0000 WHICH ARE EVEN AS 0000(BINARY VALUE) IS EQUAL TO 0 IN DECIMAL
        
        //NUM IS 1 THAT MEANS IT IS 0001
        //AND 1    THAT MEANS IT IS 0001
        //AFTER DOING AND WE GET    0001 WHICH ARE ODD AS 0001(BINARY VALUE) IS EQUAL TO 1 IN DECIMAL
   } 
}
