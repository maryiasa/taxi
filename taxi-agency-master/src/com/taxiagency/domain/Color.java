package com.taxiagency.domain;

import java.util.Random;

public enum Color {
    Black, Red, White, Green, Orange, Metalic, Grey;

    public static Color wishColor() {
        Color[] colors = Color.values();
        Random generator = new Random();
        return colors[generator.nextInt(colors.length)];
    }
}
