package cn.shop.action;

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
		LogUtil.get().info("index");
		return SUCCESS;
	}
	
}
