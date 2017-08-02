package cn.shop.server;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import cn.shop.bean.User;
import cn.shop.dao.UserDao;

public class IndexServer {
	private UserDao dao;
	
	public UserDao getDao() {
		return dao;
	}


	public void setDao(UserDao dao) {
		this.dao = dao;
	}
	public void test() {
		User user = new User();
		user.setName("test");
		dao.saveUser(user);
	}
}
