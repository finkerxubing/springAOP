package com.aop.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
	@Before(value="MyAspect.pointcut2()")
	public void before(){
		System.out.println("ǰ����ǿ===========");
	}
	// ����֪ͨ:
	@AfterReturning(value="MyAspect.pointcut4()",returning="result")
	public void afterReturning(Object result){
		System.out.println("������ǿ==========="+result);
	}
	// ����֪ͨ:
	@Around(value="MyAspect.pointcut3()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("����ǰ��ǿ==========");
		Object obj  = joinPoint.proceed();
		System.out.println("���ƺ���ǿ==========");
		return obj;
	}
	// �쳣�׳�֪ͨ:
	@AfterThrowing(value="MyAspect.pointcut1()",throwing="e")
	public void afterThrowing(Throwable e){
		System.out.println("�쳣�׳���ǿ========="+e.getMessage());
	}
	// ����֪ͨ
	@After(value="MyAspect.pointcut1()")
	public void after(){
		System.out.println("������ǿ============");
	}
	
	// �����ע�⣺
	@Pointcut(value="execution(* com.aop.anno.OrderDao.find(..))")
	private void pointcut1(){}
	@Pointcut(value="execution(* com.aop.anno.OrderDao.save(..))")
	private void pointcut2(){}
	@Pointcut(value="execution(* com.aop.anno.OrderDao.update(..))")
	private void pointcut3(){}
	@Pointcut(value="execution(* com.aop.anno.OrderDao.delete(..))")
	private void pointcut4(){}
	
}
