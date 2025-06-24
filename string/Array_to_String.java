public class Array_to_String
{
    //INSTANCE PROPERTIES
    String[] array;
    //CONSTRUCTOR
    Array_to_String(String[] array)
    {
        this.array=array;
    }

    //OVERRIDING DEFAULT TO STRING METHOD
    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        for(String str:array){
            sb.append(str).append(" ");
        }
        return sb.toString();
    }

    
    public static void main(String[] args) {
        /*
        FIRST GET STRING ARRAY FROM USERS
         * SECOND PASSED IT TO CONSTRUCTOR SO THAT IT CAN SET USER INPUT String[] array TO INSTNACE PROPERTIES String[] array;
         * THIRD CALLED TO STRING METHOD AND OVERRIDE DEFAULT TOSTRING METHOD
         * CREATE STRING BUILDER "StringBuilder sb=new StringBuilder()" IN IT AND THEN APPEND VALUES " sb.append(str).append(" ");" BY TRAVERSSION WHOLE ARRAY
         * TEHN RETRUN THE STRING TO PSVM USING return sb.toString();
         */
        String[] array=new String[]{
            "I","am","siddhesh","and","i","am","learning","java"
        };
        
        Array_to_String aw=new Array_to_String(array);
        System.out.println(aw);
    }
}
