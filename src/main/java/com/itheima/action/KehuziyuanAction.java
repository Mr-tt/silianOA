package com.itheima.action;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.itheima.domain.Kehuziyuanb;
import com.itheima.domain.User;
import com.itheima.service.ChuchaiService;
import com.itheima.service.KehuziyuanService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
@Controller("kehuziyuanAction")
public class KehuziyuanAction extends ActionSupport implements ModelDriven<Kehuziyuanb>{
	@Resource(name="kehuziyuanService")
	private KehuziyuanService kehuziyuanService;
	
	private Kehuziyuanb khb = new Kehuziyuanb();
	
	@Override
	public Kehuziyuanb getModel() {
		return this.khb;
	}
	
	public String add(){
		
		User user = (User) ActionContext.getContext().getSession().get("user");//��session��ȡ��user
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
		String riqi = df.format(new Date());//��ȡ��ǰʱ�䡣������ʽת��Ϊ�������ʽ
		
		String[] qys = this.khb.getQy().split(", ");
		String[] khmcs = this.khb.getKhmc().split(", ");
		String[] dzs = this.khb.getDz().split(", ");
		String[] khxxlys = this.khb.getKhxxly().split(", ");
		String[] ybfs = this.khb.getYbf().split(", ");
		
		for(int i = 0 ;i<qys.length;i++){
			Kehuziyuanb k = new Kehuziyuanb();
			k.setQy(qys[i]);
			k.setKhmc(khmcs[i]);
			k.setDz(dzs[i]);
			k.setKhxxly(khxxlys[i]);
			k.setYbf(ybfs[i]);
			k.setTbr(user.getUsername());
			k.setTbrq(riqi);
			this.kehuziyuanService.saveEntity(k);
			//�õ���ÿ���������ݣ����Խ��в������ݿ����
		}
		
		return SUCCESS;
	}
	
	/*
	 * ����������ڣ������г����еĿͻ���Դ����
	 */
	public String list(){
		Collection<Kehuziyuanb> khbs = this.kehuziyuanService.daoxuList();
		ActionContext.getContext().put("khbs", khbs);
		return "list";
	}
	
}
