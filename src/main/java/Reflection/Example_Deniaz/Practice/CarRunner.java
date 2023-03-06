package Reflection.Example_Deniaz.Practice;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * 1. Создать класс Car с полями String brand и String model.
 * Создать аннотации @Table (принимает название схемы и таблицы
 * в базе данных) и @Column (принимает название колонки в таблице
 * базы данных). Пометить класс аннотацией @Table и поля
 * аннотацией @Column. Написать программу, принимающую
 * объект класс  Car c проинициализированными полями и
 * составляющую запрос "INSERT" в виде строки на основании
 * данных объекта.
 *     Пример: дан объект Car car = new Car("Toyota", "Corolla");
 *     Программа, принимающая этот объект, должна вывести в консоль строку:
 * "INSERT INTO garage.car (model, brand) VALUES ('Toyota', 'Corolla');"
 *
 * 2. Для получения данных программа должна
 * использовать только get-методы (нельзя использовать
 * значения приватных полей).
 */

public class CarRunner {
	public static void main(String[] args) {
		Car car = new Car("Toyota", "Corolla");
		System.out.println(car);
		System.out.println(generateInsert(car));

    }
	private static String generateInsert(Car car) {
		String template = "INSERT INTO %s.%s (%s) VALUES (%s);";
		Table table = car.getClass().getAnnotation(Table.class);
		Field[] fields = car.getClass().getDeclaredFields();

		String fieldNames = Arrays.stream(fields)
				.filter(field -> field.isAnnotationPresent(Column.class))
				.sorted(Comparator.comparing(Field::getName))
				.map(field -> field.getAnnotation(Column.class))
				.map(Column::name)
				.collect(Collectors.joining(","));


		String fieldValues = Arrays.stream(fields)
			.filter(field -> field.isAnnotationPresent(Column.class))
				.peek(field -> field.setAccessible(true))
			.map(field -> {
				try {
					return String.valueOf(field.get(car));
				} catch (IllegalAccessException e) {
					e.printStackTrace();
					return "";
				}
			})
				.map(value -> "'" + value + "'")
			.collect(Collectors.joining(","));
		return String.format(template, table.shema(), table.name(), fieldNames, fieldValues);
	}
}
