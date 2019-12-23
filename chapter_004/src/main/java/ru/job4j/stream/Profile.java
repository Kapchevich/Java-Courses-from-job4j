package ru.job4j.stream;

public class Profile {
    public Address getAddress() {
        return address;
    }

    private Address address;

    public Profile(Address address) {
        this.address = address;
    }
}
