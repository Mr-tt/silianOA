package privilege.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.METHOD)  //��ע�����ڷ�����
@Retention(RetentionPolicy.RUNTIME)  //����ʱ��ע��
public @interface PrivilegeInfo {
	String name() default "";		//ע���Ĭ��ֵΪ""

}
