package com.designpattern.abstractfactory;

public class TraineeDoctor implements Profession{
    @Override
    public void print() {
        System.out.println("I am an Trainee Doctor!!!");
    }
}
