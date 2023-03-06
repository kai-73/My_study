package ru.innopolis.string;

import java.util.Random;

public class Main3 {
    public static void main(String[] args) {
        Random random = new Random();

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 100; i++) {
            builder.append(random.nextInt(100));
        }

        String randomString = builder.toString();


        System.out.println(randomString);
    }
}
