package Statements.ForLoops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionIterations {

    public static void main(String args[]) {

        List<Integer> values = new ArrayList<Integer>();

        values.add(3);
        values.add(99);
        values.add(77);
        values.add(2);
        values.add(88);


        Collections.sort(values);


        //using the old methodoly for size.
        for (int i = 0; i < values.size(); i++) {

            System.out.println("Posicion: " + i + " value: " + values.get(i));

        }



        //using the old Interface Iterator for collections

        /*Iterator i = values.iterator();

        while (i.hasNext()){

            System.out.println(i.next());


        }*/



        //with new way to iterate with Object/Integer/int (if we uses a generic as Integer as example)
/*
         for(int i: values){

            System.out.println(i);
        }*/





        //new way to iterate from java 8 with lambda expressions

        //values.forEach(System.out::println); //Strem API .. Lambda Expression

    }
}