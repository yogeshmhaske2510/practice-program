package com.designpattern.factory;

public class Accountant implements Profession{
    @Override
    public void print() {
        System.out.println("I am an Accountant!!!");
    }
}
