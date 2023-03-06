package ru.innopolis.object.myWork;

public class Main {

	public static void main(String[] args) {
		Car car = new Car("Honda", 1);
		System.out.println(car);
		Car car2 = new Car("Honda", 1);
		Car car3 = new Car("Toyota", 1);
		System.out.println(car.equals(car));
		System.out.println(car.equals(car2));
		System.out.println(car.equals(car3));
	}
}
