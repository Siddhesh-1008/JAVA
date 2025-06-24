public class continue_oper {
    public static void main(String[] args) {
        //IF WE WRITE CONTINUE IN ANY IF LOOP AND IF IF CONDITON BECOMES TRUE THEN IT WILL DIRECTLY JUMP TO UPDATION FOR FOR LOOP OR TO WHILE LOOP CONDITION
        System.out.println("BEFORE LOOP");
        /*
         i=0 0<5  i==2=>FALSE print 0   i=1
         i=1 1<5  i==2=>FALSE print 1   i=2
         i=2 2<5  i==2=>TRUE            i=3
         i=3 3<5  i==2=>FALSE print 3   i=4
         i=4 4<5  i==2=>FALSE print 4   i=5
         i=5 5!<5 out of LOOP
         */
        for(int i=0;i<5;i++){
            if(i==2){
                //IT WILL SKIP PRINTING OF i's value=2 IF i==2
                continue;
            }
            System.out.println(i);
        }

    }
}
 