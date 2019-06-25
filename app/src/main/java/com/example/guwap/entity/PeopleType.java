package com.example.guwap.entity;

import android.util.Log;

import java.util.Random;

public enum PeopleType {
    TROGOLODYTE (0),
    BANDIT (1),
    AMERICAN (2),
    MEXICAN (3),
    CHEYENNE (4),
    APACHE (5),
    COMANCHE (6),
    NAVAJO (7);

    private final int code;

    PeopleType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static PeopleType randPeopleType() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

}