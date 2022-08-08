package com.designpattern.abstractfactory;

public class ProfessionAbstractFactory extends AbstractFactory{

    @Override
    public Profession getProfession(String typeOfProfession) {
        if(typeOfProfession == null){
            return null;
        }
        if(typeOfProfession.equalsIgnoreCase("Doctor")){
            return new Doctor();
        } else if (typeOfProfession.equalsIgnoreCase("Engineer")) {
            return new Engineer();
        }
        return null;
    }
}
