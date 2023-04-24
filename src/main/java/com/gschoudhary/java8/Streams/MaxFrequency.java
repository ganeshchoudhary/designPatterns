package com.gschoudhary.java8.Streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxFrequency {
    //  creation of streams -> from array, string, file , collection,
//    transformation and filter
//    reduce -> max, min,
//    collect is used to collect elements in list,set, map, ect
//    note util classes and functions-> collections, Arrays, Comparator,
    public static void getMaxOccurredInt(Integer[] array) {


        Map<Integer, Long> map = Arrays.stream(array).collect(Collectors.groupingBy(Function.identity(),  Collectors.counting()));
        System.out.println(map);

        Map.Entry<Integer, Long> maxEntry = Collections.max(map.entrySet(), (e1, e2) -> e1.getValue().compareTo(e2.getValue()));
        System.out.println(maxEntry);
        Map.Entry<Integer, Long> minEntry = Collections.min(map.entrySet(), Comparator.comparing(Map.Entry::getValue));
        System.out.println(minEntry);

        Comparator<Map.Entry<Integer, Long>> comparator = (o1, o2) -> (int) (o1.getValue() - o2.getValue());
        List<Map.Entry<Integer, Long>> list1 = new ArrayList<>(map.entrySet());
        Collections.sort(list1, comparator);
        list1.forEach(x ->
                System.out.println(x.getKey() + " - " + x.getValue())
        );


//        max digit repeation

        String arrayString = Arrays.stream(array).map(String::valueOf).collect(Collectors.joining());
        System.out.println(arrayString);
        List<Character> characterList = new ArrayList<>();
        for (Character c : arrayString.toCharArray()) {
            characterList.add(c);
        }

        Map<Character, Long> map3 = characterList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map3.entrySet().stream().filter(e -> e.getValue() <= 2).forEach(System.out::println);

        Map<Character, List<Character>> map2 = characterList.stream().collect(Collectors.groupingBy(x -> x, Collectors.mapping(x -> x, Collectors.toList())));
        map2.entrySet().stream().forEach(System.out::println);


        char c = map3.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get().getKey();
        System.out.println("max c  " + c);
    }

    public static void main(String[] args) {
        getMaxOccurredInt(new Integer[]{1, 2, 3, 4, 133, 4, 2});
    }
}
