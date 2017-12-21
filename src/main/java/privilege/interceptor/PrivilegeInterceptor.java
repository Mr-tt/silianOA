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
		System.err.println("*********������PrivilegeInterceptor********");
		/**
		 * 1����ȡ�û��ܹ����ʵ���Ȩ��
		 * 2���õ����ʵķ�������Ҫ��Ȩ��
		 * 3������û���Ȩ��(�����session����)�Ƿ�����÷�����Ҫ��Ȩ��
		 * 		������ ��ѵ���ʣ�
		 * 		������������ת������ҳ��
		 */
		//1--
		Collection<Privilege> privileges = (List<Privilege>) ServletActionContext.getRequest().getSession().getAttribute("fprivileges");
		User user =  (User) ServletActionContext.getRequest().getSession().getAttribute("user");
		//2-��ȡ��ǰ����ķ�����  userAction_show.action  �õ� �� show
		String methodName = invocation.getProxy().getMethod();
		//2-��õ�ǰ�����action��  �õ� userAction
		Class targetClass = invocation.getAction().getClass();
		//privilege : ������ע���Ȩ����
		String privilege = PrivilegeAnnotationParse.pase(targetClass, methodName);
		
		boolean flag = false;
		//3-����û�Ȩ��
		if(privilege.equals("")){  //���������û�м�Ȩ�޿��ƣ��򶼿��Է���
			flag = true;
		}else if(user.getUsername().equals("admin")){ //������Ϊadmin�û�ʱ�������Է���
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
			ActionContext.getContext().getValueStack().push("Ȩ�޲��㣬�޷�����");
			return "error";
		}
	}

}
