package privilege.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.METHOD)  //该注解用于方法上
@Retention(RetentionPolicy.RUNTIME)  //运行时的注解
public @interface PrivilegeInfo {
	String name() default "";		//注解的默认值为""

}
