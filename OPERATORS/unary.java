public class unary {
    public static void main(String[] args) {
        //CONVERTS POSITIVE VALUE TO NEGATIVE
        int x=5;
        int y=-x;
        System.out.println(y);
        System.out.println("POST INCREMENT");
        //IN POST INCREMENT WE FIRST PRINT VALUE AND THEN DO ++ OR -- OPERATION
        //THIS MEANS WE WILL FIRST PRINT p value THEN INCEMENT IT BY 1 AND THEN AGAIN WE PRINT p IT WILL SHOW INCREMENT VALUE
        //++ USED FOR ADDING 1 TO THE  VALUE
        int p=10;
        //THIS MEANS WE WILL FIRST PRINT p value THEN INCEMENT IT BY 1 AND THEN AGAIN WE PRINT p IT WILL SHOW INCREMENT VALUE
        System.out.println(p++);
        System.out.println(p);

        //IN PREINCREMENT WE FIRST print OUT ++,-- OPERATION VALUE 
        System.out.println("PRE INCREMENT");
        int q=10;
        //HERE IT WILL FIRST PRINT OUT ++,-- OPERATIONS  VALUE THAT IS IN --q IT WILL PRINT 9
        System.out.println(--q);
        System.out.println(++q);

        System.out.println("POST INCREMENT");
        int r=4;
        r++;
        System.out.println(r);

        //CHALLENGE
        System.out.println("CHALLENGE");
        int f=10;
        //PRINT VALUE BY DECREMENTING IT BY 1
        System.out.println(--f);  //9
        //PRINT STRORED VALUE IN F AFTER DECREMENTING
        System.out.println(f);    //9

        //PRINT STORED VALUE IN f AND THEN DO DECREMENT OPERATION
        System.out.println(f--);  //9
        //SHOW THE DECREMENT OPERATION VALUE THAT HASS BEEN STRED IN f
        System.out.println(f);    //8

    }
    
}
