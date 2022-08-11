package com.java8;

import com.java8.pojo.Employee;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionSample {
    public static void main(String[] args) {
        Function<Employee, Integer> function = emp -> emp.getAge() + 2;
        List<Integer> updatedAge = DummyData.employees.stream().map(emp-> function.apply(emp)).collect(Collectors.toList());
        System.out.println(updatedAge);

        Function<Integer, Integer> doubleIt = i-> i*2;
        Function<Integer, Integer> cubeIt = i-> i*i*i;

        System.out.println("square "+doubleIt.apply(2));
        System.out.println("cube "+cubeIt.apply(2));

        System.out.println("using andThen "+doubleIt.andThen(cubeIt).apply(2));
        System.out.println("using compose "+doubleIt.compose(cubeIt).apply(2));

        BiFunction<Integer, Integer, Integer> biFunction = (x,y) -> x*y;
        System.out.println("BiFunction example : "+biFunction.apply(2,5));

    }
}
