package ru.job4j.map;

import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> data = new HashMap<>();

    public boolean add(Citizen citizen) {
       boolean rsl = false;
        if (data.get(citizen.getPassport()) == null) {
           data.put(citizen.getPassport(), citizen);
           rsl = true;
       } else {
            rsl = false;
        }
        return rsl;

    }


    public Citizen get(String passport) {
        if (data.get(passport) == null) {
            System.out.println("Passport not found");
        }
        return data.get(passport);
    }
}
