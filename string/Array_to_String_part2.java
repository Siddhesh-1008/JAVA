public class Array_to_String_part2 {
    public static void main(String[] args) {
        String[] array=new String[]{
            "I","am","siddhesh","and","i","am","learning","java"
        };

        StringBuilder sb=new StringBuilder();
        for(String str:array){
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}
