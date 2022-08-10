package com.java8;

import com.java8.pojo.Employee;

import java.text.Collator;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class MaxMinSumAverage {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(2, "Yogesh", 20),
                new Employee(1, "Manoj", 15),
                new Employee(3, "Satish", 10),
                new Employee(4, "Adyansh", 5));

        /*
        * find min max average sum of given data
        * */
        List<Integer> ages = employees.stream().map(e-> e.getAge()).collect(Collectors.toList());
        IntSummaryStatistics summary = ages.stream().mapToInt(a -> a).summaryStatistics();
        System.out.println(summary);
        System.out.println("Min "+summary.getMin()+" Max "+summary.getMax());

        /*
        * make in sorted order
        * */
        List<Integer> sortedAges = employees.stream().map(e->e.getAge()).sorted().collect(Collectors.toList());
        System.out.println("Sorted age "+ages);

        /*
        * Get 2nd and 3rd youngest age
        * */
        List<Integer> sliceList = ages.stream().skip(1).limit(2).collect(Collectors.toList());
        System.out.println(sliceList);

        /*
        * Get all names and make a comma separated string
        * */
        List<String> names = employees.stream().map(e-> e.getName()).sorted().collect(Collectors.toList());
        String nameStr = names.stream().map(name-> name.toUpperCase()).collect(Collectors.joining(", "));
        System.out.println(nameStr);

    }
}

