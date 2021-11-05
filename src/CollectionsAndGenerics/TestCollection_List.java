package CollectionsAndGenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestCollection_List {

    public static void main (String args[]){

        List <Integer>values = new ArrayList<Integer>();

        values.add(3);
        //values.add("programming");
        //values.add(5.8f);
        values.add(99);
        values.add(77);
        values.add(2);
        values.add(88);


        Collections.sort(values);

        //with new way to iterate
/*        for(int i: values){

            System.out.println(i);
        }*/

        //new way to iterate from java 8

        values.forEach(System.out::println); //Strem API .. Lambda Expression



    }
}
