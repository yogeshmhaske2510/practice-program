package com.java8;

import com.java8.pojo.User;

import java.util.*;
import java.util.stream.Collectors;

public class GroupBy {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User(1, "abc"),
                new User(2, "pqr"),
                new User(3, "xyz"),
                new User(4, "prq"),
                new User(1, "xyz"));

        /*
        * Grouping by user id
        * */
        Map<Integer, List<User>> userMap = users.stream().collect(Collectors.groupingBy(u-> u.getId()));
        System.out.println(userMap);

        /*
        * Grouping with unique values
        * */
        Map<Integer, Set<User>> uniqueUserMap = users.stream().collect(Collectors.groupingBy(u-> u.getId(), Collectors.toSet()));
        System.out.println(uniqueUserMap);

        /*
        * Grouping with unique and sorted values
        * */
        Map<Integer, Set<User>> uniqueAndSortedUserMap = users.stream().collect(Collectors.groupingBy(u-> u.getId(), TreeMap::new,  Collectors.toSet()));
        System.out.println(uniqueAndSortedUserMap);
    }
}