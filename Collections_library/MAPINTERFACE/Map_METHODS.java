package MAPINTERFACE;

import java.util.HashMap;
import java.util.Map;

public class Map_METHODS {
    public static void main(String[] args) {
        Map<String,Integer> pairs=new HashMap<>();

        //TO ADD VALUES TO RESPECTIVE KEYS
        pairs.put("SIDDHESH",100);
        pairs.put("SIDDHU",10);
        pairs.put("SID",90);
        pairs.put("RAHUL",45);
        //DUPLICATE KEYS ARE NOT ALLOWED AS WELL AS IF DUPLICATE KEY IS PRESENT IT WILL UPDATE THE VALUE
        //IF I WIRTE AGAIN pairs.put("RAHUL",95); THEN NOW IT WILL UPDATE THE VALUES OF THATSPECIFIC KEY
        pairs.put("RAHUL",95);

        System.out.println(pairs);

        //TO GET THE SIZE OF MAP
        System.out.println(pairs.size());

        //ACCESS THE VALUE THAT ARE MAPPED TO KEY
        System.out.println(pairs.get("SIDDHESH"));

        //TO CHECK WHTHER KEY IS PRESENT OR NOT IN 
        System.out.println(pairs.containsKey("SIDDHESH"));
        System.out.println(pairs.containsKey("SIDDHESHSAWANT"));


        //REMOVE KEYS FROM MAP
        pairs.remove("SID");
        System.out.println(pairs);

        System.out.println();
        //ITERATE WHOLE MAP
        //MAKE USE OF .keySet() TO GET ALL KEYS IN A SET
        for(String key:pairs.keySet()){
            System.out.println(key + ":" + pairs.get(key));
        }

        System.out.println(pairs.values());
    }
}
