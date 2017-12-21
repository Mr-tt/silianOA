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
	
	//模型驱动，接受前台填的表格
	private Chuchaib cc = new Chuchaib();
	@Override
	public Chuchaib getModel() {
		return this.cc;
	}
	
	/**
	 * 增加出差汇报表
	 * @return
	 */
	public String add(){
		System.err.println("***chuchaiAction_add***");
		//从session中取出user对象（在登录时就把user放入到了session中了）
		User u  = (User) ActionContext.getContext().getSession().get("user");
		if(u==null){
			this.addActionError("登陆超时，请重新登陆！");
			return "e";
		}else{
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
			String riqi = df.format(new Date());//获取当前时间。。将格式转化为上面的形式
			cc.setJbsj(riqi);
			
			cc.setUsername(u.getUsername());
			cc.setShzt("未审核");
			
			//获取文件存储路径   /Library/Tomcat7/webapps/web49_oa/upload
			String path = ServletActionContext.getRequest().getRealPath("/upload"); //  /Library/Tomcat7/webapps/web49_oa/upload
			System.err.println("8****"+path);
			String uuid = UUID.randomUUID().toString();
			//String fenge = System.getProperty("file.separator");
			String[] paths = path.split("\\\\"); // 根据不同系统得到不同的分割符
			String zipaiFilename = this.getModel().getZipaiFileName();      //XX.png
			if(zipaiFilename!=null){
				String[] zipaiFilenames = zipaiFilename.split("\\.");           // [xx , png]
				String newzipaiFilename = uuid+"."+zipaiFilenames[zipaiFilenames.length -1]; // uuid.png
				String newPath = paths[paths.length-1]+System.getProperty("file.separator")+uuid+"."+zipaiFilenames[zipaiFilenames.length-1]; // upload/uuid.png
				System.err.println("**"+newPath);
				String fileType = this.getModel().getZipaiContentType();		//image/png
				cc.setZipaiPath(newPath);
				//输出流  
				OutputStream os;
				try {
					os = new FileOutputStream(new File(path,newzipaiFilename));
					InputStream is = new FileInputStream(this.getModel().getZipai());   //输入流 
					byte[] buf = new byte[1024];  
					int length = 0 ;  
					
					while(-1 != (length = is.read(buf) ) )  
					{  
						os.write(buf, 0, length) ;  
					}  
					is.close();  
					os.close(); 
				} catch (Exception e) {
					System.err.println("**文件上传出错！**");
					e.printStackTrace();
				}  
				
			}
			}
			
			
			
			this.chuchaiService.saveEntity(cc);
			
          
		return "add";
	}
	
	/**
	 * 审批列出要审批的表(按照交表时间倒序排列)
	 * @return
	 */
	public String shenpi(){
		Collection<Chuchaib> ccs = this.chuchaiService.daoxulistChuchai();
		ActionContext.getContext().put("ccs", ccs);
		return "list";
	}
	
	/**
	 * 跳转到审核页面
	 * @return
	 */
	public String shenheUI(){
		Chuchaib cc = this.chuchaiService.findEntityById(this.getModel().getCcid());
		ActionContext.getContext().getValueStack().push(cc);
		return "shenheUI";
	}
	
	public String shenheTG(){
		Chuchaib cc = this.chuchaiService.findEntityById(this.getModel().getCcid());
		cc.setShzt("审核通过");
		this.chuchaiService.updateEntity(cc);
		
		return "2shenpi";
	}
	
	public String shenheBTG(){
		Chuchaib cc = this.chuchaiService.findEntityById(this.getModel().getCcid());
		cc.setShzt("审核不通过");
		this.chuchaiService.updateEntity(cc);
		
		return "2shenpi";
	}
	
	
	
	
	
	
	
	
	
}
