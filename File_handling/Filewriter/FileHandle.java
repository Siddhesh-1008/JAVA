package Filewriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class  FileHandle
{


    public void createFile(String filename)
    {
        /*
        FileWriter writer=new FileWriter(filename) ): used for CREATING FILE
        try(FileWriter writer=new FileWriter(filename) ):-TRY WITH RESOURCES TO AUTOMATICALLY CLOSE THE WIRTER OBJECT 
        writer.write("HI THIS IS SIDDHESH"); BASICALY WRITTER OBJECT CALLS WRITE METHOD AND ADD THAT TEXT TO IT
        riter.flush(); //OPTIONAL BASICALLY IT SAYS ALL STREAM OF CAHARATERS HAD BEEN  WRITTEN IN FILE
        */
        try(FileWriter writer=new FileWriter(filename))
        {
            //WRITE TEXT INSIDE THE FILE
            writer.write("HI THIS IS SIDDHESH");
            //OPTIONAL BASICALLY IT SAYS ALL STREAM OF CAHARATERS HAD BEEN  WRITTEN IN FILE
            writer.flush();
            System.out.println("FILE WRITTEN AND CREATED");
        } 
        catch (IOException e) 
        {
            System.out.println("AN ERROR OCCURED:-" + e.getMessage());
        }
    }

    public static void main(String[] args)
    {
        /*
         * FIRST GET THE NAME OF THE FILE
         * SECOND CREATE FILE CREATER OBJECT AND CREATE A NEW FILE WITH THAT NAME
         * THEN WRITE THE TEXT IN THAT FILE
         * THEN ONCE DONE FLUSH IT (OPTIONAL) BASICALLY U ARE TELLING THAT I HAD COMPLETED WRITING STREAM OF CHARACTERS
         * MAKE USE OF TRY CATCH TO HANDLE THE EXCEPTION
         * HERE WE ARE USING TRY WITH RESOURCES BASICALLY IT IS USED FOR AUTOMATICALLY CLOSING THE FILEWRITER OBJECT
         */
        try(Scanner input =new Scanner(System.in))
        {
        System.out.print("ENTER THE FILE NAME");
        /*
         * Use nextLine() instead of next() because nextLine() will capture the entire line of input, including spaces
         * Then you can trim it to remove extra spaces and check if the resulting string is empty.
         */
        String filename=input.nextLine().trim();
        if(filename.isEmpty())
        {
            //IF NO FILENAME HAS BEEN GIVEN THEN THROW THE EXCEPTION WHICH WILL CATCH BELOW
            throw new Exception("KUCH THO LIKHO");
        }
        else
        {
            //CREATE OBJECT AND ASSIGN FILE NAME TO CREATEFILE METHOD
            FileHandle fh=new FileHandle();
            fh.createFile(filename);
        }
        }
        catch (Exception e) 
        {
            //CATCH THE THROW EXCEPTION
            System.out.println("SORRY :- " + e.getMessage());
        }

    }
    
}