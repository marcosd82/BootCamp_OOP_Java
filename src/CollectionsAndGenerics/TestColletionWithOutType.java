package CollectionsAndGenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestColletionWithOutType {

    public static void main (String args[]){

        Collection values = new ArrayList();

        values.add(3);
        values.add("programming");
        values.add(5.8f);
        values.add(77);

        //with old iterator

       /* Iterator i = values.iterator();

        while (i.hasNext()){

            System.out.println(i.next());


        }*/


        //with new way to iterate
        for(Object i: values){

            System.out.println(i);
        }



    }
}
