public class for_Each {
    public static void main(String[] args) {
        String[] array=new String[] {
            "RAM","SEETA","LALITA","SAM","SHYAM"
        };
        printArray(array);

    }

    public static void printArray(String[] array){
        //USED FOR EACH TO EASE THE WORK THAT WE NEED TO DO ON NORMAL FOR LOOP SUCH AS INITIALIZATION,CONDITION CHECKING,UPDATION
        //WITHOUT INTILAIZATION AND UPDATION WE ARE ABLE TO PRINT EACH NAME OFAN ARRRAY
        for(String name:array){
            System.out.println(name);
        }

    }
}
