package sample;

import java.io.Serializable;

public class AccountOwnerInfo implements Serializable {

    String name;
    String father;
    String mother;
    String nidNum;
    double cgpa;

    public AccountOwnerInfo(String name, String father, String mother, String nidNum, double cgpa) {
        this.name = name;
        this.father = father;
        this.mother = mother;
        this.nidNum = nidNum;
        this.cgpa = cgpa;

    }



}
