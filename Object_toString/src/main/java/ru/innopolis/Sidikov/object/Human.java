package ru.innopolis.object;

import java.util.Objects;

public class Human {
    private int age;
    private int friendsCount;

    public Human(int age, int friendsCount) {
        this.age = age;
        this.friendsCount = friendsCount;
    }

    public int getAge() {
        return age;
    }

    public int getFriendsCount() {
        return friendsCount;
    }

    @Override
    public boolean equals(Object obj) {
        // проверим, а вдруг obj - это тот же самый объект
        // вдруг объект сравнивается сам с собой
        if (this == obj) {
            return true;
        }

        // надо проверить, а ссылается ли obj на объект того же класса, что и исходный
        if (obj instanceof Human) {
            // мы точно знаем, что за obj прячется другой объект типа Human
            // проверяем два разных объекта
            // сначала нужно сделать из obj экземпляр Human
            // нисходящее преобразование
            // вы создаете переменную, которая указывает на объект
            // на который раньше указывал другой тип
            Human that = (Human) obj;

            return this.age == that.age &&
                    this.friendsCount == that.friendsCount;

//            return Objects.equals(this.age, that.age) &&
//                    Objects.equals(this.friendsCount, that.friendsCount);

        } else {
            return false;
        }


    }

    @Override
    public String toString() {
        return "Человек, у которого "
                + this.friendsCount + " друзей в " + this.age + " лет";
    }
}
