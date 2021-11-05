package PredicateAndFunction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class PredicateExampleWithFunction {

    // Java program to illustrate
    // passing Predicate into function

    static void pred(int number, Predicate<Integer> predicate)
    {
        if (predicate.test(number)) {
            System.out.println("Number " + number);
        }
    }
    public static void main(String[] args)
    {
        pred(10, (i) -> i > 7);
    }
}
