public class Rightshiftoper {
    //JAVA DOCS
    /**
     * THIS MEHOD DEFINES RIGHT SHIFT OPERATOR
     * @param args
     */
    public static void main(String[] args) {
        int num=4;
        int bitwiseoperator=num>>2;
        System.out.println("bitwise operator:- "+bitwiseoperator);
        //0100=>0010
        //MEANS U ARE SHIFTING A PARTICULAR BINARY NUMBER ON RIGHT SIDE MEANS ADDING 0 ON STARTING
        //MEANS CARRY OUT DIVISION BY 2 ACCODING TO THE SHIFTS
        //MEANS UR NUMBER IS 4 AND UR RIGHT SHIFTS ARE 2 THEN 4 /2/2 =1

    }
}
