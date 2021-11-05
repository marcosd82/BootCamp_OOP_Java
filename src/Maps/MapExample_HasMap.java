package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample_HasMap {


    public static void main (String arg[]){

        //Map interface, HasMap class is not sychronized, it is fast, works with single thread, allows one null key
        Map<String,String> map = new HashMap<>();

        map.put("myName","Avin");
        map.put("actor","Peter");
        map.put("ceo","Maiana");
        //map.put("actor","Meliza");if add a new value with same key, the old value is replaced for the new one

        //use set because it allows to iterate the hashMap due to there is not a index, there are keys
        Set<String> keys = map.keySet();

        for (String key:keys){
            System.out.println(key+" "+map.get(key));
        }

    }

}
