package com.java8;

import com.java8.pojo.Employee;

import java.util.ArrayList;
import java.util.List;

public class DummyData {
    public static List<Employee> employees = new ArrayList<>();
    static {
        employees.add(new Employee(1, "John", 25));
        employees.add(new Employee(2, "Rob", 26));
        employees.add(new Employee(3, "Catelin", 42));
        employees.add(new Employee(4, "Araya", 15));
        employees.add(new Employee(5, "Sansa", 20));
    }
}
