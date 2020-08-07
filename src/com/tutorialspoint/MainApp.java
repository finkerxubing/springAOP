package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yiibai.common.Person;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=
				new ClassPathXmlApplicationContext(new String[] {"Beans.xml"}) ;
		Person obj=(Person) context.getBean("person");
		System.out.println(obj.toString());
//		obj.getMessage();
	}

}
