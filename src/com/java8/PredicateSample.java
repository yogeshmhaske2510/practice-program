package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateSample {
    public static void main(String[] args) {
        List<String> lists = Arrays.asList("Windows","Linux","Apple","Ubuntu");
        /*
        * Predicate for length greater than 5
        * */
        Predicate<String> lengthCheck = str -> str.length() > 4;
        List<String> filterList = lists.stream().filter(s-> lengthCheck.test(s)).collect(Collectors.toList());
        System.out.println(filterList);

        /*
        * Predicate chaining with and
        * */
        Predicate<String> initialCheck = str -> str.startsWith("A");
        List<String> filterList1 = lists.stream().filter(s-> lengthCheck.and(initialCheck).test(s)).collect(Collectors.toList());
        System.out.println(filterList1);

        /*
         * Predicate chaining with or
         * */
        List<String> filterList2 = lists.stream().filter(s-> lengthCheck.or(initialCheck).test(s)).collect(Collectors.toList());
        System.out.println(filterList2);

        /*
         * Predicate chaining with negate
         * */
        List<String> filterList3 = lists.stream().filter(s-> lengthCheck.negate().test(s)).collect(Collectors.toList());
        System.out.println(filterList3);
    }
}
