package cn.shop.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.shop.bean.User;

public class UserDao extends HibernateDaoSupport{

	public void saveUser(User user) {
		this.getHibernateTemplate().save(user);
	}
	
	/**
	 * 用户名是否存在,true表示存在
	 * @return
	 */
	public boolean userNameIsExist(String userName) {
		 List<User> list= getHibernateTemplate().find("select User u where u.userName = "+userName);
		 return list.size()>0;
	}
	
}
