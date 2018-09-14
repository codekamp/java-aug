package codekamp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> xyz = new ArrayList<>();
        xyz.add("Amit");
        xyz.add("Sumit");
        xyz.add("Rohit");

        List<String> names = new ArrayList<>();

        names.add("Suresh");
        names.add("Ramesh");
        names.add("Dharmesh");

        System.out.println(names);

        names.set(1, "Jignesh");


        System.out.println(names);

        names.add(1, "Mahesh");


        System.out.println(names);

        names.remove(1);


        System.out.println(names);


        names.addAll(xyz);

        System.out.println(names.indexOf("hello"));
        System.out.println(names);

        for(int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }


        // any class which has iterator() function can be looped over using
        // ...foreach loop
        for(String n: names) {
            System.out.println(n);
        }


        HashMap<String, Integer> countryPopulation = new HashMap<>();

        countryPopulation.put("India", 1000);
        countryPopulation.put("China", 1200);

        System.out.println(countryPopulation.get("India"));

        for(String key: countryPopulation.keySet()) {
            System.out.println(key);
            System.out.println(countryPopulation.get(key));
        }

    }
}