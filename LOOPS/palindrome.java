public class palindrome {
    public static void main(String[] args) {
        //PALINDROME
        //IF U REVERSED ANY NUMBER AND THAT REVERSED NUMBER IS EQL TO ORIGINAL NUMBER
        //THEN IT IS A PALINDROME
        //OTHERWISE IT IS NOT A PALINDROME
        //IF U SEE NUM=32123 AND ITS REVERSE=32123 THUS WE CAN SAY THAT IT IS A PALINDORME
        //SIMILARY NUM=12 AND ITS REVERSE=21 THUS WE CAN SAY THAT IT IS NOT A PALINDROME
        //USED SAME LOGIC OF REVERSE NUMBER AND THEN COMPARED IT WITH ORIGINAL NUMBER
        int num=32123;
        boolean reversednum=isPalandrome(num);
        if(reversednum){
            System.out.println("YES IT IS A PALINDROME");
        }
        else{
            System.out.println("NO IT IS NOT A PALINDROME");
        }
    }

   /**
    * CALLING palindrom(num) TO GET THE REVERESED NUM
    * @Test
   public void test() {
       
   } */
    public static boolean isPalandrome(int num){
        int reversednum=palindrom(num);
        //BASICALL  reversednum==num CONTAINS BOOLEAN VALUES THAT CAN BE TRUE OR FALSE
        return reversednum==num;
    }

    /**
     * REVERSING THE ORIGINAL NUMBER
     * @param num
     * @return
     */
    public static int palindrom(int num){
        int reversednum=0;
        while(num>0)
        {
            int last_digit=num%10;
            num=num/10;
            reversednum=reversednum*10+last_digit;
        }
        return reversednum;
    }
}
