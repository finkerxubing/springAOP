package com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 切面类
 * @author 13696
 *
 */
public class MyAspectXML {
	//前置通知
	public void checkPri(JoinPoint joinPonit) {
		System.out.println("权限校验======"+joinPonit);
	} 
	//后置通知
	//a和xml里面一致
	public void writeLog(Object a) {
		System.out.println("日志记录============="+a);
	}
	
	//性能监控
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		
		System.out.println("环绕通知============");
		Object obj=joinPoint.proceed();
		System.out.println("环绕通知============");
		return obj;

	}
	//异常抛出通知
	public void afterThrowing(Throwable ex) {
		System.out.println("异常抛出通知============"+ex.getMessage());
	}
	
	//最终通知
	public void after() {
		System.out.println("最终通知===============");
	}
}
