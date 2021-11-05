package CollectionsAndGenerics;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

 class SetExample {

    public static void main (String arg[]){
        //hasset is not ordered
        //Set<Integer> values = new HashSet<>();

        Set<Integer> values = new TreeSet<>();

        System.out.println(values.add(87));
        System.out.println(values.add(97));
        System.out.println(values.add(34));
        System.out.println(values.add(92));
        System.out.println(values.add(87));//it does not allow duplicate values

        for (int i:values){
            System.out.println(i);
        }


    }


}
