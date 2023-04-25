package com.gschoudhary.java8.FunctionalProgramming;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class InBuiltFunctionalInterfaces {
    public static void main(String[] args) {
        Predicate<String> predicate = (x) -> x.length() > 10;
        Function<String, Integer> function = (str) -> str.length();
        BiFunction<String, String, Integer> biFunction = (str1, str2) -> (str1 + str2).length();

    }
}
