package Reflection.Example_Deniaz;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({
		ElementType.TYPE, // TYPE-т.к. б\т исп-ся в классе
		ElementType.FIELD
})
@Retention(RetentionPolicy.RUNTIME)
public @interface MinAge {
	int age() default 18;
}
