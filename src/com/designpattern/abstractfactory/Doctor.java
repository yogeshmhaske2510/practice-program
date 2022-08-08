package com.designpattern.abstractfactory;

import com.designpattern.abstractfactory.Profession;

public class Doctor implements Profession {
    @Override
    public void print() {
        System.out.println("I am an Doctor!!!");
    }
}
