package com.designpattern.prototype;

import java.util.Hashtable;

public class ProfessionCache {
    private static Hashtable<Integer, Profession> professionMap = new Hashtable<Integer, Profession>();

    public static Profession getCloneNewProfession(int id) {
        Profession cacheProfessionInstance = professionMap.get(id);
        return (Profession) cacheProfessionInstance.cloningMethod();
    }

    public static void loadProfessionCache() {
        Accountant accountant = new Accountant();
        accountant.id = 1;
        professionMap.put(accountant.id, accountant);

        Doctor doctor = new Doctor();
        doctor.id = 2;
        professionMap.put(doctor.id, doctor);

        Engineer engineer = new Engineer();
        engineer.id = 3;
        professionMap.put(engineer.id, engineer);
    }
}
