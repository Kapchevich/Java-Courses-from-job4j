package ru.job4j.bank;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private double value;
    private String requisites;

    public Account() {

    }

    public void setValue(double value) {
        this.value = value;
    }

    public Account(double value, String requisites) {
        this.value = value;
        this.requisites = requisites;

    }

    public double getValue() {
        return value;
    }

    public String getRequisites() {
        return requisites;
    }

    boolean transfer(Account srcBank, Account dstBank, double amount) {
        srcBank.value -= amount;
        dstBank.value += amount;
        return true;
    }
}
