package ru.innopolis.object.myWork;

public class Car {
	private String model;
	private int age;

	public Car(String model, int age) {
		this.model = model;
		this.age = age;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof Car) {
			Car that = (Car)obj;
            return this.model.equals(that.model) && this.age == that.age;
        } else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Car{" +
				"model='" + model + '\'' +
				", age=" + age +
				'}';
	}

}
