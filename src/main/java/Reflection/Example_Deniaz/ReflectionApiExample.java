package Reflection.Example_Deniaz;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionApiExample {
	public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
		User user = new User(25L, "Ivan", 24);
		testMethods(user);
		//testFields(user);
//		Class<? extends User> userClass = user.getClass();
//		Class<User> userClass1 = User.class;
//		System.out.println(userClass == userClass1);
//		System.out.println(userClass);
//		System.out.println(userClass1);
//		String s1 = new String("Ivan");
//		System.out.println(s1.getClass());
//		System.out.println(String.class);
		//testConstructor();
	}

	private static void testConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
		Constructor<User> constructor = User.class.getConstructor(Long.class, String.class);
		User iya = constructor.newInstance(36L, "Iya");
			System.out.println(iya);
	}

	private static void testFields(User user) throws IllegalAccessException {
		Field[] declaredFields = User.class.getDeclaredFields();
		for (Field declaredField : declaredFields) {
			declaredField.setAccessible(true);
			Object value = declaredField.get(user);
			System.out.println(value);
			System.out.println(declaredField.getModifiers());
		}
	}

	private static void testFields(Object object) throws IllegalAccessException {
		Field[] declaredFields = object.getClass().getDeclaredFields();
		for (Field declaredField : declaredFields) {
			declaredField.setAccessible(true);
			Object value = declaredField.get(object);
			System.out.println(value);
		}
	}
	private static void testMethods(User user) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
		Method method = user.getClass().getDeclaredMethod("setName", String.class);
		//Method method1 = User.class.getDeclaredMethod("getName");

		method.invoke(user, "Iya");
		System.out.println(user);

	}


	private class Test1 {

	}

	private static class Test3 {

	}

	private enum Test2 {
		ONE, TWO
	}


}

