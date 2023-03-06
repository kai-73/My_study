package Reflection.Airat;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MainOld {
	public static void main(String[] args) throws Exception {
		Class superPrivate = Class.forName("Reflection.Airat.SuperPrivate");

		Constructor declaredConstructor = superPrivate.getDeclaredConstructor(String.class);
		declaredConstructor.setAccessible(true);
		Object instance = declaredConstructor.newInstance("Ayrat");
		System.out.println("-------------------------------------");

		Field declaredField = superPrivate.getDeclaredField("name");
		declaredField.setAccessible(true);
		declaredField.set(instance, "Ayrat");
		System.out.println("-------------------------------------");

		System.out.println("Invoke private method");
		Method declaredMethod = superPrivate.getDeclaredMethod("print");
		declaredMethod.setAccessible(true);
		declaredMethod.invoke(instance);
		System.out.println("-------------------------------------");

		System.out.println("declaredFields in Object class");
		Field[] declaredFields = superPrivate.getDeclaredFields();
		System.out.println("Count of fields in class: " + declaredFields.length);
		Arrays.stream(declaredFields).forEach(System.out::println);
		System.out.println("-------------------------------------");

		System.out.println("declaredMethods in Object class");
		Method[] declaredMethods = superPrivate.getDeclaredMethods();
		System.out.println("Count of methods in class: " + declaredMethods.length);
		Arrays.stream(declaredMethods).forEach(System.out::println);
		System.out.println("-------------------------------------");

//        System.out.println("declaredFields in Object class");
//        Field[] declaredFields = Object.class.getDeclaredFields();
//        System.out.println("Count of fields in class: " + declaredFields.length);
//        Arrays.stream(declaredFields).forEach(System.out::println);
//        System.out.println("-------------------------------------");
//
//        System.out.println("declaredMethods in Object class");
//        Method[] declaredMethods = Object.class.getDeclaredMethods();
//        System.out.println("Count of methods in class: " + declaredMethods.length);
//        Arrays.stream(declaredMethods).forEach(System.out::println);
//        System.out.println("-------------------------------------");


//        List<Integer> odd = new ArrayList<>(100000000);
//        long before = System.nanoTime();
//        System.out.println("BEFORE: " + before);
//        for (int i = 0; i < 100000000; i++) { //                 5bln      50bln
//             if ((i & 0b1) != 1) odd.add(i); // bit operation    138449400  18363588500
//             if ((i % 2) == 0) odd.add(i); // classic operation  154988400  18978666500
//        }
//        System.out.println(odd.size());
//        long after = System.nanoTime();
//        System.out.println("AFTER: " + after);
//        System.out.println("DELTA: " + (after - before));
	}
}