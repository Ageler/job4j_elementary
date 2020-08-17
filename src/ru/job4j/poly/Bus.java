package ru.job4j.poly;

public class Bus implements Transport {

    private int price = 41;

    @Override
    public void ride() {
        System.out.println("Bus is riding");
    }

    @Override
    public void passengers(int number) {
        System.out.println("There are " + number + " passengers in the bus");
    }

    @Override
    public int tankUp(int fuel) {
        return fuel * price;
    }
}
