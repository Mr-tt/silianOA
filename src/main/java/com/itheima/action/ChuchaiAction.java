package com.itheima.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.itheima.domain.Chuchaib;
import com.itheima.domain.User;
import com.itheima.service.ChuchaiService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
@Controller("chuchaiAction")
public class ChuchaiAction extends ActionSupport implements ModelDriven<Chuchaib>{
	@Resource(name="chuchaiService")
	private ChuchaiService chuchaiService;
	
	//ģ������������ǰ̨��ı��
	private Chuchaib cc = new Chuchaib();
	@Override
	public Chuchaib getModel() {
		return this.cc;
	}
	
	/**
	 * ���ӳ���㱨��
	 * @return
	 */
	public String add(){
		System.err.println("***chuchaiAction_add***");
		//��session��ȡ��user�����ڵ�¼ʱ�Ͱ�user���뵽��session���ˣ�
		User u  = (User) ActionContext.getContext().getSession().get("user");
		if(u==null){
			this.addActionError("��½��ʱ�������µ�½��");
			return "e";
		}else{
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
			String riqi = df.format(new Date());//��ȡ��ǰʱ�䡣������ʽת��Ϊ�������ʽ
			cc.setJbsj(riqi);
			
			cc.setUsername(u.getUsername());
			cc.setShzt("δ���");
			
			//��ȡ�ļ��洢·��   /Library/Tomcat7/webapps/web49_oa/upload
			String path = ServletActionContext.getRequest().getRealPath("/upload"); //  /Library/Tomcat7/webapps/web49_oa/upload
			System.err.println("8****"+path);
			String uuid = UUID.randomUUID().toString();
			//String fenge = System.getProperty("file.separator");
			String[] paths = path.split("\\\\"); // ���ݲ�ͬϵͳ�õ���ͬ�ķָ��
			String zipaiFilename = this.getModel().getZipaiFileName();      //XX.png
			if(zipaiFilename!=null){
				String[] zipaiFilenames = zipaiFilename.split("\\.");           // [xx , png]
				String newzipaiFilename = uuid+"."+zipaiFilenames[zipaiFilenames.length -1]; // uuid.png
				String newPath = paths[paths.length-1]+System.getProperty("file.separator")+uuid+"."+zipaiFilenames[zipaiFilenames.length-1]; // upload/uuid.png
				System.err.println("**"+newPath);
				String fileType = this.getModel().getZipaiContentType();		//image/png
				cc.setZipaiPath(newPath);
				//�����  
				OutputStream os;
				try {
					os = new FileOutputStream(new File(path,newzipaiFilename));
					InputStream is = new FileInputStream(this.getModel().getZipai());   //������ 
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
			}
			
			
			
			this.chuchaiService.saveEntity(cc);
			
          
		return "add";
	}
	
	/**
	 * �����г�Ҫ�����ı�(���ս���ʱ�䵹������)
	 * @return
	 */
	public String shenpi(){
		Collection<Chuchaib> ccs = this.chuchaiService.daoxulistChuchai();
		ActionContext.getContext().put("ccs", ccs);
		return "list";
	}
	
	/**
	 * ��ת�����ҳ��
	 * @return
	 */
	public String shenheUI(){
		Chuchaib cc = this.chuchaiService.findEntityById(this.getModel().getCcid());
		ActionContext.getContext().getValueStack().push(cc);
		return "shenheUI";
	}
	
	public String shenheTG(){
		Chuchaib cc = this.chuchaiService.findEntityById(this.getModel().getCcid());
		cc.setShzt("���ͨ��");
		this.chuchaiService.updateEntity(cc);
		
		return "2shenpi";
	}
	
	public String shenheBTG(){
		Chuchaib cc = this.chuchaiService.findEntityById(this.getModel().getCcid());
		cc.setShzt("��˲�ͨ��");
		this.chuchaiService.updateEntity(cc);
		
		return "2shenpi";
	}
	
	
	
	
	
	
	
	
	
}
