package com.designpattern.singletone;

public class Main {
    public static void main(String[] args) {
        SingletoneClass instance = SingletoneClass.getInstance();
        System.out.println("Singletone object : "+instance);
    }
}
