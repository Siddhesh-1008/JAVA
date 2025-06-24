public class Armstrong {
    public static void main(String[] args) {
        //LOGIC OF AMSTORNG NUMBER
        //WE HAD THREE DIGIT NUMBER 153 NOW CONSIDER EACH DIGIT FROM 153
        //THAT IS 1,5,3 AND THEN GET CUBE OF EACH DIGIT THAT IS 1,5,3 THAT WILL BE 1^3,5^3,3^3
        //THEN ADD ALL THAT CUBE IF ADDITION GETS EQUAL TO ORIGINAL NUMBER THEN IT IS AN AMSTRONG NUMBER
        // 1^3+5^3+3^3 THT GETS EQUAL TO 153
        //Math.pow() ONLY WORKS ON DOUBLE
        int num=13;
        int res=aamstrong(num);
        // System.out.println(res);
        if(res==num){
            System.out.println("AMSTRONG NUMBER");
        }
        else{
            System.out.println("NOT A AMSTRONG NUMBER");
        }

    }
    public static int aamstrong(int num)
    {
        int cube;
        int c=0;
        while(num>0){
            int last_digit=num%10;
            cube=cube(last_digit,3);
            c=c+cube;
            num=num/10;
        }
        return c;
    }

    public static int cube(int last_digit,int num){
        int cube=(last_digit*last_digit*last_digit);
        return cube;

    }
}
