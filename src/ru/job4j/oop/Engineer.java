package ru.job4j.oop;

public class Engineer extends Profession {
    private String type;
    private boolean civil;

    public String getType() {
        return type;
    }

    public boolean isCivil() {
        return civil;
    }

    public Building build(Drawing drawing) {
        return null;
    }

}
