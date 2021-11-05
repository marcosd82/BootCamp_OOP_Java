package Maps;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapExample_HashTable {


    public static void main (String arg[]){

        //Map interface, HashTable  class, is sychronized, its slow, works with multiple threads, does not allow null key
        Map<String,String> map = new Hashtable<>();

        map.put("myName","Avin");
        map.put("actor","Peter");
        map.put("ceo","Maiana");
        //map.put("actor","Meliza");if add a new value with same key, the old value is replaced for the new one

        //use set because it allows to iterate the hashMap due to there is not a index, there are keys
        //keySet returns all keys
        Set<String> keys = map.keySet();

        for (String key:keys){
            System.out.println(key+" "+map.get(key));
        }

    }

}
