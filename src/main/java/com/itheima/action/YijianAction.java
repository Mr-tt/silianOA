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
import com.itheima.domain.Yijianb;
import com.itheima.service.ChuchaiService;
import com.itheima.service.YijianService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
@Controller("yijianAction")
public class YijianAction extends ActionSupport implements ModelDriven<Yijianb>{
	@Resource(name="yijianService")
	private YijianService yijianService;
	
	//模型驱动，接受前台填的表格
	private Yijianb yjb = new Yijianb();
	@Override
	public Yijianb getModel() {
		return this.yjb;
	}
	
	/**
	 * 增加意见
	 * @return
	 */
	public String add(){
		this.yijianService.saveEntity(this.getModel());
		return "add";
	}
	
	
	
	
	
}
