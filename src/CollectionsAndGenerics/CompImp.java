package CollectionsAndGenerics;

import java.util.Comparator;

public class CompImp implements Comparator<Integer> {

    @Override
    public int compare(Integer o, Integer o1) {

        if (o>o1)
            return 1;

        return -1;
    }


}
