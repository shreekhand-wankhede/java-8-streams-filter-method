package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<String> citiesList = new ArrayList<>();
        citiesList.add("Pune");
        citiesList.add("Banglore");
        citiesList.add("Chennai");
        citiesList.add("Hyderabad");
        citiesList.add("Mumbai");
        List<String> cityListStartsWithNamePu = citiesList.stream().filter(p -> p.startsWith("Pu")).collect(Collectors.toList());
        System.out.println(cityListStartsWithNamePu);

    }
}
