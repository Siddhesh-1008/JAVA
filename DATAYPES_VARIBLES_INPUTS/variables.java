public class variables{
    public static void main(String[] args) {
        //INITIALIZATION
        int myNumber=10;
        int urNumber=120;
        System.out.println(myNumber);
        System.out.println(urNumber);

        //DECLARATION ONE TIME (int allnum)AND INTIALIZATION MULTIPLE TIMES (allnum=25;)
        //VARIABLE DECALRATION ALLOCATE A MEMORY FOR VARIABLE NAME ALLNUM  HAVING SIZE 4BYTES IN RAM
        int allnum;
        //INITAILIZATION(ADD VALUE TO VARIABLE AND THEN STORED IT IN MEMORY OF THAT PARTICULAR VARIABLE ADRESS)
        allnum=25;
        System.out.println(allnum);
        //NOW 95 WILL REPLACE THE VALUE(25) THAT HAS BEEN STORED IN MEMORY FOR THAT VARIABLE
        allnum=95;
        System.out.println(allnum);
        //IF U TRY TO PRINT VARIABLE WITHOUT INITALIZATION IT WILL GIVE ERROR
        // allnum;
        // System.out.println(allnum);

        //BOOLEAN
        boolean isVegeterian=true;
        System.out.println(isVegeterian);

        //FLOAT 
        //FLOAT BASICALLY STORE DECIMAL VALUES IF WE STORE 5.0 VALUE IN MYFLOAT THEN IT WILL GIVE ERROR AS IT CONSIDER THESE VLAUE AS DOUBLE
        //SO INSTEAD STORING 5.0 WE NEED TO STORE 5.0F IN MYFLOAT
        //OR IF WE STORE 5 IN MYFLOAT THEN IT BYDEFAULT PRINT 5.0 AS FLOAT DATAYPE CONVERTS 5 INTO 5.0
        float myFloat=5.0F;
        System.out.println(myFloat);

        //DOUBLE
        double myDouble=6.0;
        System.out.println(myDouble);
        
        //STRING DECALRATION
        String wishes="Siddhesh";
        System.out.println(wishes);

        //CHARACTER DECLARATION
        char myCharacter='A';
        System.out.println(myCharacter);


    }
}
