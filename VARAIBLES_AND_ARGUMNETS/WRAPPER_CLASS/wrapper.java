package  WRAPPER_CLASS;
public class wrapper 
{
public static void main(String[] args) {
    //PRIMITIVE DATAYPES 
    int num=7;

    //WRAPPER CLASS
    //WRAPPER CLASS MEANS WRAPPER AROUND PRIMITVE DATATYPE
    //IF WE SEE HERE Integer a IT REFEERS TO REFERENCE THUS WE STORED OBJECT IN REFERENCE
    //SIMILARLY HERE AUTOBOXING OCCURS MEANS num WHICH IS PRIMITIVE DATA TYPE ARE AUTOMATICALLY  CONVERTED INTO OBJECT BASED ON MATCHING OF WRAPPER CLASS
    Integer a=num;

    //THIS IS UNBOXING AS WE ARE TAKING OUT PRIMITVE VALUE FROM OBJCET AND STORED IT IN PRIMITIVE DATATYPE VARAIBLE
    int num2=Integer.valueOf(a); 
    System.out.println(num2);

    //TO GET AN INTEGER FROM STRING WE CAN USE PARSEINT FROM INTEGER WRAPPER CLASS
    String str="12";
    int num3=Integer.parseInt(str);
    System.out.println(num3*2);
    
    

} 
}
