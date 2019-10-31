package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void ride() {
        System.out.println("Bus rides");

    }

    @Override
    public void passengers(int num) {
        System.out.println("Passengers on the bus: " + num);
    }

    @Override
    public int refill(int fuelNum) {
        int price = 32;
        return fuelNum * price;
    }
}
