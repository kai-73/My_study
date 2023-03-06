package Reflection.Airat;

public class SuperPrivate {
	private String name;
	private int age;
	private boolean isFool;

	private SuperPrivate(String name) {
		this.name = name;
		this.age = 30;
	}
	private SuperPrivate(int age) {
		this.name = "Oleg";
		this.age = age;
	}

	private SuperPrivate(String name, int age) {
		this.name = name;
		this.age = age;
		this.isFool = false;
	}

	private void print() {
		System.out.println("PRIVATE HELLO " + name + " " + age);
	}

	@Override
	public String toString() {
		return "Использует конструктор superPrivate{" +
				"name='" + name + '\'' +
				", age='" + age + '\'' +
				'}';
	}
}
