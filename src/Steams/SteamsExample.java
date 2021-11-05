package Steams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SteamsExample
{

    public static void main (String arg[]){

        List<String> cities = Arrays.asList("Amsterdam", "Miami", "Buenos Aires", "Abu Dhabi", "Albacete", "Dublin", "London");

        System.out.println(cities.stream()
                .filter(city -> city.startsWith("A"))
                .map(city -> city.toUpperCase())
                .collect(Collectors.joining(","))
        );



    }

}
