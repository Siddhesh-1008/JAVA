public class Array{
    public static void main(String[] args) {
        //TKAE 5 INTEGERS AND STORED IT IN 5 MEMORY LICATION IN RAM
        int[] myArr=new int[5];
        myArr[0]=11;
        myArr[3]=12;
        myArr[2]=13;
        myArr[1]=14;
        System.out.println("ACCESSING ARRAY VALUES AT THAT PARTICULAR INDEX:- " + myArr[0]);

        System.out.println("SECOND METHOD");
        int[] myArr1={1,2,3};
        System.out.println(myArr1[0]);
        System.out.println(myArr1[1]);
        System.out.println(myArr1[2]);
        //System.out.println(myArr1[3]); ERROR:-ArrayIndexOutOfBoundsException
        System.out.println();

        System.out.println("ADD VARIBALE NAME INSIDE SQUARE BRACKETS");
        //WE CAN ALSO PUT VARIABLE NAME INSIDE SQUARE BRACKETS[VARIABLE_NAME]
        int index=2;
        System.out.println(myArr1[index]);

        System.out.println("USING WHILE LOOP TO GET VALUES AT PARTICULAR INDEX");
        //LENGTH IS 9 AND INDEX IS 8
        int[] myNewArr1={11,2,4,5,6,7,8,9,10};
        int index1=0;
        while(index1<9){
            System.out.println(myNewArr1[index1]);
            index1++;
        }

        System.out.println("MAKING USED OF ARRAY METHODS ALSO CALLED AS ARRAY TRAVERSAL");
        int index2=0;
        while(index2<myNewArr1.length){
            System.out.println(myNewArr1[index2]);
            index2++;
        }
    }
}