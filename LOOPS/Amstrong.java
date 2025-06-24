public class Amstrong {
        public static void main(String[] args) {
        //LOGIC OF AMSTORNG NUMBER
        //POWER ON EACH DIGIT MAINLY DEPENDS UPON THE NUMBER OF DIGITS IN THE USER INPUT NUMBER AS 153 HAS THREE DIGITS THEREFO POWER IS 3
        //WE HAD THREE DIGIT NUMBER 153 NOW CONSIDER EACH DIGIT FROM 153
        //THAT IS 1,5,3 AND THEN GET CUBE OF EACH DIGIT THAT IS 1,5,3 THAT WILL BE 1^3,5^3,3^3
        //THEN ADD ALL THAT CUBE IF ADDITION GETS EQUAL TO ORIGINAL NUMBER THEN IT IS AN AMSTRONG NUMBER
        // 1^3+5^3+3^3 THT GETS EQUAL TO 153
        //Math.pow() ONLY WORKS ON DOUBLE NUMBERS
            int num=153;
            int isArmstrong=isArmstrong(num);
            if(isArmstrong==num){
                System.out.println("UR NUMBER IS ARMSTRONG");
            }
            else{
                System.out.println("NOT AN ARMSTRONG NUMBER");
            }

        }

        /**
         * CODE FOR CALLING POWER AND NO OF DIGITS
         * @param num
         * @return
         */
        public static int isArmstrong(int num){
            int noOfDigits=noOfDigits(num);
            System.out.println("NO_OF_DIGITS=>"+ noOfDigits);
            int finalNumber=0;
            while(num>0)
            {
                int last_digit=num%10;
                num=num/10;
                finalNumber=finalNumber+power(last_digit,noOfDigits);
            }
            System.out.println("FINAL NUMBER=>" + finalNumber);
            return finalNumber;
            
        }

        
        /**
         * POWER MEANS HOW MANY TIMES U NEED TO MUTIPLY THE LAST DIGIT NUMBER
         * @param last_digit
         * @param noOfDigits
         * @return
         */
        public static int power(int last_digit,int noOfDigits){
            //BASICALLY int num1 IS THE USERS INPUT NUMBER AND int num2 IS THE POWER MEANS HOW MUCH TIME U NEED TO MULTIPLY THE USER INPUT NUMBER
            //IF num1 IS 2 AND num2 IS 3 THEN 2*2*2

            int result=1;
            int i=0;
            while(i<noOfDigits)
            {
                /*
                FOR FITST LAST DIGIT NUMBER
                result=result*last_digit;
                result=1*3
                result=3*3
                result=9*3

                FOR SECOND LAST DIGIT NUMBER
                result=result*last_digit;
                result=1*5
                result=5*5
                result=25*25

                FOR THIRD LAST DIGIT NUMBER
                result=result*last_digit;
                result=1*1
                result=1*1
                result=1*1
                 */
                result=result*last_digit;
                i++;
            }
            System.out.println(result);
            return result;
        }

        /**
         * TO COUNT NO OF DIGITS OF PARTICULAR USER INPUT
         * @param num
         * @return
         */
        public static int noOfDigits(int num)
        {
            int digits=0;
            /*
            DIGITS=1,2,3
            NUM=15,1,0
            THUS FOR EACH NUM/10 WE ARE INCREMENTATING DIGITS COUNT 
            THUS THERE ARE THREE DIGITS
             */
            while(num>0)
            {
                digits++;
                num=num/10;
            }
            return  digits;
        }
        
        
}
