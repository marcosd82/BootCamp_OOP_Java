package CollectionsAndGenerics;

import java.util.ArrayList;
import java.util.Vector;

public class VertorsVsArraysList {

    public static void main (String args[]){
        ArrayList<Integer> v = new ArrayList<>(); // 50 % in each increse space // Not ThreadSav // fast
        //Vector<Integer> v = new Vector<Integer>(); // 100 of last size ocuped //TheadSav //Slow
        v.add(4);
        v.add(3);
        v.add(4);
        v.add(5);
        v.add(4);
        v.add(8);
        v.add(4);
        v.add(7);
        v.add(1);
        v.add(1);
        v.add(1);

        System.out.println("capacity of ArrayList: "+ v.size()); // 9  next -> 11
        //System.out.println("capacity of vector: "+ v.capacity()); // 10 next -> 20

        for (int i :v){
            System.out.println(i);

        }

    }

}
