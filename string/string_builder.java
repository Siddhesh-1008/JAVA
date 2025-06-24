public class string_builder
{
    //INSTANCE PROPERTIES
    String name;

    //CONSTRUCTOR
    string_builder(String name)
    {
        this.name=name;
    };

    //TO STRING METHOD
    //overide basically overrides default to string method
    @Override
    public String toString()
    {
        StringBuilder sentence =new StringBuilder("My name is ");
        sentence.append(name);
        return sentence.toString();
    };


    public static void main(String[] args)
    {
        string_builder sb=new string_builder("siddhesh");
        //BASICALLY sb.toString() CALLED public String toString() METHOD 
        //IN THAT public String toString() METHOD WE CREATE STRING BUILDER OBJECT AND THEN APPEND NAMES IN THAT OBJECT 
        System.out.println(sb.toString());
    }
    
}