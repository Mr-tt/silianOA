package com.itheima.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.itheima.domain.Chakanb;
import com.itheima.domain.User;
import com.itheima.service.ChakanService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
@Controller("chakanAction")
public class ChakanAction extends ActionSupport implements ModelDriven<Chakanb> {
	@Resource(name="chakanService")
	private ChakanService chakanService;
	
	//ģ������������ǰ̨�������ı��
	private Chakanb ckb = new Chakanb();
	@Override
	public Chakanb getModel() {
		return this.ckb;
	}
	
	
	
	
	public String add(){
		System.out.println("into***chankanAction_add");
		
		User u = (User) ActionContext.getContext().getSession().get("user");
		if(u==null){
			this.addActionError("��½��ʱ�������µ�½��");
			return "e";
		}else{
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String riqi = sd.format(new Date());
			ckb.setJbrq(riqi);
			//��ȡ�ļ��洢·��   /Library/Tomcat7/webapps/web49_oa/upload
			String path = ServletActionContext.getRequest().getRealPath("/upload"); //  /Library/Tomcat7/webapps/web49_oa/upload
			String uuid1 = UUID.randomUUID().toString();
			String uuid2 = UUID.randomUUID().toString();
			//String fenge = System.getProperty("file.separator");
			String[] paths = path.split("\\\\"); // ���ݲ�ͬϵͳ�õ���ͬ�ķָ��
			String gdfatName = this.getModel().getGdfatFileName();      //XX.png
			if(gdfatName!=null){
				String[] gdfatNames = gdfatName.split("\\.");           // [xx , png]
				String newgdfatName = uuid1+"."+gdfatNames[gdfatNames.length -1]; // uuid.png
				String newPath = paths[paths.length-1]+System.getProperty("file.separator")+uuid1+"."+gdfatNames[gdfatNames.length-1]; // upload/uuid.png
				String fileType = this.getModel().getGdfatContentType();		//image/png
				ckb.setGdfatPath(newPath);
				//�����  
				OutputStream os;
				try {
					os = new FileOutputStream(new File(path,newgdfatName));
					InputStream is = new FileInputStream(this.getModel().getGdfat());   //������ 
					byte[] buf = new byte[1024];  
					int length = 0 ;  
					
					while(-1 != (length = is.read(buf) ) )  
					{  
						os.write(buf, 0, length) ;  
					}  
					is.close();  
					os.close(); 
				} catch (Exception e) {
					System.err.println("**�ļ��ϴ�����**");
					e.printStackTrace();
				}  
			}
			String dhdfatName = this.getModel().getDhdfatFileName();      //XX.png
			if(dhdfatName!=null){
				String[] dhdfatNames = dhdfatName.split("\\.");           // [xx , png]
				String newdhdfatName = uuid2+"."+dhdfatNames[dhdfatNames.length -1]; // uuid.png
				String newPath = paths[paths.length-1]+System.getProperty("file.separator")+uuid2+"."+dhdfatNames[dhdfatNames.length-1]; // upload/uuid.png
				String fileType = this.getModel().getDhdfatContentType();		//image/png
				ckb.setDhdfatPath(newPath);
				//�����  
				OutputStream os;
				try {
					os = new FileOutputStream(new File(path,newdhdfatName));
					InputStream is = new FileInputStream(this.getModel().getDhdfat());   //������ 
					byte[] buf = new byte[1024];  
					int length = 0 ;  
					
					while(-1 != (length = is.read(buf) ) )  
					{  
						os.write(buf, 0, length) ;  
					}  
					is.close();  
					os.close(); 
				} catch (Exception e) {
					System.err.println("**�ļ��ϴ�����**");
					e.printStackTrace();
				}  
			}
			this.chakanService.saveEntity(ckb);
			return "add";
		}
	}
	
	public String list(){
		Collection<Chakanb> ckbs = this.chakanService.queryEntity();
		ActionContext.getContext().put("ckbs", ckbs);
		return "list";
	}
	
	public String shenheUI(){
		
		Chakanb ckb = this.chakanService.findEntityById(this.getModel().getCkbId());
		ActionContext.getContext().getValueStack().push(ckb); 
		return "shenheUI";
	}
	
	
	
	
	
}
