package com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * ������
 * @author 13696
 *
 */
public class MyAspectXML {
	//ǰ��֪ͨ
	public void checkPri(JoinPoint joinPonit) {
		System.out.println("Ȩ��У��======"+joinPonit);
	} 
	//����֪ͨ
	//a��xml����һ��
	public void writeLog(Object a) {
		System.out.println("��־��¼============="+a);
	}
	
	//���ܼ��
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		
		System.out.println("����֪ͨ============");
		Object obj=joinPoint.proceed();
		System.out.println("����֪ͨ============");
		return obj;

	}
	//�쳣�׳�֪ͨ
	public void afterThrowing(Throwable ex) {
		System.out.println("�쳣�׳�֪ͨ============"+ex.getMessage());
	}
	
	//����֪ͨ
	public void after() {
		System.out.println("����֪ͨ===============");
	}
}
