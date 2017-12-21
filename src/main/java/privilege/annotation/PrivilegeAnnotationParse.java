package privilege.annotation;

import java.lang.reflect.Method;

public class PrivilegeAnnotationParse {
	public static String pase(Class targetClass, String methodName) throws NoSuchMethodException, SecurityException{
		String privilegeName = "";
		Method method = targetClass.getMethod(methodName);
		if(method.isAnnotationPresent(PrivilegeInfo.class)){ //�ж�method���Ƿ���� PrivilegeInfo��ע��
			PrivilegeInfo privilegeInfo = method.getAnnotation(PrivilegeInfo.class);
			privilegeName = privilegeInfo.name();
		}
		return privilegeName;
	}
	
//	public static String pase(Class targetClass , String methodName) throws NoSuchMethodException, SecurityException{
//		String privilegeName="";
//		Method method = targetClass.getMethod(methodName);
//		if(targetClass.isAnnotationPresent(PrivilegeInfo.class)){
//			PrivilegeInfo privilegeInfo = method.getAnnotation(PrivilegeInfo.class);
//			privilegeName = privilegeInfo.name();
//		}
//		return privilegeName;
//	}
}
