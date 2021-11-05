package CollectionsAndGenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestCollection_List_ComparatorInterface {

    public static void main (String args[]){

        List <Integer>values = new ArrayList<Integer>();

        values.add(305);
        values.add(998);
        values.add(774);
        values.add(236);
        values.add(881);

        //example with a custom comparator class
        //Comparator<Integer> com = new CompImp();

        //example with a anonymous class
       /* Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o, Integer o1) {

                if (o>o1)
                    return 1;

                return -1;
            }
        };*/

        //example with a anonymous class, but now with lambda
/*        Comparator<Integer> com = ( o,  o1) -> {

            if (o > o1)
                return 1;

            return -1;
        };*/

        //example with a anonymous class, but now with lambda and conditional operator
        Comparator<Integer> com = ( o,  o1) -> {

            return o>o1?1:-1;
        };




        //use sort with two parameter, one the values, the second one a custom class who define the order
        Collections.sort(values,com);

        //with new way to iterate
         for(int i: values){

            System.out.println(i);
        }



    }
}
