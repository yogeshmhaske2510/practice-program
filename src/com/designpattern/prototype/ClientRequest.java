package com.designpattern.prototype;

public class ClientRequest {
    public static void main(String[] args) {
        ProfessionCache.loadProfessionCache();
        Profession docProfession = ProfessionCache.getCloneNewProfession(2);
        System.out.println(docProfession);

        Profession actProfession = ProfessionCache.getCloneNewProfession(1);
        System.out.println(actProfession);

        Profession docProfession1 = ProfessionCache.getCloneNewProfession(2);
        System.out.println(docProfession1);

    }
}
