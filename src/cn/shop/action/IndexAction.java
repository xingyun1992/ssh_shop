package cn.shop.action;

import javax.servlet.ServletContext;

import org.apache.commons.logging.impl.Log4JLogger;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import cn.shop.server.IndexServer;
import cn.shop.utils.LogUtil;

import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport{

	private IndexServer indexServer;
	
	public void setIndexServer(IndexServer indexServer) {
		this.indexServer = indexServer;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		LogUtil.getLog().info("index");
		indexServer.test();
		return SUCCESS;
	}
	
}
