package ru.innopolis.string;

import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        Random random = new Random();

        String randomString = "";

        for (int i = 0; i < 100; i++) {
            // 100 объектов!!!
            randomString = randomString + random.nextInt(10);
        }

        System.out.println(randomString);
    }
}
