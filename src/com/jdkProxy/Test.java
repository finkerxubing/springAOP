package com.jdkProxy;

public class Test {
	@org.junit.Test
	public void test01() {
		UserDao userDao=new UserDaoImpl();
//		userDao.save();
//		userDao.update();
//		userDao.find();
//		userDao.delete();
		
		UserDao proxy=new JDKProxy(userDao).createProxy();	
		proxy.save();
		proxy.update();
		proxy.find();
		proxy.delete();
	}
}
