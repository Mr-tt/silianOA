package com.itheima.action;

import java.util.Collection;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.itheima.domain.Menuitem;
import com.itheima.service.MenuitemService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
@Controller("menuitemAction")
public class MenuitemAction extends ActionSupport implements ModelDriven<Menuitem>{
	@Resource(name="menuitemService")
	private MenuitemService menuitemService;
	private Menuitem menuitem = new Menuitem();
	

	public void setMenuitem(Menuitem menuitem) {
		menuitem = menuitem;
	}

	@Override
	public Menuitem getModel() {
		// TODO Auto-generated method stub
		return this.menuitem;
	}
	
	public String showMenuitems(){
		Collection<Menuitem> ms = this.menuitemService.queryEntity();
		ActionContext.getContext().getValueStack().push(ms);
		return SUCCESS;
	}
	
	public String showMtreeByPid(){
		System.err.println("=======");
		System.err.println(this.getModel().getPid());
		Collection<Menuitem> mlist = this.menuitemService.getMtreeByPId(this.getModel().getPid());
		System.err.println(mlist);
		ActionContext.getContext().getValueStack().push(mlist);
		return SUCCESS;
	}

	
	
	
}
