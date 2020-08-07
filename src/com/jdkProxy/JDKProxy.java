package com.jdkProxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 使用JDK动态代理对userDao产生代理
 * @author 13696
 *
 */
public class JDKProxy implements  java.lang.reflect.InvocationHandler{
	private UserDao userDao;
	public JDKProxy(UserDao userDao) {
		this.userDao=userDao;
	}
	public UserDao createProxy() {
		UserDao userDaoProxdy=(UserDao) Proxy.newProxyInstance(userDao.getClass().getClassLoader(), 
				userDao.getClass().getInterfaces(), this);
		return userDaoProxdy;
	}
	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		// TODO Auto-generated method stub
		if("save".equals(arg1.getName())) {
			//增强
			System.out.println("权限校验");
		}
		return arg1.invoke(userDao, arg2);
	}
}
