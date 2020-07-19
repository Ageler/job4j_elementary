package ru.job4j.oop;

public class Doctor extends Profession {
    private String position;
    private int experience;

    public String getPosition() {
        return position;
    }

    public int getExperience() {
        return experience;
    }

    public Diagnosis heal(Patient patient) {
        return null;
    }

}
