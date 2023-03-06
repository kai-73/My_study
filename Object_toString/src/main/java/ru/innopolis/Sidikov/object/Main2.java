package ru.innopolis.object;

public class Main2 {
    public static void main(String[] args) {
        Human a1 = new Human(28, 1598);
        Human a2 = new Human(28, 1598);
        Human a3 = new Human(29, 1598);

        System.out.println(a1 == a2);

        System.out.println(a1.equals(a2));
        System.out.println(a1.equals(a1));
        System.out.println(a3.equals(a1));
    }
}
