package ru.innopolis.object;

public class Main {
    public static void main(String[] args) {
        Object obj;


        Human marsel = new Human(28, 1598);

        obj = marsel;

        System.out.println(marsel == obj);

    }
}