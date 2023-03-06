//import java.lang.reflect.Constructor;
//import java.lang.reflect.Field;
//import java.lang.reflect.Method;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Main {
//	public static void main(String[] args) throws Exception {
// <Integer> odd = new ArrayList<>(100000000);
//        long before = System.nanoTime();
//        System.out.println("BEFORE: " + before);
//        for (int i = 0; i < 100000000; i++) { //                 5bln      50bln
//             if ((i & 0b1) != 1) odd.add(i); // bit operation    138449400  18363588500
//             if ((i % 2) == 0) odd.add(i); // classic operation  154988400  18978666500
//        }
//        System.out.println(odd.size());
//        long after = System.nanoTime();
//        System.out.println("AFTER: " + after);
//        System.out.println("DELTA: " + (after -before));
//	}
//}
