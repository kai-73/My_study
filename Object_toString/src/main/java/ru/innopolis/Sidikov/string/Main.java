package ru.innopolis.string;

public class Main {

    public static void main(String[] args) {
        String s1 = "Hello!";
        String s2 = "Hello!";
        String x1 = "Bye!";
        String x2 = "Bye!";
        String s3 = new String("Hello!");

        String anotherS1 = s1.replace("H", "X");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3); // false

        System.out.println(s1.equals(s3)); // true
    }
}
