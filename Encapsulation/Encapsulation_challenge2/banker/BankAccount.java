package Encapsulation_challenge2.banker;

public class BankAccount {
    /*
     * CREATE A BANK ACCOUNT CLASS
     * ADD acoountno acoountholdername balance as private SO THAT IT CAN BE ACCESSIBLE ONLY INSIDE BANKACCOUNT CLASS AND NOT BY ANOTHER CLASS
     * CREATE DEPOSIT MONEY AND WITHDRAWL METHODS AND DECLA IT AS PUBLIC
     * IN DEPOSIT MONEY ADD CHECKS(NOT ALLOW ILLEGAL OPERATIONS) MONEY < 0 ,THEN ADD MONEY TO THE BALANCE
     * IN WITHDRAWL MONEY ALSO HAD CHECKS SUCH AS 
     * CHECK THE MONEY THAT U ARE WITHDRAWING THAT MUCH MONEY IS PRESENT IN BALANCE OR NOT "MINUS THAT MUCH MONEY FROM BALANCE,",
     * INVALID MONEY VALUE ENTER THEN SOUT ERROR
     * IF ABOVE CODNTIONS ARE NOT SATISIFIED THEN SET MONEY IS EQL TO REAMINING BALANCE AND RETURN BY MAKING BAKANCE ZERO 
     * CREATE A CUSTOMER CLASS TO GIVE MONEY AND CUSTOMER_NAME AND BALANCE WILL BE SET ACCORDING TO DEPOSIT METHOD
     */

     //MAKE EVERY INSTANCE PROPERTIES PRIVATE
     //ALLOW CUSTOMER TO JUST ENTER account_number,account_holder_name
     //BALANCE WILL BE SET BASED ON DEPOSIT MONEY METHOD
     private String account_number;
     private String account_holder_name;
     private double balance;

     /**
      * CONSTRUCTOR FOR SETTING VALUE FOR ACCOUNT NUMBER AND ACCOUNT NAME
      * @param account_number
      * @param account_holder_name
      */
     public BankAccount(String account_number,String account_holder_name)
     {
        this.account_number=account_number;
        this.account_holder_name=account_holder_name;
     };


     /**
      * DEPOSIT MONEY METHOD FOR DEPOSITING LOGIC
      * @param money
      */
     public void deposit_money(double money)
     {
        //INVLAID MONEY VALUE
        if(money<=0)
        {
            System.out.println("BRO U ARE GONE MAD!!! ");
        }
        //ADD OR UPDATE THE MONEY TO BALANCE
        else
        {
            System.out.println("CONRATS BALANCE UPDATED");
            balance=balance+money;
        }
     }

     public double withdrawl_money(double money)
     {
        if(money<=0)
        {
            System.out.println("BRO WHAT U HAD ENTERED");
        }
        else if(balance>=money)
        {
            System.out.println("MONEY WITHDRAWL");
            balance=balance-money;
        }
        else
        {
            money=balance;
            balance=0;
        }
        return money;

     }

     
    //PRINT BALANCE
    @Override
    public String toString() {
        return "UR BALANCE IS:- "+ balance;
    }

     
}
