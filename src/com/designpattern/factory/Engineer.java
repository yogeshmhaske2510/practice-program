package com.designpattern.factory;

public class Engineer implements Profession{
    @Override
    public void print() {
        System.out.println("I am an Engineer!!!");
    }
}
