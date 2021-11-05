package CollectionsAndGenerics;

import java.util.ArrayList;
import java.util.Collection;

public class TestColletionTypeParameters {

    public static void main (String args[]){

        Collection <Integer>values = new ArrayList<Integer>();

        values.add(3);
        //values.add("programming");
        //values.add(5.8f);
        values.add(77);
        values.add(88);

        values.remove(77);


        //with new way to iterate (here we can use Object/Integer/ even int !!)
        for(int i: values){

            System.out.println(i);
        }



    }
}
