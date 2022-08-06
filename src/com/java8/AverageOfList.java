package com.java8;

import java.util.Arrays;
import java.util.List;

public class AverageOfList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Double aDouble = list.stream().mapToInt(x->x).average().orElse(0);
        System.out.println("Average of given list : "+aDouble);
    }
}
