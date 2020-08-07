package com.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor{
	private CustomerDao customerDao;
	public CglibProxy(CustomerDao customerDao) {
		this.customerDao=customerDao;
	}
	/**
	 * ʹ��cglib�����������
	 */
	public CustomerDao createProxy() {
		//1,����cglib�õ����Ķ���
		Enhancer enhancer=new Enhancer();
		//2�����ø���
		enhancer.setSuperclass(customerDao.getClass());
		//3,���ûص�������invocateHandler����
		enhancer.setCallback(this);
		//�����������
		CustomerDao proxy=(CustomerDao) enhancer.create();
		return proxy;
	}
	@Override
	public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		// TODO Auto-generated method stub
		//�жϷ����Ƿ�Ϊsave
		if("save".equals(method.getName())) {
			//��ǿ
			System.out.println("Ȩ��У��===================");
		}
		return methodProxy.invokeSuper(proxy, args);
	}
	
	
}
