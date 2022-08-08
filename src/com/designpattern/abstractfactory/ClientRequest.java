package com.designpattern.abstractfactory;

public class ClientRequest {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(false);
        Profession profession = abstractFactory.getProfession("Doctor");
        profession.print();
    }
}
