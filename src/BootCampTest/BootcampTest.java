package BootCampTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BootcampTest {

    public static void main(String args[]) {
        List<String> cities = new ArrayList<>();
        cities.add("Zurich");
        cities.add("London");
        cities.add("Amsterdam");
        cities.add("Madrid");
        cities.add("Buenos Aires");
        cities.add("Berlin");


       Collections.sort(cities);

       for (String city : cities){

           System.out.println(city);

       }

    }
}