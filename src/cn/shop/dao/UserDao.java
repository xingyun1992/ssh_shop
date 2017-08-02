package cn.shop.dao;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.shop.bean.User;

public class UserDao extends HibernateDaoSupport{

	public void saveUser(User user) {
		this.getHibernateTemplate().save(user);
	}
	
}
