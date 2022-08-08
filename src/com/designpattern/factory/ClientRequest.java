package com.designpattern.factory;

public class ClientRequest {
    public static void main(String[] args) {
        ProfessionFactory professionFactory = new ProfessionFactory();
        Profession profession = professionFactory.getProfession("Engineer");
        profession.print();
        Profession profession1 = professionFactory.getProfession("Accountant");
        profession1.print();
    }
}
