package ru.innopolis.object;

public class Main3 {
    public static void main(String[] args) {
        Human human = new Human(29, 1568);
        Human human1 = new Human(28, 100);

        // вызывает у human метод toString()
        // получает строку и выводит ее в консоль
        System.out.println(human);
        System.out.println(human1);
    }
}
