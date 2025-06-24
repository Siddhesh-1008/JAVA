public class LeftBitwiseOperator {
    public static void main(String[] args)
    {
            int num=5;
            int bitwiseoperator=num<<2;
            System.out.println("bitwise operator:- "+bitwiseoperator);
            //IN LEFTSHIFTOPERATOR IF UR NUMBER IS 5 AND UR LEFT SHIFTS ARE 2 THEN 5*2*2=20
            //0010=>0100
            //0100 WHICH IS 4

            int num2=4;
            int leftbtwoper=num2<<2;
            System.out.println("bitwise operator:- "+ leftbtwoper);
            //0100=10000

            int num3=8;
            int leftoper=num3<<3;
            System.out.println("bitwise operator:- "+ leftoper);

            //THIS MEANS MULTIPLY 8 BY 2*2*2 THAT IS 32 AS WE ARE SHIFTING BY LEFT 3'0S 
            //MEANS BY HOW MUCH 0's U ARE SHIFTING LEFT THE NUMBER OF TIMES U MUTILPY 2
            //IF U ARE SHIFTING LEFT BY 3 0'S THEN 2*2*2 MULTIPLED BY THAT USERINPUT NUMBER

    }
}
