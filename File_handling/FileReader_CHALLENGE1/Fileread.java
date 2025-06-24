package FileReader_CHALLENGE1;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/*
 * 
 */
public class Fileread
{
    public void readfile(String filename)
    {
        try(FileReader reader=new FileReader(filename))
        {
            System.out.println("MY FILE NAME IS:- "+filename);
            /*
             * HERE reader.read() RETURNS INTEGER AND ONCE THAT INTEGER GETS EQUAL TO -1 THIS MEANS U HAD READ THE STREAM OF CHARACTERS FROM THE FILE
             * (char) read BASICALLY EXCPLICITLY TYPECAST THE INTEGER INTO CAHRACTER
             */
            int read;
            while((read=reader.read())!=-1)
            {
                System.out.print((char)read);   
            }
        } 
        catch(FileNotFoundException e)
        {
            System.out.printf("%s FILE HAS NOT BEEN FOUND",filename);
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        

    }
    public static void main(String[] args)
    {
        /*
         * File Not Found Exception Handling
            Write a program to read a filename from the user and display itscontent. 
            The program should handle the situation where the file does not exist.
            Key Points:
                . Use Scanner to read the filename from the user.
                . Use FileReader to read the file content.
                . Implement a try-catch block to handle FileNotFoundException.
                . Display a message informing the user if the file is not found.
         */
        /*
         * FIRST GET THE NAME OF THE FILE
         * SECOND READ FILE 
         * THEN READ EACH CAHRACTER IN THAT FILE
         * AS reader.read() RETRUNS INTEGER CORRESPONDENCE TO CHARACTER 
         * SO WE ARE TYPE CASTING(char) THE INTEGER""read" TO CHARACTER "(char) read" 
         * IF READ GETS EQUAL TO -1 THEN IT STATES THAT WHOLE STREAM OF CHARACTERS ARE BEEN READ
         * MAKE USE OF TRY CATCH TO HANDLE THE EXCEPTION
         * HERE WE ARE USING TRY WITH RESOURCES BASICALLY IT IS USED FOR AUTOMATICALLY CLOSING THE FILEREADER OBJECT
         */
        try(Scanner input=new Scanner(System.in))
        {
        System.out.print("ENTER THE FILE NAME THAT U WANT TO READ:- ");
        
        String filename=input.nextLine().trim();
        if(filename.isEmpty())
        {
            //IF NO FILENAME HAS BEEN GIVEN THEN THROW THE EXCEPTION WHICH WILL CATCH BELOW
            throw new Exception("KUCH THO LIKHO");
        }
        else
        {
            //CREATE OBJECT AND ASSIGN FILE NAME TO CREATEFILE METHOD
            Fileread fr=new Fileread();
            fr.readfile(filename);
        }
        }
        catch (Exception e) 
        {
            //CATCH THE THROW EXCEPTION
            System.out.println("SORRY :- " + e.getMessage());
        }

    }
}
