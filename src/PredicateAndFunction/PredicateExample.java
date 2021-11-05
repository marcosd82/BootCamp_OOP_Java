package PredicateAndFunction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class PredicateExample {

    public static void  main (String args[]){


        List<Integer> taeIds = new ArrayList<Integer>();

        Map<Integer,String> myMap = new HashMap<>();

        myMap.put(1,"Avin");
        myMap.put(2,"Peter");
        myMap.put(3,"Maiana");

        Predicate<String> myPredicate = (employee) -> "TAE".equals(employee);

        for (Map.Entry<Integer, String> entry : myMap.entrySet()) {

            if (myPredicate.test(entry.getValue())) {

                taeIds.add(entry.getKey());
            }

        }

        taeIds.forEach(System.out::println);

    }
}
