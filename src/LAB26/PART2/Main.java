package LAB26.PART2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<City> cities = List.of(new City("New York", "USA"), new City("Atlanta", "USA"),new City("Moscow", "Russia"),new City("SPB", "Russia"));

        Map<String, ArrayList<String>> citiesMap = new HashMap<>();
        for (City city : cities) {
            if (!citiesMap.containsKey(city.getName())) {
                citiesMap.put(city.getName(), new ArrayList<>());
            }
            citiesMap.get(city.getName()).add(city.getCountry());
        }

        citiesMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}