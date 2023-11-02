package com.course.syntax;

import java.util.*;
import java.util.stream.Stream;

public class Aggregation {
    public static void main(String[] args) {
        //firstTask();
        //secondTask();
        //thirdTask();
        Map<String, String> map = new HashMap<>();//this Map applicable for 4th task
        map.put("Tom", "Chrome");
        map.put("Bob", "Job");
        map.put("Alice", "Belize");
        System.out.println(sortMap(map));

    }

    //Task 1: create a collection that will have only unique elements and will sort elements after adding new element.
    public static void firstTask() {
        TreeSet<Integer> myTreeSet = new TreeSet<>();
        myTreeSet.add(23);
        myTreeSet.add(12);
        myTreeSet.add(4);
        for (Integer i : myTreeSet) {
            System.out.print(i + " ");
        }
    }


    //Task 2: create a map of Users with key= id field of user and print all Users with even id.
    public static void secondTask() {
        HashMap<Integer, String> users = new HashMap<>();
        users.put(101, "John");
        users.put(102, "Sara");
        users.put(103, "David");
        users.put(104, "Tina");
        for (Map.Entry<Integer, String> entry : users.entrySet()) {
            if (entry.getKey() % 2 == 0) {
                System.out.println(entry);
            }
        }
    }

    //Task 3: collapse set and list with Strings to one collection.
    // Set has values: Olya, Natasha, Polina, Vlad and
    // list has values: Bohdan, Oleksandr, Vlad, Natasha.
    // Print all values of result collection to console.
    public static void thirdTask() {
        HashSet<String> someSet = new HashSet<>();
        someSet.add("Olya");
        someSet.add("Natasha");
        someSet.add("Polina");
        someSet.add("Vlad");
        ArrayList<String> someList = new ArrayList<>();
        someList.add("Bohdan");
        someList.add("Oleksandr");
        someList.add("Vlad");
        someList.add("Natasha");
        Stream<String> combinedStream = Stream.of(someSet, someList).flatMap(Collection::stream);
        Collection<String> collectionCombined = combinedStream.toList();
        System.out.println(collectionCombined);
    }

    //Task 4: create a static method that accept like argument map(key and value Strings).
    // Method must return sorted map(key and value Strings), that has only 3 characters keys.
    static Map<String, String> sortMap(Map<String, String> map) {

        Map<String, String> sortedMap = new TreeMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().length() == 3) {
                sortedMap.put(entry.getKey(), entry.getValue());
            }
        }
        return sortedMap;
    }
}
