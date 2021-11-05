package Steams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SteamsExample
{

    public static void main (String arg[]){

        List<String> cities = Arrays.asList("Amsterdam", "Miami", "Buenos Aires", "Abu Dhabi", "Albacete", "Dublin", "London");
        // steam always returns a steam object till the last result
        System.out.println(cities.stream()
                .filter(city -> city.startsWith("A")) // set filter
                .map(city -> city.toUpperCase()) // set uppercase values
                .collect(Collectors.joining(",")) //put as separator , character
        );



    }

}
