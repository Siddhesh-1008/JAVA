public class swap_two_num {
    public static void main(String[] args) {
    System.out.println("swapping two values");
    //DECALRE ONE TIME int a AND INTIALIZE MULTIPLE TIMES a=10
    //ALWAYS REMEMBER WE CANNOT USE(DECALRE OR INTIALIZE) SAME VARIABLE NAME MULTIPLE TIMES
    //SO INSTEAD WE DECALRED VARIABLES (int a) AND RAM ALLOCATE A MEMORY(SPACE) FOR IT
    //SO WE CAN USE SAME VARIBALE NAME MULTIPLE TIME AND AS IT REPLACES THE VALUE PRESENT IN MEMORY
    //STORE A VALUE IN C AND THEN ASSIGN b VALUE TO a AND c VALUE TO b
       int a;
       int b;
       a=10;
       b=5;
       System.out.println("PREVIOUS VALUE OF a is->"+a+" PREVIOUS VALUE OF b is->"+b);
       int c=a;
       a=b;
       b=c;
       System.out.println("AFTER SWAPING TWO VALUES"+ "a VALUE IS=>"+ a +" WHILE b VALUE IS=>"+ b);


        

    }
}
