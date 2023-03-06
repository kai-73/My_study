package Reflection.Airat;

public class Clazz {
	public static void main(String[] args) {
		Class claz = Integer.class;
		System.out.println(claz.toString());
		Class claz1 = "123".getClass();
		System.out.println(claz1);
		Class s = int.class;
		String name = s.getName();
		System.out.println(name);
		System.out.println(int.class.getSimpleName());
	}
}
