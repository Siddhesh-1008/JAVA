package  CHALLENGES.challenge1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Challenge3 
{
    /*
     * Create a Map where the keys are country names (as String) and the values are their capitals (also String).
     *  Populate the map with at least five countries and their capitals.
     *  Write a program that prompts the user to enter a country name and then displays the corresponding capital, if it exists in the map.
     */
    public static void main(String[] args) 
    {
        /*
         * CREATE A MAP FOR STORING KEY VALUE PAIRS AS KEY MUST CONTAIN COUNTRY NAME AND VALUE CONTAIN CAPITAL NAME
         * THEN ADD NAME AND CAPITAL TO MAP
         * THEN CREATE A SCANNER CLASS TO TAKE THE INPUT(MEANS COUNTRY NAME)
         * THEN CREATE A DO WHILE LOOP 
         * HERE LOOP WILL BREAK IF U ENTERED EXIT
         * THEN INSIDE DO LOOP CHECK WHTEHR KEY EXISTS OR NOT
         * IF KEY EXISTS GIVE THE VALUE THAT HAS BEEN MAPPED TO THE KEY
         * IF KEY NOT PRESNT THEN DISPLAY CAPITAL DOESNOT PRESNETS
         */

        //CREATE MAP DATA STRUCTURE
        Map<String,String> countrymap=new HashMap<>();

        //ADD KEY VALUE PAIRS TO MAP DATA STRUCTURE
        countrymap.put("INDIA","NEW DELHI");
        countrymap.put("PAKISTAN","ISLAMABAD");
        countrymap.put("BANGLADESH","DHAKA");

        Scanner input=new Scanner(System.in);
        String name;
        do 
        { 
            System.out.print("PLEASE ENTER THE COUNTRY NAME:- ");
            //TAKE INPUT FRO THE USER
            name=input.next();

            //CHECK WHETHER KEY EXISTS
            if(countrymap.containsKey(name))
            {
                System.out.println("COUNTRY:- "+ name + " AND ITS CAPITAL IS:- "+ countrymap.get(name));
            }
            else
            {
                System.out.println("THIS COUNTRY NAME DOESNT EXISTS");
            }
  
        } 
        //IF INPUT IS EQUAL TO EXISTS THEN BREAK THE DO WHILE LOOP
        while (!(name.equals("EXIT")));
    }

}

