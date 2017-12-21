package privilege.interceptor;

import java.util.Collection;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.itheima.domain.Privilege;
import com.itheima.domain.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import privilege.annotation.PrivilegeAnnotationParse;

public class PrivilegeInterceptor implements Interceptor{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.err.println("*********进入了PrivilegeInterceptor********");
		/**
		 * 1、获取用户能够访问到的权限
		 * 2、得到访问的方法中需要的权限
		 * 3、检查用户的权限(存放在session域中)是否包含该方法需要的权限
		 * 		包含： 则集训访问，
		 * 		不包含：则跳转到错误页面
		 */
		//1--
		Collection<Privilege> privileges = (List<Privilege>) ServletActionContext.getRequest().getSession().getAttribute("fprivileges");
		User user =  (User) ServletActionContext.getRequest().getSession().getAttribute("user");
		//2-获取当前请求的方法名  userAction_show.action  得到 ： show
		String methodName = invocation.getProxy().getMethod();
		//2-获得当前请求的action类  得到 userAction
		Class targetClass = invocation.getAction().getClass();
		//privilege : 方法上注解的权限名
		String privilege = PrivilegeAnnotationParse.pase(targetClass, methodName);
		
		boolean flag = false;
		//3-检查用户权限
		if(privilege.equals("")){  //如果方法上没有加权限控制：则都可以访问
			flag = true;
		}else if(user.getUsername().equals("admin")){ //访问者为admin用户时，都可以访问
			flag = true;
		}else{
			for(Privilege p : privileges){
				if(p.getName().equals(privilege)){
					flag=true;
					break;
				}
			}
		}
		if(flag){
			return invocation.invoke();
		}else {
			ActionContext.getContext().getValueStack().push("权限不足，无法访问");
			return "error";
		}
	}

}
