package com.cglib;

public class Test {
	@org.junit.Test
	public void Test01() {
		CustomerDao customerDao=new CustomerDao();
//		customerDao.save();
//		customerDao.update();
//		customerDao.find();
//		customerDao.delete();
		
		CustomerDao proxy=new CglibProxy(customerDao).createProxy();
		proxy.save();
		proxy.update();
		proxy.find();
		proxy.delete();
	}
}
