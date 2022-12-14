public class SuperPrivate {
	private String name;
	private String lastName;

	private SuperPrivate(String name) {
		this.name = name;
		this.lastName = "Hairullin";
	}

	private void print() {
		System.out.println("PRIVATE HELLO " + name + " " + lastName);
	}

	@Override
	public String toString() {
		return "Использует конструктор superPrivate{" +
				"name='" + name + '\'' +
				", lastName='" + lastName + '\'' +
				'}';
	}
}
