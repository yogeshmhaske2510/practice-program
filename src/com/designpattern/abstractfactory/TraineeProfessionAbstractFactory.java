package com.designpattern.abstractfactory;

public class TraineeProfessionAbstractFactory extends AbstractFactory{
    @Override
    public Profession getProfession(String typeOfProfession) {
        if(typeOfProfession == null){
            return null;
        } else if (typeOfProfession.equalsIgnoreCase("Doctor")) {
            return new TraineeDoctor();
        } else if (typeOfProfession.equalsIgnoreCase("Engineer")) {
            return new TraineeEngineer();
        }
        return null;
    }
}
