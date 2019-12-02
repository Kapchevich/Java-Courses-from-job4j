package ru.job4j.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserConvert {
    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> map = new HashMap<>();
        for (User i : list){
            map.put(i.getId(),i);
        }

        return map;
    }

    public static void main(String[] args) {
        UserConvert a = new UserConvert();


    }
}
