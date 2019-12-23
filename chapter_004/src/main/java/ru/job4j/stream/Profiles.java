package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    List<Address> collect(List<Profile> profiles) {
        List<Address> list = profiles.stream().map(profile -> profile.getAddress()).distinct().sorted(Comparator.comparing(Address::getCity)).collect(Collectors.toList());
        return list;
    }

    public static void main(String[] args) {
    }
}
